package interface_.example;

public class MainClass {

	public static void main(String[] args) {
		// �������̽� �ڷ��� ���� ����ü�� ������ �������� ���� �� ����
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
