package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		
		Player p1 = new Player("1", "Aditi");
		//Player p2 = new Player("2", "Swati");
		Player p3 = new Player("3", "Vivek");
		List<Player>players = new ArrayList<>(Arrays.asList(p1,p3));
		
		Board board = new Board(3);
		
		Game game = new Game("1", players, board);
		game.startGame();
		
	}
}
