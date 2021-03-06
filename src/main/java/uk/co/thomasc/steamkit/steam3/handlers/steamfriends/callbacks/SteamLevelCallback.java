package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientFSGetFriendsSteamLevelsResponse;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientFSGetFriendsSteamLevelsResponse.Friend;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EAccountType;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EUniverse;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.steamid.SteamID;

import java.util.HashMap;
import java.util.Map;

/**
 * This callback is fired in response to requesting a users's steam level
 */
public final class SteamLevelCallback extends CallbackMsg {
    /**
     * Map of ID --> Level
     */
    private final Map<SteamID, Integer> levelMap;

    public SteamLevelCallback(CMsgClientFSGetFriendsSteamLevelsResponse response) {
        levelMap = new HashMap<SteamID, Integer>();
        for (Friend friend : response.friends) {
            levelMap.put(new SteamID(friend.accountid, EUniverse.Public, EAccountType.Individual), friend.level);
        }
    }

    /**
     * Map of ID --> Level
     */
    public Map<SteamID, Integer> getLevelMap() {
        return this.levelMap;
    }
}
