package snakeandladder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

	private String id;
	
	private int size;
	
	private Map<Integer, Integer> snakesMap;
	
	private Map<Integer, Integer> laddersMap;
	
	public Board(String id, int size, List<Snake>snakes, List<Ladder>ladders) {
		
		this.id = id;
		this.size = size;
		this.snakesMap = new HashMap<>();
		this.laddersMap = new HashMap<>();
		
		for(Snake snake : snakes) {
			snakesMap.put(snake.getHead(), snake.getTail());
		}
		for(Ladder ladder : ladders) {
			laddersMap.put(ladder.getStart(), ladder.getEnd());
		}
		
	}
	
	public int getSize() {
		return this.size;
	}


	int getPosition(int num) {
		
		// check if snake
		if(snakesMap.containsKey(num)) {
			return snakesMap.get(num);
		}
		
		// check if ladder
		if(laddersMap.containsKey(num)) {
			return laddersMap.get(num);
		}

		//normal step
		return num;
	}
}
