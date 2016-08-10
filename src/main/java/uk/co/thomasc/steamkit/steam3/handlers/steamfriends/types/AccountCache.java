// Generated by delombok at Wed Jun 15 22:04:52 CDT 2016
package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types;

import uk.co.thomasc.steamkit.types.steamid.SteamID;

public class AccountCache {
	private final User localUser;
	private final AccountList<User> users;
	private final AccountList<Clan> clans;

	public AccountCache() {
		localUser = new User();
		localUser.name = "[unassigned]";
		users = new AccountList<User>(User.class);
		clans = new AccountList<Clan>(Clan.class);
	}

	public User getUser(SteamID steamId) {
		if (isLocalUser(steamId)) {
			return localUser;
		} else {
			return users.getAccount(steamId);
		}
	}

	public boolean isLocalUser(SteamID steamId) {
		return localUser.steamId == steamId;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public User getLocalUser() {
		return this.localUser;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public AccountList<User> getUsers() {
		return this.users;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public AccountList<Clan> getClans() {
		return this.clans;
	}
}
