package example.encap.good;

public class MainClass {

	public static void main(String[] args) {
		MyBirthDay mb = new MyBirthDay(2025, 16, 2);
		
		// ���������� private�̹Ƿ� ���� ���� �Ұ�
		// mb.year = 2025;
		// mb.month = 16;
		// mb.day = 2;
		
		mb.showDateInfo();
	}

}
