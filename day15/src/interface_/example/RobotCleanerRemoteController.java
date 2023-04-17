package interface_.example;

public class RobotCleanerRemoteController implements RemoteController {
	
	public String modelName;
	public int price;
	
	// 로봇청소기 생성자
	public RobotCleanerRemoteController(String modelName, int price) {
		this.modelName = modelName;
		this.price = price;
	}

	@Override
	public void turnOn() {
		System.out.println("로봇 청소기 전원 킴");
	}

	@Override
	public void turnOff() {
		System.out.println("로봇 청소기 전원 끔");
	}
	
	// 로봇청소기에 맞는 정보 조회
	@Override
	public void showStatus() {
		System.out.println("모델명: " + this.modelName);
		System.out.println("가격: " + this.price);
	}

}
