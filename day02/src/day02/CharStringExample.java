package day02;

public class CharStringExample {

	public static void main(String[] args) {
		// ���� ���ڸ� �����ϴ� ������ Ÿ�� char
		char c1 = 'A';
		char c2 = 66; // ���ڴ� ���ڿ� ��ȯ ����, ascii code�� 65�� A, 66�� B
		/*
		 * �ѱ� '��'�� �����ڵ�� ǥ���� ���� AC00�ε�
		 * ���� �ڵ尪�� char�� ������ ���� Ż�⹮�� \(��������)u�� ���ʿ� ���Դϴ�.
		 */
		char c3 = '\uAC00';
		System.out.printf("%c %c %c\n", c1, c2, c3);
		
		// ���ڿ��� ������ �� �ִ� ������ Ÿ�� String
		String s1 = "my dream";
		String s2 = "is a developer";
		System.out.println(s1 + " " + s2);

	}

}
