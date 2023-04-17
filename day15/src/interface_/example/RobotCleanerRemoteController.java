package interface_.example;

public class RobotCleanerRemoteController implements RemoteController {
	
	public String modelName;
	public int price;
	
	// �κ�û�ұ� ������
	public RobotCleanerRemoteController(String modelName, int price) {
		this.modelName = modelName;
		this.price = price;
	}

	@Override
	public void turnOn() {
		System.out.println("�κ� û�ұ� ���� Ŵ");
	}

	@Override
	public void turnOff() {
		System.out.println("�κ� û�ұ� ���� ��");
	}
	
	// �κ�û�ұ⿡ �´� ���� ��ȸ
	@Override
	public void showStatus() {
		System.out.println("�𵨸�: " + this.modelName);
		System.out.println("����: " + this.price);
	}

}
