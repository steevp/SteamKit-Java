// Generated by delombok at Wed Jun 15 22:04:53 CDT 2016
package uk.co.thomasc.steamkit.steam3.handlers.steamtrading.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgTrading_InitiateTradeRequest;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.steamid.SteamID;

/**
 * This callback is fired when this client receives a trade proposal.
 */
public final class TradeProposedCallback extends CallbackMsg {
	/**
	 * Gets the Trade ID of his proposal, used for replying.
	 */
	private final int tradeID;
	/**
	 * Gets the SteamID of the client that sent the proposal.
	 */
	private final SteamID otherClient;
	/**
	 * Gets the persona name of the client that sent the proposal.
	 */
	private final String otherName;

	public TradeProposedCallback(CMsgTrading_InitiateTradeRequest msg) {
		tradeID = msg.tradeRequestId;
		otherClient = new SteamID(msg.otherSteamid);
		otherName = msg.otherName;
	}

	/**
	 * Gets the Trade ID of his proposal, used for replying.
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getTradeID() {
		return this.tradeID;
	}

	/**
	 * Gets the SteamID of the client that sent the proposal.
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public SteamID getOtherClient() {
		return this.otherClient;
	}

	/**
	 * Gets the persona name of the client that sent the proposal.
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getOtherName() {
		return this.otherName;
	}
}
