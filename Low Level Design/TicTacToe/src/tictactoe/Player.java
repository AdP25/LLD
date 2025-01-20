package tictactoe;

public class Player {

	private String id;
	
	private String name;
	
	private Symbol symbol;
	
	public Player(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	public Symbol getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}
	
}
