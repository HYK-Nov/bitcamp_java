package example.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		// ���� ��Ű�� ���� Ŭ���� ������ ������ �� ���� import ���� �ʿ����
		MyBirthDay b = new MyBirthDay();
		
		b.year = 2023;
		b.month = 13; // 13���� �־ ����
		b.day = 32; // 32�ϵ� ����
		
		b.showDateInfo();
	}

}
