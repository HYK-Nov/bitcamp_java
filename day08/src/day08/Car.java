package day08;

public class Car {
	
	public String modelName; // 차종
	public int maxPassenger; // 최대승객수
	public int currentSpeed; // 속도
	public String owner; // 차주
	public int gas; // 연료량
	
	// 상수 선언은 final static으로 선언
	public final static int BOOST_SPEED = 10;
	public final static int BREAK_SPEED = 10;
	public final static int REDUCE_GAS = 5;
	
	// 생성자 들어갈 자리
	public Car(String getModelName, int getMaxPassenger, String getOwner) {
		modelName = getModelName;
		maxPassenger = getMaxPassenger;
		currentSpeed = 0;
		owner = getOwner;
		gas = 100;
	}
	
	// 가속 기능
	public void accelerate() {
		currentSpeed += BOOST_SPEED;
		gas -= REDUCE_GAS;
	}
	
	// 감속 기능
	public void break_() {
		currentSpeed -= BREAK_SPEED;
		gas -= REDUCE_GAS;
	}
	
	// 계기판 조회
	public void showStatus() {
		System.out.println("차종: " + modelName);
		System.out.println("최대 승객 수: " + maxPassenger);
		System.out.println("현재 속도: " + currentSpeed);
		System.out.println("차주: "+owner);
		System.out.println("연료량: " + gas);
		System.out.println("--------------------------");
	}
	 
}
