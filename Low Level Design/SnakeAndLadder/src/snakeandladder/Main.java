package snakeandladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		
		Player p1 = new Player("1", "Aditi");
		Player p2 = new Player("2", "Vivek");
		Player p3 = new Player("3", "Swati");
		List<Player>players = new ArrayList<>(Arrays.asList(p1,p2,p3));
		
		
		Snake snake1 = new Snake(22, 5);
		Snake snake2 = new Snake(70, 38);
		List<Snake>snakesList = new ArrayList<>(Arrays.asList(snake1, snake2));
		
		
		Ladder ladder1 = new Ladder(6, 40);
		Ladder ladder2 = new Ladder(44, 75);
		List<Ladder>ladderList = new ArrayList<>(Arrays.asList(ladder1, ladder2));
	
		Board board = new Board("1", 100, snakesList, ladderList);
		
		Dice dice = new Dice(2);
		
		Game game = new Game("1", board, dice);
		game.addPlayers(players);
		game.startGame();
		
		
	}
}
