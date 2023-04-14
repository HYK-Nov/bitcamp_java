package example.super_;

public class Airplane {
	public String planeCode;
	protected int speed;
	public int gas;
	
	public Airplane(String planeCode) {
		this.planeCode = planeCode;
		this.speed = 0;
		this.gas = 100;
	}
	
	public void fly() {
		if (this.gas - 3 < 0) {
			System.out.println("���� ����");
			return;
		}
		if (this.speed + 100 > 900) {
			this.speed = 900;
			this.gas -= 3;
			return;
		}
		
		this.speed += 100;
		this.gas -= 3;
	}
	
	public void showStatus() {
		System.out.println("���: " + this.planeCode);
		System.out.println("�ӵ�: " + this.speed);
		System.out.println("����: " + this.gas);
	}
}
