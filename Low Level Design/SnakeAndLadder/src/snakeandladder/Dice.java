package snakeandladder;

public class Dice {

	private int numOfDice;
	
	public Dice(int numOfDice) {
		this.numOfDice = numOfDice;
	}
	
	public int roll() {
		int minNum = this.numOfDice;
		int maxNum = this.numOfDice * 6;
		
		int num = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;
		
		return num;
	}
	
}
