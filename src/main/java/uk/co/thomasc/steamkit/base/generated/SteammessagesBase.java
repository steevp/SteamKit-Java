// Generated by the protocol buffer compiler.  DO NOT EDIT!

package uk.co.thomasc.steamkit.base.generated;

@SuppressWarnings("hiding")
public interface SteammessagesBase {

  // extend .google.protobuf.MessageOptions {
  //   optional int32 msgpool_soft_limit = 50000 [default = 32];
  public static final com.google.protobuf.nano.Extension<
      com.google.protobuf.nano.DescriptorProtos.MessageOptions,
      Integer> msgpoolSoftLimit =
          com.google.protobuf.nano.Extension.createPrimitiveTyped(
              com.google.protobuf.nano.Extension.TYPE_INT32,
              Integer.class,
              400000L);

  // extend .google.protobuf.MessageOptions {
  //   optional int32 msgpool_hard_limit = 50001 [default = 384];
  public static final com.google.protobuf.nano.Extension<
      com.google.protobuf.nano.DescriptorProtos.MessageOptions,
      Integer> msgpoolHardLimit =
          com.google.protobuf.nano.Extension.createPrimitiveTyped(
              com.google.protobuf.nano.Extension.TYPE_INT32,
              Integer.class,
              400008L);

  public static final class CMsgProtoBufHeader extends
      com.google.protobuf.nano.ExtendableMessageNano<CMsgProtoBufHeader> {

    private static volatile CMsgProtoBufHeader[] _emptyArray;
    public static CMsgProtoBufHeader[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new CMsgProtoBufHeader[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional fixed64 steamid = 1;
    public long steamid;

    // optional int32 client_sessionid = 2;
    public int clientSessionid;

    // optional uint32 routing_appid = 3;
    public int routingAppid;

    // optional fixed64 jobid_source = 10 [default = 18446744073709551615];
    public long jobidSource;

    // optional fixed64 jobid_target = 11 [default = 18446744073709551615];
    public long jobidTarget;

    // optional string target_job_name = 12;
    public String targetJobName;

    // optional int32 seq_num = 24;
    public int seqNum;

    // optional int32 eresult = 13 [default = 2];
    public int eresult;

    // optional string error_message = 14;
    public String errorMessage;

    // optional uint32 ip = 15;
    public int ip;

    // optional uint32 auth_account_flags = 16;
    public int authAccountFlags;

    // optional uint32 token_source = 22;
    public int tokenSource;

    // optional bool admin_spoofing_user = 23;
    public boolean adminSpoofingUser;

    // optional int32 transport_error = 17 [default = 1];
    public int transportError;

    // optional uint64 messageid = 18 [default = 18446744073709551615];
    public long messageid;

    // optional uint32 publisher_group_id = 19;
    public int publisherGroupId;

    // optional uint32 sysid = 20;
    public int sysid;

    // optional uint64 trace_tag = 21;
    public long traceTag;

    // optional uint32 webapi_key_id = 25;
    public int webapiKeyId;

    public CMsgProtoBufHeader() {
      clear();
    }

    public CMsgProtoBufHeader clear() {
      steamid = 0L;
      clientSessionid = 0;
      routingAppid = 0;
      jobidSource = -1L;
      jobidTarget = -1L;
      targetJobName = "";
      seqNum = 0;
      eresult = 2;
      errorMessage = "";
      ip = 0;
      authAccountFlags = 0;
      tokenSource = 0;
      adminSpoofingUser = false;
      transportError = 1;
      messageid = -1L;
      publisherGroupId = 0;
      sysid = 0;
      traceTag = 0L;
      webapiKeyId = 0;
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.steamid != 0L) {
        output.writeFixed64(1, this.steamid);
      }
      if (this.clientSessionid != 0) {
        output.writeInt32(2, this.clientSessionid);
      }
      if (this.routingAppid != 0) {
        output.writeUInt32(3, this.routingAppid);
      }
      if (this.jobidSource != -1L) {
        output.writeFixed64(10, this.jobidSource);
      }
      if (this.jobidTarget != -1L) {
        output.writeFixed64(11, this.jobidTarget);
      }
      if (!this.targetJobName.equals("")) {
        output.writeString(12, this.targetJobName);
      }
      if (this.eresult != 2) {
        output.writeInt32(13, this.eresult);
      }
      if (!this.errorMessage.equals("")) {
        output.writeString(14, this.errorMessage);
      }
      if (this.ip != 0) {
        output.writeUInt32(15, this.ip);
      }
      if (this.authAccountFlags != 0) {
        output.writeUInt32(16, this.authAccountFlags);
      }
      if (this.transportError != 1) {
        output.writeInt32(17, this.transportError);
      }
      if (this.messageid != -1L) {
        output.writeUInt64(18, this.messageid);
      }
      if (this.publisherGroupId != 0) {
        output.writeUInt32(19, this.publisherGroupId);
      }
      if (this.sysid != 0) {
        output.writeUInt32(20, this.sysid);
      }
      if (this.traceTag != 0L) {
        output.writeUInt64(21, this.traceTag);
      }
      if (this.tokenSource != 0) {
        output.writeUInt32(22, this.tokenSource);
      }
      if (this.adminSpoofingUser != false) {
        output.writeBool(23, this.adminSpoofingUser);
      }
      if (this.seqNum != 0) {
        output.writeInt32(24, this.seqNum);
      }
      if (this.webapiKeyId != 0) {
        output.writeUInt32(25, this.webapiKeyId);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.steamid != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeFixed64Size(1, this.steamid);
      }
      if (this.clientSessionid != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(2, this.clientSessionid);
      }
      if (this.routingAppid != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(3, this.routingAppid);
      }
      if (this.jobidSource != -1L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeFixed64Size(10, this.jobidSource);
      }
      if (this.jobidTarget != -1L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeFixed64Size(11, this.jobidTarget);
      }
      if (!this.targetJobName.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(12, this.targetJobName);
      }
      if (this.eresult != 2) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(13, this.eresult);
      }
      if (!this.errorMessage.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(14, this.errorMessage);
      }
      if (this.ip != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(15, this.ip);
      }
      if (this.authAccountFlags != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(16, this.authAccountFlags);
      }
      if (this.transportError != 1) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(17, this.transportError);
      }
      if (this.messageid != -1L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt64Size(18, this.messageid);
      }
      if (this.publisherGroupId != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(19, this.publisherGroupId);
      }
      if (this.sysid != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(20, this.sysid);
      }
      if (this.traceTag != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt64Size(21, this.traceTag);
      }
      if (this.tokenSource != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(22, this.tokenSource);
      }
      if (this.adminSpoofingUser != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(23, this.adminSpoofingUser);
      }
      if (this.seqNum != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(24, this.seqNum);
      }
      if (this.webapiKeyId != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(25, this.webapiKeyId);
      }
      return size;
    }

