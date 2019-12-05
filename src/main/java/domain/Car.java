/*
 * Class Name : Car.java
 * 
 * version : 1.0
 * 
 * 2019.12.06
 * 
 * @author ¹ÚµÎ¿ø
 * 
 */

package domain;

import java.util.Random;

public class Car {
	private static final int MAX_NUM = 10;
	private static final int MOVE = 4;
	private static final int STAY = 3;
	private static final String IS = " : ";
	private final String name;
	private int position = 0;
	private int biggerPosition = 0;
	private int randomNum;
	private String positions;
	Random random = new Random();

	public Car(String name) {
		this.name = name;
	}

	public void move() {
		randomNum = makeRandomNumber();
		if (randomNum >= MOVE) {
			this.position++;
		} else if (randomNum <= STAY) {
			this.position += 0;
		}
	}
	
	public void printResult(char shape) {
		System.out.println(this.name + IS + printPosition(shape));
	}

	public int findWinnerPosition(int tempPosition) {
		biggerPosition = 0;
		if (this.position < tempPosition) {
			biggerPosition = tempPosition;
		} else if (this.position >= tempPosition) {
			biggerPosition = this.position;
		}
		return biggerPosition;
	}

	public boolean isWinner(int winnerPosition) {
		boolean status = false;
		if (this.position == winnerPosition) {
			status = true;
		}
		return status;
	}

	public String getWinnerName() {
		return this.name;
	}
	
	private int makeRandomNumber() {
		int tempRandomNum = random.nextInt(MAX_NUM);
		return tempRandomNum;
	}

	private String printPosition(char shape) {
		positions = "";
		for (int i = 0; i < position; i++) {
			positions += shape;
		}
		return positions;
	}

}
