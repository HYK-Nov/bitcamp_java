package day06;

/*
 * �Ű� ����(parameter)
 * 
 * 1. �Ű������� �޼��� ȣ��� �ҿ����� ������ ä���ֱ� ���� ����ϴ� ����
 * 2. �Ű������� � ���� ���޵Ǵ����� ���� �޼����� ���� ����� �޶����ϴ�.
 * 3. � �Ű������� �̿��� ������ �ϼ���ų���� ����ο� �ۼ�
 * 4. �Ű������� �ʿ� ���� ��� ��� �� ����
 */

public class MethodExample2 {
	// �޼���� �޼��� ���ο� �ۼ��� �� ����
	public static void greet(String name) {
		System.out.println(name + "�� �ȳ��ϼ���");
	}
	
	public static void getThaiNumber() {
		System.out.println("�� : 1");
		System.out.println("�� : 2");
		System.out.println("�� : 3");
		System.out.println("�� : 4");
	}

	public static void main(String[] args) {
		// �� �������� return ������ �����Ƿ�, 
		// System.out.println(); ���̿� ���� �� ����
		// �޼��� ���� �� ȣ�� ��ġ�� ���� �� ���� ���� ����
		greet("Name");
//		System.out.println(greet("Name"));
		getThaiNumber();
//		System.out.println(getThaiNumber());
	}

}
