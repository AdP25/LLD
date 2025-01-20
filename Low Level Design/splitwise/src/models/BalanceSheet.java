package models;

import java.util.Map;

public class BalanceSheet {
	
	private String id;
	private User user;
	private Map<User, Double>balanceReport;
	
	public BalanceSheet(String id, User user, Map<User, Double> balanceReport) {

		this.id = id;
		this.user = user;
		this.balanceReport = balanceReport;
	}
	
	

}
