package models;

public class User {

	private String id;
	private String first_name;
	private String last_name;
	private BalanceSheet sheet;
	
	public User(String id, String first_name, String last_name, BalanceSheet sheet) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.sheet = sheet;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public BalanceSheet getSheet() {
		return sheet;
	}

	public void setSheet(BalanceSheet sheet) {
		this.sheet = sheet;
	}
	
}
