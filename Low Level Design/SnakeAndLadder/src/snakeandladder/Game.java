package snakeandladder;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;


public class Game {
	
	private String id;
	private Board board;
	private Dice dice;
	private Queue<SimpleEntry<Player, Integer>> playerPositions;
	private ReentrantLock lock;
	
	public Game (String id, Board board, Dice dice){
		this.id = id;
		this.board = board;
		this.dice = dice;
		this.playerPositions = new ConcurrentLinkedQueue<>();
		this.lock = new ReentrantLock();
	}
	
	public void addPlayers(List<Player>players) {
		for(Player player : players) {
			this.playerPositions.add(new SimpleEntry<>(player, 0));
		}
	}
	
	public void startGame() {
		
		int finalNum = board.getSize();
		
		while(playerPositions.size() > 1) {
			
			// pop first player from queue
			SimpleEntry<Player, Integer>playerEntry = playerPositions.poll();
			
			lock.lock(); // Ensure thread safety for dice roll and position update
            try {
            	// roll the dice
    			int diceNum = dice.roll();
    			
    			// get new position
    			int newPosition = board.getPosition(playerEntry.getValue() + diceNum);
    			
    			if(newPosition == finalNum) {
    				System.out.println("Game won by " + playerEntry.getKey().getName());
    				continue;
    				
    			}
    			// out of bounds
    			if(newPosition > finalNum) {
    				newPosition = playerEntry.getValue();
    			}
    			// put player's new position in queue
    			playerEntry.setValue(newPosition);
    			playerPositions.add(playerEntry);
    			
            } finally {
                lock.unlock(); // Ensure the lock is released
            }
		}
	}
}

