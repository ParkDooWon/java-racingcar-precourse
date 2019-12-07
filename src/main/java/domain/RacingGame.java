/*
 * 클래스명 : RacingCar
 * 
 * version : 0.1
 * 
 * 날짜 : 2019.12.08
 * 
 * 작성자 : ParkDooWon
 */
package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptionhandler.ExceptionHandler;

public class RacingGame {
	private static final String QUESTION_TO_GET_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private int numOfCars;
	private String carNamesDividedByComma;
	private String carNames[];
	private List<Car> cars = new ArrayList<>();
	private ExceptionHandler exception;
	static final Scanner input = new Scanner(System.in);

	public void startGame() {
		getCarNames();
	}

	private void getCarNames() {
		System.out.println(QUESTION_TO_GET_CAR_NAMES);
		do {
			carNamesDividedByComma = input.nextLine();
			exception = new ExceptionHandler(carNamesDividedByComma);
		} while (exception.checkNameRange() || exception.isDuplicated());
		carNames = carNamesDividedByComma.split(",");
		numOfCars = carNames.length;
		for (String carName : carNames) {
			cars.add(new Car(carName));
		}
	}
}
