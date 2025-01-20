package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Game {

	private String id;
	
	private List<Player>players;
	
	private Board board;
	
	private Queue<Player>gameQueue;
	
	Game (String id, List<Player>players, Board board){
		this.id = id;
		this.players =  players;
		this.board = board;
		this.gameQueue = new LinkedList<>();
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
		
		for(Player player : players) {
			gameQueue.add(player);
		}
		
		while(gameQueue.size() != 1) {
			
			Player player = gameQueue.poll();
			System.out.println(player.getName() + "'s turn!");
			Scanner in = new Scanner(System.in);
			int row = in.nextInt();
			int col = in.nextInt();
			
			if(!board.updateTicTacToeBoard(player, row, col, player.getSymbol())) {
				gameQueue.add(player);
			}
		}
	}
	
	
	
}