    @Override
    public CMsgProtoBufHeader mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 9: {
            this.steamid = input.readFixed64();
            break;
          }
          case 16: {
            this.clientSessionid = input.readInt32();
            break;
          }
          case 24: {
            this.routingAppid = input.readUInt32();
            break;
          }
          case 81: {
            this.jobidSource = input.readFixed64();
            break;
          }
          case 89: {
            this.jobidTarget = input.readFixed64();
            break;
          }
          case 98: {
            this.targetJobName = input.readString();
            break;
          }
          case 104: {
            this.eresult = input.readInt32();
            break;
          }
          case 114: {
            this.errorMessage = input.readString();
            break;
          }
          case 120: {
            this.ip = input.readUInt32();
            break;
          }
          case 128: {
            this.authAccountFlags = input.readUInt32();
            break;
          }
          case 136: {
            this.transportError = input.readInt32();
            break;
          }
          case 144: {
            this.messageid = input.readUInt64();
            break;
          }
          case 152: {
            this.publisherGroupId = input.readUInt32();
            break;
          }
          case 160: {
            this.sysid = input.readUInt32();
            break;
          }
          case 168: {
            this.traceTag = input.readUInt64();
            break;
          }
          case 176: {
            this.tokenSource = input.readUInt32();
            break;
          }
          case 184: {
            this.adminSpoofingUser = input.readBool();
            break;
          }
          case 192: {
            this.seqNum = input.readInt32();
            break;
          }
          case 200: {
            this.webapiKeyId = input.readUInt32();
            break;
          }
        }
      }
    }

    public static CMsgProtoBufHeader parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new CMsgProtoBufHeader(), data);
    }

    public static CMsgProtoBufHeader parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new CMsgProtoBufHeader().mergeFrom(input);
    }
  }

  public static final class CMsgMulti extends
      com.google.protobuf.nano.ExtendableMessageNano<CMsgMulti> {

    private static volatile CMsgMulti[] _emptyArray;
    public static CMsgMulti[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new CMsgMulti[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional uint32 size_unzipped = 1;
    public int sizeUnzipped;

    // optional bytes message_body = 2;
    public byte[] messageBody;

    public CMsgMulti() {
      clear();
    }

    public CMsgMulti clear() {
      sizeUnzipped = 0;
      messageBody = com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES;
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.sizeUnzipped != 0) {
        output.writeUInt32(1, this.sizeUnzipped);
      }
      if (!java.util.Arrays.equals(this.messageBody, com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
        output.writeBytes(2, this.messageBody);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.sizeUnzipped != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(1, this.sizeUnzipped);
      }
      if (!java.util.Arrays.equals(this.messageBody, com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBytesSize(2, this.messageBody);
      }
      return size;
    }

    @Override
    public CMsgMulti mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.sizeUnzipped = input.readUInt32();
            break;
          }
          case 18: {
            this.messageBody = input.readBytes();
            break;
          }
        }
      }
    }

    public static CMsgMulti parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new CMsgMulti(), data);
    }

    public static CMsgMulti parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new CMsgMulti().mergeFrom(input);
    }
  }

  public static final class CMsgProtobufWrapped extends
      com.google.protobuf.nano.ExtendableMessageNano<CMsgProtobufWrapped> {

    private static volatile CMsgProtobufWrapped[] _emptyArray;
    public static CMsgProtobufWrapped[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new CMsgProtobufWrapped[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional bytes message_body = 1;
    public byte[] messageBody;

    public CMsgProtobufWrapped() {
      clear();
    }

    public CMsgProtobufWrapped clear() {
      messageBody = com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES;
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (!java.util.Arrays.equals(this.messageBody, com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
        output.writeBytes(1, this.messageBody);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (!java.util.Arrays.equals(this.messageBody, com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBytesSize(1, this.messageBody);
      }
      return size;
    }

    @Override
    public CMsgProtobufWrapped mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            this.messageBody = input.readBytes();
            break;
          }
        }
      }
    }

    public static CMsgProtobufWrapped parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new CMsgProtobufWrapped(), data);
    }

    public static CMsgProtobufWrapped parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new CMsgProtobufWrapped().mergeFrom(input);
    }
  }

  public static final class CMsgAuthTicket extends
      com.google.protobuf.nano.ExtendableMessageNano<CMsgAuthTicket> {

    private static volatile CMsgAuthTicket[] _emptyArray;
    public static CMsgAuthTicket[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new CMsgAuthTicket[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional uint32 estate = 1;
    public int estate;

    // optional uint32 eresult = 2 [default = 2];
    public int eresult;

    // optional fixed64 steamid = 3;
    public long steamid;

    // optional fixed64 gameid = 4;
    public long gameid;

    // optional uint32 h_steam_pipe = 5;
    public int hSteamPipe;

    // optional uint32 ticket_crc = 6;
    public int ticketCrc;

    // optional bytes ticket = 7;
    public byte[] ticket;

    public CMsgAuthTicket() {
      clear();
    }

    public CMsgAuthTicket clear() {
      estate = 0;
      eresult = 2;
      steamid = 0L;
      gameid = 0L;
      hSteamPipe = 0;
      ticketCrc = 0;
      ticket = com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES;
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.estate != 0) {
        output.writeUInt32(1, this.estate);
      }
      if (this.eresult != 2) {
        output.writeUInt32(2, this.eresult);
      }
      if (this.steamid != 0L) {
        output.writeFixed64(3, this.steamid);
      }
      if (this.gameid != 0L) {
        output.writeFixed64(4, this.gameid);
      }
      if (this.hSteamPipe != 0) {
        output.writeUInt32(5, this.hSteamPipe);
      }
      if (this.ticketCrc != 0) {
        output.writeUInt32(6, this.ticketCrc);
      }
      if (!java.util.Arrays.equals(this.ticket, com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
        output.writeBytes(7, this.ticket);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.estate != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(1, this.estate);
      }
      if (this.eresult != 2) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(2, this.eresult);
      }
      if (this.steamid != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeFixed64Size(3, this.steamid);
      }
      if (this.gameid != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeFixed64Size(4, this.gameid);
      }
      if (this.hSteamPipe != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(5, this.hSteamPipe);
      }
      if (this.ticketCrc != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(6, this.ticketCrc);
      }
      if (!java.util.Arrays.equals(this.ticket, com.google.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBytesSize(7, this.ticket);
      }
      return size;
    }

    @Override
    public CMsgAuthTicket mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.estate = input.readUInt32();
            break;
          }
          case 16: {
            this.eresult = input.readUInt32();
            break;
          }
          case 25: {
            this.steamid = input.readFixed64();
            break;
          }
          case 33: {
            this.gameid = input.readFixed64();
            break;
          }
          case 40: {
            this.hSteamPipe = input.readUInt32();
            break;
          }
          case 48: {
            this.ticketCrc = input.readUInt32();
            break;
          }
          case 58: {
            this.ticket = input.readBytes();
            break;
          }
        }
      }
    }

    public static CMsgAuthTicket parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new CMsgAuthTicket(), data);
    }

    public static CMsgAuthTicket parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new CMsgAuthTicket().mergeFrom(input);
    }
  }

  public static final class CCDDBAppDetailCommon extends
      com.google.protobuf.nano.ExtendableMessageNano<CCDDBAppDetailCommon> {

    private static volatile CCDDBAppDetailCommon[] _emptyArray;
    public static CCDDBAppDetailCommon[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new CCDDBAppDetailCommon[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional uint32 appid = 1;
    public int appid;

    // optional string name = 2;
    public String name;

    // optional string icon = 3;
    public String icon;

    // optional string logo = 4;
    public String logo;

    // optional string logo_small = 5;
    public String logoSmall;

    // optional bool tool = 6;
    public boolean tool;

    // optional bool demo = 7;
    public boolean demo;

    // optional bool media = 8;
    public boolean media;

    // optional bool community_visible_stats = 9;
    public boolean communityVisibleStats;

    // optional string friendly_name = 10;
    public String friendlyName;

    // optional string propagation = 11;
    public String propagation;

    // optional bool has_adult_content = 12;
    public boolean hasAdultContent;

    public CCDDBAppDetailCommon() {
      clear();
    }

    public CCDDBAppDetailCommon clear() {
      appid = 0;
      name = "";
      icon = "";
      logo = "";
      logoSmall = "";
      tool = false;
      demo = false;
      media = false;
      communityVisibleStats = false;
      friendlyName = "";
      propagation = "";
      hasAdultContent = false;
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.appid != 0) {
        output.writeUInt32(1, this.appid);
      }
      if (!this.name.equals("")) {
        output.writeString(2, this.name);
      }
      if (!this.icon.equals("")) {
        output.writeString(3, this.icon);
      }
      if (!this.logo.equals("")) {
        output.writeString(4, this.logo);
      }
      if (!this.logoSmall.equals("")) {
        output.writeString(5, this.logoSmall);
      }
      if (this.tool != false) {
        output.writeBool(6, this.tool);
      }
      if (this.demo != false) {
        output.writeBool(7, this.demo);
      }
      if (this.media != false) {
        output.writeBool(8, this.media);
      }
      if (this.communityVisibleStats != false) {
        output.writeBool(9, this.communityVisibleStats);
      }
      if (!this.friendlyName.equals("")) {
        output.writeString(10, this.friendlyName);
      }
      if (!this.propagation.equals("")) {
        output.writeString(11, this.propagation);
      }
      if (this.hasAdultContent != false) {
        output.writeBool(12, this.hasAdultContent);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.appid != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt32Size(1, this.appid);
      }
      if (!this.name.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(2, this.name);
      }
      if (!this.icon.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(3, this.icon);
      }
      if (!this.logo.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(4, this.logo);
      }
      if (!this.logoSmall.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(5, this.logoSmall);
      }
      if (this.tool != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(6, this.tool);
      }
      if (this.demo != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(7, this.demo);
      }
      if (this.media != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(8, this.media);
      }
      if (this.communityVisibleStats != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(9, this.communityVisibleStats);
      }
      if (!this.friendlyName.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(10, this.friendlyName);
      }
      if (!this.propagation.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(11, this.propagation);
      }
      if (this.hasAdultContent != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(12, this.hasAdultContent);
      }
      return size;
    }

    @Override
    public CCDDBAppDetailCommon mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.appid = input.readUInt32();
            break;
          }
          case 18: {
            this.name = input.readString();
            break;
          }
          case 26: {
            this.icon = input.readString();
            break;
          }
          case 34: {
            this.logo = input.readString();
            break;
          }
          case 42: {
            this.logoSmall = input.readString();
            break;
          }
          case 48: {
            this.tool = input.readBool();
            break;
          }
          case 56: {
            this.demo = input.readBool();
            break;
          }
          case 64: {
            this.media = input.readBool();
            break;
          }
          case 72: {
            this.communityVisibleStats = input.readBool();
            break;
          }
          case 82: {
            this.friendlyName = input.readString();
            break;
          }
          case 90: {
            this.propagation = input.readString();
            break;
          }
          case 96: {
            this.hasAdultContent = input.readBool();
            break;
          }
        }
      }
    }

    public static CCDDBAppDetailCommon parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new CCDDBAppDetailCommon(), data);
    }

    public static CCDDBAppDetailCommon parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new CCDDBAppDetailCommon().mergeFrom(input);
    }
  }

  public static final class CMsgAppRights extends
      com.google.protobuf.nano.ExtendableMessageNano<CMsgAppRights> {

    private static volatile CMsgAppRights[] _emptyArray;
    public static CMsgAppRights[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new CMsgAppRights[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional bool edit_info = 1;
    public boolean editInfo;

    // optional bool publish = 2;
    public boolean publish;

    // optional bool view_error_data = 3;
    public boolean viewErrorData;

    // optional bool download = 4;
    public boolean download;

    // optional bool upload_cdkeys = 5;
    public boolean uploadCdkeys;

    // optional bool generate_cdkeys = 6;
    public boolean generateCdkeys;

    // optional bool view_financials = 7;
    public boolean viewFinancials;

    // optional bool manage_ceg = 8;
    public boolean manageCeg;

    // optional bool manage_signing = 9;
    public boolean manageSigning;

    // optional bool manage_cdkeys = 10;
    public boolean manageCdkeys;

    // optional bool edit_marketing = 11;
    public boolean editMarketing;

    // optional bool economy_support = 12;
    public boolean economySupport;

    // optional bool economy_support_supervisor = 13;
    public boolean economySupportSupervisor;

    // optional bool manage_pricing = 14;
    public boolean managePricing;

    // optional bool broadcast_live = 15;
    public boolean broadcastLive;

    public CMsgAppRights() {
      clear();
    }

    public CMsgAppRights clear() {
      editInfo = false;
      publish = false;
      viewErrorData = false;
      download = false;
      uploadCdkeys = false;
      generateCdkeys = false;
      viewFinancials = false;
      manageCeg = false;
      manageSigning = false;
      manageCdkeys = false;
      editMarketing = false;
      economySupport = false;
      economySupportSupervisor = false;
      managePricing = false;
      broadcastLive = false;
      unknownFieldData = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.editInfo != false) {
        output.writeBool(1, this.editInfo);
      }
      if (this.publish != false) {
        output.writeBool(2, this.publish);
      }
      if (this.viewErrorData != false) {
        output.writeBool(3, this.viewErrorData);
      }
      if (this.download != false) {
        output.writeBool(4, this.download);
      }
      if (this.uploadCdkeys != false) {
        output.writeBool(5, this.uploadCdkeys);
      }
      if (this.generateCdkeys != false) {
        output.writeBool(6, this.generateCdkeys);
      }
      if (this.viewFinancials != false) {
        output.writeBool(7, this.viewFinancials);
      }
      if (this.manageCeg != false) {
        output.writeBool(8, this.manageCeg);
      }
      if (this.manageSigning != false) {
        output.writeBool(9, this.manageSigning);
      }
      if (this.manageCdkeys != false) {
        output.writeBool(10, this.manageCdkeys);
      }
      if (this.editMarketing != false) {
        output.writeBool(11, this.editMarketing);
      }
      if (this.economySupport != false) {
        output.writeBool(12, this.economySupport);
      }
      if (this.economySupportSupervisor != false) {
        output.writeBool(13, this.economySupportSupervisor);
      }
      if (this.managePricing != false) {
        output.writeBool(14, this.managePricing);
      }
      if (this.broadcastLive != false) {
        output.writeBool(15, this.broadcastLive);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.editInfo != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(1, this.editInfo);
      }
      if (this.publish != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(2, this.publish);
      }
      if (this.viewErrorData != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(3, this.viewErrorData);
      }
      if (this.download != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(4, this.download);
      }
      if (this.uploadCdkeys != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(5, this.uploadCdkeys);
      }
      if (this.generateCdkeys != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(6, this.generateCdkeys);
      }
      if (this.viewFinancials != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(7, this.viewFinancials);
      }
      if (this.manageCeg != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(8, this.manageCeg);
      }
      if (this.manageSigning != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(9, this.manageSigning);
      }
      if (this.manageCdkeys != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(10, this.manageCdkeys);
      }
      if (this.editMarketing != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(11, this.editMarketing);
      }
      if (this.economySupport != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(12, this.economySupport);
      }
      if (this.economySupportSupervisor != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(13, this.economySupportSupervisor);
      }
      if (this.managePricing != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(14, this.managePricing);
      }
      if (this.broadcastLive != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(15, this.broadcastLive);
      }
      return size;
    }

    @Override
    public CMsgAppRights mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!storeUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            this.editInfo = input.readBool();
            break;
          }
          case 16: {
            this.publish = input.readBool();
            break;
          }
          case 24: {
            this.viewErrorData = input.readBool();
            break;
          }
          case 32: {
            this.download = input.readBool();
            break;
          }
          case 40: {
            this.uploadCdkeys = input.readBool();
            break;
          }
          case 48: {
            this.generateCdkeys = input.readBool();
            break;
          }
          case 56: {
            this.viewFinancials = input.readBool();
            break;
          }
          case 64: {
            this.manageCeg = input.readBool();
            break;
          }
          case 72: {
            this.manageSigning = input.readBool();
            break;
          }
          case 80: {
            this.manageCdkeys = input.readBool();
            break;
          }
          case 88: {
            this.editMarketing = input.readBool();
            break;
          }
          case 96: {
            this.economySupport = input.readBool();
            break;
          }
          case 104: {
            this.economySupportSupervisor = input.readBool();
            break;
          }
          case 112: {
            this.managePricing = input.readBool();
            break;
          }
          case 120: {
            this.broadcastLive = input.readBool();
            break;
          }
        }
      }
    }

    public static CMsgAppRights parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new CMsgAppRights(), data);
    }

    public static CMsgAppRights parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new CMsgAppRights().mergeFrom(input);
    }
  }
}
