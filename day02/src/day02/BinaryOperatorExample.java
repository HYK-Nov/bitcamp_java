package day02;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		// ���������(+, -, *, /, %)
		int i = 7/3; // ���� ������ ������ ����� ������ �������� ��
		int j = 7%3; // �������� ���� �ִ� ���� ���ϰ� ���� ���ڸ� ����
		
		System.out.println("7/3 ��: " + i); // ���ڿ� �ٸ� �ڷ����� ���ϸ� ���ڰ� ����
		System.out.println("7/3 ������: " + j);
		
		// �񱳿�����(<, <=, >, >=, ==, !=)
		// ��ǻ�Ϳ��� Ư�� ������ ���� ��/������ ����
		System.out.println((i > j) + " " + (20 <= 20));
		System.out.println('��' == 123);
	}

}
