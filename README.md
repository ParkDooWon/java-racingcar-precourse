# 2. 자동차 경주 게임

## 프로그래밍 요구사항
- indent depth를 3이 넘지 않도록 구현. (2까지 허용함)
- 함수(메소드)의 길이가 15라인을 넘어가지 않도록 구현.
- else 예약어를 사용하지 않고 구현. (switch/case 역시 사용 불가)

## 구현해야 할 기능
1. 사용자로부터 n대의 자동차 이름을 입력받고, 게임 진행 회수를 입력받는다.
	- 자동차는 쉼표(,)를 기준으로 구분한다.
	- 자동차의 이름은 5자 이하이다.
2. 매 게임에서 각 자동차에 대해 0부터 9까지의 랜덤 값을 구한다.
	- 랜덤 값이 4 이상이면 전진하고, 3 이하이면 멈춘다.
3. 게임 실행 결과를 자동차 이름과 함께 사용자에게 보여준다.
4. 가장 많이 전진한 자동차 게임의 승자를 알려준다.
	- 우승자는 한 명 이상일 수 있다.

### 예외사항
- 자동차의 이름이 5자를 초과할 경우 다시 입력받게 한다.
	- 사용자가 쉼표를 기준으로 하지 않고 자동차 이름을 입력한 경우는 5자를 초과한 형태가 된다.
	