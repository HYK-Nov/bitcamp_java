package example.super_;

public class SupersonicAirplane extends Airplane{
	
	// ��� �޴� ������� ����
	
	public SupersonicAirplane(String planeCode) {
		super(planeCode); // �� ���������� Airplane�� ������ ȣ��
	}
	
	// ������ ����⵵ fly()�� ����ؾ� �ϴ� �������̵��� ��
	// �ٸ� �ü� 900km ���Ͽ����� �Ϲ� ����, �� ���Ŀ��� ������ ������ �ϹǷ�
	// 900km ���� ���������� �������̵� �� fly()��, ���Ŀ��� �����ǵ� fly()�� ����
	@Override
	public void fly() {		
		if (this.speed < 900) {
			super.fly();
		}else if(this.speed + 300 <= 2200 && this.gas >= 5) {
			this.speed += 300;
			this.gas -= 5;
		}else if(this.speed + 300 >= 2200 && this.gas >= 5) {
			this.speed = 2200;
			this.gas -= 5;
		}else {
			System.out.println("���� ����");
		}
	}
	
}
