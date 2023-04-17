package interface_.example;

public class MainClass {

	public static void main(String[] args) {
		// 인터페이스 자료형 역시 구현체를 다형성 형식으로 받을 수 있음
		RemoteController rc = new RobotCleanerRemoteController("imou", 200000);
		
		rc.turnOn();
		rc.turnOff();
		rc.showStatus();
		
		rc = new TelevisionRemoteController(27);
		
		rc.turnOn();
		rc.turnOff();
		rc.showStatus();
	}

}
