package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EqualSplit extends SplitTypeFactory {

	@Override
	public List<Split> createListOfSplit(Map<String, Double> expenseSplit, Double amount) {
		
		List<Split> splitList = new ArrayList<>();
		for(Map.Entry<String, Double> entry : expenseSplit.entrySet()) {
			Split obj =  new Split(entry.getKey(), entry.getValue());
			splitList.add(obj);
		}
		return splitList;
	}

	

}
