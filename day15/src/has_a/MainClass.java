package has_a;

public class MainClass {

	public static void main(String[] args) {
		Gun gun = new Gun("Awesome", "123456");
		
		// gun�� ������ �����ؾ� ��
		Police police = new Police(gun, "Cop", 178);
//		Police police = new Police(new Gun("Awesome", "123456"), "Cop", 178); // �͸�Ŭ���� ����ϸ� ������
		
		police.showStatus();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.reload();
		police.shoot();
	}

}
