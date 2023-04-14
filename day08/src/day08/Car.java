package day08;

public class Car {
	
	public String modelName; // ����
	public int maxPassenger; // �ִ�°���
	public int currentSpeed; // �ӵ�
	public String owner; // ����
	public int gas; // ���ᷮ
	
	// ��� ������ final static���� ����
	public final static int BOOST_SPEED = 10;
	public final static int BREAK_SPEED = 10;
	public final static int REDUCE_GAS = 5;
	
	// ������ �� �ڸ�
	public Car(String getModelName, int getMaxPassenger, String getOwner) {
		modelName = getModelName;
		maxPassenger = getMaxPassenger;
		currentSpeed = 0;
		owner = getOwner;
		gas = 100;
	}
	
	// ���� ���
	public void accelerate() {
		currentSpeed += BOOST_SPEED;
		gas -= REDUCE_GAS;
	}
	
	// ���� ���
	public void break_() {
		currentSpeed -= BREAK_SPEED;
		gas -= REDUCE_GAS;
	}
	
	// ����� ��ȸ
	public void showStatus() {
		System.out.println("����: " + modelName);
		System.out.println("�ִ� �°� ��: " + maxPassenger);
		System.out.println("���� �ӵ�: " + currentSpeed);
		System.out.println("����: "+owner);
		System.out.println("���ᷮ: " + gas);
		System.out.println("--------------------------");
	}
	 
}
