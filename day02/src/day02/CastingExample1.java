package day02;

public class CastingExample1 {

	public static void main(String[] args) {
		/*
		 * ũ�Ⱑ ���� ������ Ÿ���� �����͸� ū ������ Ÿ������
		 * ��ȯ�� ���� ������ Ÿ���� �ڵ����� �÷���(promotion/upcasting) ó���մϴ�.
		 */
		byte b = 10;
		int i = b; // byte -> int�� �ڵ���ȯ
		
		char c = '��';
		int j = c; // char -> int�� �ڵ���ȯ
		
		int k = 500;
		double d = k; // int -> double�� �ڵ���ȯ
		
		System.out.println(i + " " + j + " " + d);
	}

}
