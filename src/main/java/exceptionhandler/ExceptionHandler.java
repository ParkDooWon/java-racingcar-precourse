/*
 * Ŭ������ : ExceptionHandler
 * 
 * version : 0.1
 * 
 * ��¥ : 2019.12.08
 * 
 * �ۼ��� : ParkDooWon
 */
package exceptionhandler;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandler {
	private static final String OVER_5_WORDS = "�ڵ��� �̸��� 5�ڸ� �ʰ��߽��ϴ�. �ٽ� �Է����ּ���.";
	private static final String DUPLICATED_NAME = "�ڵ��� �̸��� �ߺ��Ǿ����ϴ�. �ٽ� �Է����ּ���.";
	private static final int MAX_CAR_NAME = 5;
	private List<String> usedCarNames = new ArrayList<>();
	private String[] carNames;

	public ExceptionHandler(String carNamesWithComma) {
		this.carNames = carNamesWithComma.split(",");
	}

	public boolean isDuplicated() {
		for (String carName : carNames) {
			if (usedCarNames.contains(carName)) {
				System.out.println(DUPLICATED_NAME);
				return true;
			}
			usedCarNames.add(carName);
		}
		return false;
	}

	public boolean checkNameRange() {
		boolean status = false;
		for (String carName : carNames) {
			if (carName.length() > MAX_CAR_NAME) {
				status = true;
				System.out.println(OVER_5_WORDS);
			}
		}
		return status;
	}
}
