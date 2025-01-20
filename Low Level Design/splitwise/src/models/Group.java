package models;

import java.util.List;

public class Group {
	
	private String id;
	private String name;
	private List<User>userList;
	private List<Expense>groupExpenses;
	
	public Group(String id, String name, List<User>users) {
		this.id = id;
		this.name = name;
		this.userList = users;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<Expense> getGroupExpenses() {
		return groupExpenses;
	}

	public void setGroupExpenses(List<Expense> groupExpenses) {
		this.groupExpenses = groupExpenses;
	}
	
}
