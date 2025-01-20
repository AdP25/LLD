package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private int boardSize;
	
	private List<List<Symbol>>ticTacToeBoard;
	
	public Board(int size) {
		boardSize = size;
		ticTacToeBoard = new ArrayList<>();
		for(int i = 0; i < boardSize; i++) {
			List<Symbol>rowList = new ArrayList<>();
			for(int j = 0; j < boardSize; j++) {
				rowList.add(null);
			}
			ticTacToeBoard.add(rowList);
		}
		
	}
	
	public int getSize() {
		return this.boardSize;
	}
	public void printBoard() {
		for(int i = 0; i < boardSize; i++) {
			for(int j = 0; j < boardSize; j++) {
				if(ticTacToeBoard.get(i).get(j) == null)
					System.out.print(". ");
				else
					System.out.print(ticTacToeBoard.get(i).get(j) + " ");
			}
			System.out.println("\n");
		}
	}
	Boolean checkIfWon(int row, int col,  Symbol symbol) {
		
		// check row
		int i;
		for(i = 0; i < boardSize; i++) {
			if(ticTacToeBoard.get(row).get(i) != null && ticTacToeBoard.get(row).get(i).equals(symbol)) 
				continue;
			else
				break;
		}
		if(i == boardSize) return true;
		
		// check col
		for(i = 0; i < boardSize; i++) {
			if(ticTacToeBoard.get(i).get(col) != null  && ticTacToeBoard.get(i).get(col).equals(symbol)) 
				continue;
			else
				break;
		}
		if(i == boardSize) return true;
		
		// check diagonal 1 -> i == j
		if(row == col) {
			for(i = 0; i < boardSize; i++) {
				if(ticTacToeBoard.get(i).get(i)!=null &&  ticTacToeBoard.get(i).get(i).equals(symbol)) 
					continue;
				else
					break;
			}
			if(i == boardSize) return true;
		}
		
		// check diagonal 2
		if(row + col == boardSize-1) {
			for(i = 0; i < boardSize; i++) {
				if(ticTacToeBoard.get(i).get(boardSize-1-i)!=null && ticTacToeBoard.get(i).get(boardSize-1-i).equals(symbol)) 
					continue;
				else
					break;
			}
			if(i == boardSize) return true;
		}
		return false;
	}
	
	public int updateTicTacToeBoard(Player player, int row, int col, Symbol symbol) {
		
		if(row < 0 || col < 0 || row >= boardSize || col >= boardSize || ticTacToeBoard.get(row).get(col) != null) {
			System.out.println("Please choose valid row, col");
			return -1;
		}
		
		ticTacToeBoard.get(row).set(col, symbol);
		printBoard();
		// check if won
		boolean result = checkIfWon(row, col, symbol);
		if(result) {
			System.out.println("Yeahh!! Player "+ player.getName() + " won!");
			return 0;
		}
		return 1;		
		
	}
	
	
}
