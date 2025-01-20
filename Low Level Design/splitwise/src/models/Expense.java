package models;

import java.util.List;

public class Expense {

	private String id;
	private Boolean isSettled = false;
	private double amount;
	private String paidByUserId;
	private List<Split> expenseSplit;
	private String type;
	private String groupId;
	
	public Expense(String id, Boolean isSettled, double amount, String paidByUserId, List<Split> expenseSplit,
			String type, String groupId) {

		this.id = id;
		this.isSettled = isSettled;
		this.amount = amount;
		this.paidByUserId = paidByUserId;
		this.expenseSplit = expenseSplit;
		this.type = type;
		this.groupId = groupId;
	}
	
}
