package utils;

import java.util.Map;

import models.User;

public class UserTable {

	Map<String, User>Users;
	
	public void addUserToTable(User user) {
		Users.put(user.getId(), user);
	}

	public void deleteUser(String id) {
		Users.remove(id);
	}
	
	public User getUser(String id) {
		return Users.get(id);
	}
}
