package day07;

public class HomeworkExample1 {
	// main�� ������ �޼��� 3�� ����
	public static void getPow(int num) {
		int result = num * num;
		System.out.println("�Էµ� �� : " + num);
		System.out.println(num + "�� ������ : " + result);
	}
	
	public static void getIntroduce() {
		System.out.println("���̹� Ŭ���� ���� 6�� �����Դϴ�.");
		System.out.println("���� �ڹ� �������Դϴ�.");
		System.out.println("�޼��� ��Ʈ�� �������Դϴ�.");
	}
	
	public static void loginCheck(String id, int password) {
		if (password == 3306) {
			System.out.println(id + "�� ȯ���մϴ�.");
		}else {
			System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
		}
	}
	
	public static void main(String[] args) {
		getPow(24);
		getIntroduce();
		loginCheck("Name", 3306);
		loginCheck("Name", 1234);
	}

}
