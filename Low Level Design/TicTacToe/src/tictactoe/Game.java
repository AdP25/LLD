package tictactoe;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Game {

	private String id;
	
	private List<Player>players;
	
	private Board board;
	
	private Deque<Player>gameQueue;
	
	Game (String id, List<Player>players, Board board){
		this.id = id;
		this.players =  players;
		this.board = board;
		this.gameQueue = new ArrayDeque<>();
	}
	
	private void setSymbolForPlayers() {
		List<Symbol>symbols = new ArrayList<>(Arrays.asList(Symbol.values()));
		Collections.shuffle(symbols);
		
		if(players.size() > symbols.size()) {
			throw new IllegalArgumentException("Players are more than required!");
		}
		int n = players.size();
		for(int i = 0; i < n; i++) {
			players.get(i).setSymbol(symbols.get(i));
		}
	}
	
	public void startGame() {
		
		setSymbolForPlayers();
		int steps = 0;
		for(Player player : players) {
			gameQueue.add(player);
		}
		board.printBoard();
		while(gameQueue.size() > 1) {
			
			Player player = gameQueue.poll();
			System.out.println(player.getName() + "'s turn!");
			Scanner in = new Scanner(System.in);
			int row = in.nextInt();
			int col = in.nextInt();
			
			int res = board.updateTicTacToeBoard(player, row, col, player.getSymbol());
			if(res == -1) {
				gameQueue.addFirst(player);
			} else if(res == 1) {
				steps++;
				gameQueue.addLast(player);
			}
			if(steps == board.getSize() * board.getSize()) {
				System.out.println("DRAW!");
				break;
			}
		}
	}
	
	
	
}
