package uk.co.thomasc.steamkit.networking.steam3;

import uk.co.thomasc.steamkit.base.IClientMsg;
import uk.co.thomasc.steamkit.util.cSharp.events.EventArgs;
import uk.co.thomasc.steamkit.util.cSharp.ip.IPEndPoint;
import uk.co.thomasc.steamkit.util.logging.DebugLog;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpConnection extends Connection {
    final static int MAGIC = 0x31305456; // "VT01"

    boolean isConnected;

    Socket sock;

    BinaryReader netReader;
    BinaryWriter netWriter;

    Thread netThread;

    private final Object lock = new Object();

    /**
     * Connects to the specified end point.
     *
     * @param endPoint
     *            The end point.
     */
    @Override
    public void connect(IPEndPoint endPoint) {
        // if we're connected, disconnect
        disconnect();

        DebugLog.writeLine("TcpConnection", "Connecting to %s...", endPoint);
        Socket socket = null;
        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress(endPoint.getIpAddress(), endPoint.getPort()), 15000); // 15 second timeout
        } catch (final IOException e) {
            DebugLog.writeLine("TcpConnection", "Error connecting (1): %s", e);
        }

        try {
            connectCompleted(socket);
        } catch (final IOException e) {
            DebugLog.writeLine("TcpConnection", "Error connecting (2): %s", e);
        }
    }

    void connectCompleted(Socket socket) throws IOException {

        sock = socket;

        if (sock == null || !sock.isConnected()) {
            onDisconnected(false);
            return;
        }

        DebugLog.writeLine("TcpConnection", "Connected!");

        isConnected = true;

        netReader = new BinaryReader(sock.getInputStream());
        netWriter = new BinaryWriter(sock.getOutputStream());

        // initialize our network thread
        netThread = new Thread(new NetLoop());
        netThread.setName("TcpConnection Thread");
        netThread.start();

        onConnected(EventArgs.Empty);
    }

    /**
     * Disconnects this instance.
     */
    @Override
    public void disconnect() {
        if (!isConnected) {
            return;
        }

        isConnected = false;

        // wait for our network thread to terminate
        try {
            netThread.join();
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }

        netThread = null;

        cleanup();

        onDisconnected(true);
    }

    /**
     * Sends the specified client net message.
     *
     * @param clientMsg
     *            The client net message.
     * @throws IOException
     */
    @Override
    public void send(IClientMsg clientMsg) {
        try {
            if (!isConnected) {
                DebugLog.writeLine("TcpConnection", "Attempting to send client message when not connected: %s", clientMsg.getMsgType());
                return;
            }

            byte[] data = clientMsg.serialize();

            // encrypt outgoing traffic if we need to
            if (netFilter != null) {
                data = netFilter.processOutgoing(data);
            }

            synchronized (lock) {
                // write header
                netWriter.write(data.length);
                netWriter.write(TcpConnection.MAGIC);

                netWriter.write(data);

                netWriter.flush();
            }
        } catch (final IOException ex) {
            DebugLog.writeLine("TcpConnection", "Socket exception occurred while writing packet: %s", ex);

            // signal that our connection is dead
            isConnected = false;

            cleanup();

            onDisconnected(false);
            return;
        }
    }

    class NetLoop implements Runnable {
        /**
         * Nets the loop.
         */
        @Override
        public void run() {
            // poll for readable data every 100ms
            //final int POLL_MS = 100;

            while (true) {
                try {
                    Thread.sleep(100);
                } catch (final InterruptedException e1) {
                    e1.printStackTrace();
                }

                if (!isConnected) {
                    break;
                }

                boolean canRead = false;
                try {
                    canRead = !netReader.isAtEnd();
                } catch (final IOException e) {
                    e.printStackTrace();
                }

                if (!canRead) {
                    // nothing to read yet
                    continue;
                }

                // read the packet off the network
                readPacket();
            }
        }
    }

    void readPacket() {
        // the tcp packet header is considerably less complex than the udp one
        // it only consists of the packet length, followed by the "VT01" magic
        int packetLen = 0;
        int packetMagic = 0;

        byte[] packData = null;

        try {
            try {
                packetLen = netReader.readInt();
                packetMagic = netReader.readInt();
            } catch (final IOException ex) {
                throw new IOException("Connection lost while reading packet header.", ex);
            }

            if (packetMagic != TcpConnection.MAGIC) {
                throw new IOException("Got a packet with invalid magic!");
            }

            // rest of the packet is the physical data
            packData = netReader.readBytes(packetLen);

            if (packData.length != packetLen) {
                throw new IOException("Connection lost while reading packet payload");
            }

            // decrypt the data off the wire if needed
            if (netFilter != null) {
                packData = netFilter.processIncoming(packData);
                if (packData.length == 0) {
                    throw new IOException("Decrypted packet size is zero");
                }
            }
            
        } catch (final IOException ex) {
            DebugLog.writeLine("TcpConnection", "Socket exception occurred while reading packet: %s", ex);

            // signal that our connection is dead
            isConnected = false;

            cleanup();

            onDisconnected(false);
            return;
        }

        if (sock != null) {
            onNetMsgReceived(new NetMsgEventArgs(packData, new IPEndPoint(sock.getInetAddress().getHostAddress(), sock.getPort())));
        }
    }

    void cleanup() {
        if (sock != null) {
            // cleanup socket
            try {
                if (sock.isConnected()) {
                    sock.shutdownInput();
                    sock.shutdownOutput();
                }
                sock.close();
            } catch (final IOException e) {
                e.printStackTrace();
            }

            sock = null;
        }
    }

    @Override
    public InetAddress getLocalIP() {
        if (sock == null) {
            try {
                return InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } // Return a InetAddress. The request will fail anyway so it doesn't matter
        }
        return sock.getLocalAddress();
    }
}
