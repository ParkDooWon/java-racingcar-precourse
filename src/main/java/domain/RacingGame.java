/*
 * Class Name : RacingGame.java
 * 
 * version : 1.0
 * 
 * 2019.12.06
 * 
 * @author 박두원
 * 
 */

package domain;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RacingGame {
	private static final String QUESTION_FOR_CAR_NAME = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)기준으로 구분)";
	private static final String QUESTION_FOR_TRY = "시도할 회수는 몇회인가요?";
	private static final String IS_WINNER = "이(가) 최종 우승했습니다.";
	private Car[] cars;
	private String[] carNames;
	private String carNamesDividedByComma;
	private List<String> winners = new ArrayList<String>();
	private int numOfGames;
	private int numOfCars;
	private int winnerPosition = 0;
	Scanner input = new Scanner(System.in);

	public RacingGame() {
		System.out.println(QUESTION_FOR_CAR_NAME);
		carNamesDividedByComma = input.nextLine();
		carNames = carNamesDividedByComma.split(",");
		numOfCars = carNames.length;
		cars = new Car[numOfCars];
		
		System.out.println(QUESTION_FOR_TRY);
		numOfGames = input.nextInt();
	}

	public void startGame() {
		for (int i = 0; i < numOfCars; i++) {
			cars[i] = new Car(carNames[i]);
		}
		for (int i = 0; i < numOfGames; i++) {
			moveCars();
			printCars();
			System.out.println();
		}
		findWinner();
		printWinners();
	}

	private void moveCars() {
		for (int i = 0; i < numOfCars; i++) {
			cars[i].move();
		}
	}

	private void printCars() {
		for (int i = 0; i < numOfCars; i++) {
			cars[i].printResult('-');
		}
	}
	
	private void findWinner() {
		for (int i = 0; i < numOfCars; i++) {
			winnerPosition = cars[i].findWinnerPosition(winnerPosition);
		}
		for (int i = 0; i < numOfCars; i++) {
			this.getWinnerName(i);
		}
	}
	
	private void getWinnerName(int idx) {
		if (cars[idx].isWinner(winnerPosition)) {
			winners.add(cars[idx].getWinnerName());
		}
	}

	private void printWinners() {
		for (int i = 0; i < winners.size(); i++) {
			System.out.print(winners.get(i));
			haveComma(i);
		}
		System.out.println(IS_WINNER);
	}

	private void haveComma(int idx) {
		if (idx < winners.size() - 1) {
			System.out.print(", ");
		}
	}

}
