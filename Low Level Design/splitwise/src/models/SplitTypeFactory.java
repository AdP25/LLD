package models;

import java.util.List;
import java.util.Map;

public abstract class SplitTypeFactory {
	
	public abstract List<Split>createListOfSplit (Map<String, Double>expenseSplit, Double amount);
}
