package services;

import java.util.List;

import models.Expense;
import models.Group;
import models.User;
import utils.GroupTable;

public class GroupService {

	private GroupTable grpTable;
	
	public Group createGroup(String id, String name, List<User>users) {
		Group grp = new Group(id, name, users);
		grpTable.addGroupToTable(grp);
		return grp;
	}
	
	public void addUserToGroup(User user, String id) {
		Group grp = grpTable.getGroup(id);
		grp.getUserList().add(user);
		grpTable.updateGroup(id, grp);
		
	}
	
	public void addExpenseToGroup(String id, Expense exp) {
		Group grp = grpTable.getGroup(id);
		List<Expense>expList = grp.getGroupExpenses();
		expList.add(exp);
		grp.setGroupExpenses(expList);
		grpTable.updateGroup(id, grp);
	}
	
	
	
}
