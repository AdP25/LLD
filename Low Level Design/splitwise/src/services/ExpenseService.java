package services;

import java.util.List;
import java.util.Map;

import models.EqualSplit;
import models.Expense;
import models.PercentageSplit;
import models.Split;
import models.SplitTypeFactory;
import models.UnequalSplit;

public class ExpenseService {

	private SplitTypeFactory splitTypeFactory;
	private GroupService groupService;
	private BalanceSheetService balanceSheetService;
	
	
	public Expense addExpense(String id, Boolean isSettled, double amount, String paidByUserId, Map<String, Double> expenseSplit,
			String type, String groupId) {
		
		
		// create split object a/c to type
		if(type == "EQUAL") {
			splitTypeFactory = new EqualSplit();
		} else if(type == "UNEQUAL") {
			splitTypeFactory = new UnequalSplit();
		} else if(type == "PERCENTAGE") {
			splitTypeFactory = new PercentageSplit();
		}
		List<Split>splitList = splitTypeFactory.createListOfSplit(expenseSplit, amount);
		
		Expense exp = new Expense(id, isSettled, amount, paidByUserId, splitList, type, groupId);
		groupService.addExpenseToGroup(groupId, exp);
		
		// update balance sheet
		
		
		
		return exp;
		
	}
}
