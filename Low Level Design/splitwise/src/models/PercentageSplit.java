package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PercentageSplit extends SplitTypeFactory {

	
	@Override
	public List<Split> createListOfSplit(Map<String, Double> expenseSplit, Double amount) {
		List<Split> splitList = new ArrayList<>();
		
		for(Map.Entry<String, Double> entry : expenseSplit.entrySet()) {
			Split obj =  new Split();
			obj.setUserId(entry.getKey());
			double amt = (entry.getValue() * amount)/100;
			obj.setAmount(amt);
			
			splitList.add(obj);
		}
		return splitList;
	}
	

}
