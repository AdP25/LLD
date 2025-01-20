package utils;

import java.util.Map;

import models.Group;

public class GroupTable {
	Map<String, Group>Groups;

	public void addGroupToTable(Group grp) {
		Groups.put(grp.getId(), grp);
	}

	public void deleteGroup(String id) {
		Groups.remove(id);
	}
	
	public Group getGroup(String id) {
		return Groups.get(id);
	}
	
	public Group updateGroup(String id, Group group) {
		Groups.put(id, group);
		return Groups.get(id);
	}

}
