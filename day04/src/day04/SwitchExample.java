package day04;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		System.out.println("[���, �븮, ����, ����, ����]");
		
		String str = scan.next();
		
		switch (str) {
		case "���":
			System.out.println("����� �޿��� 200�� �Դϴ�.");
			break;
		case "�븮":
			System.out.println("�븮�� �޿��� 300�� �Դϴ�.");
			break;
		case "����":
			System.out.println("������ �޿��� 400�� �Դϴ�.");
			break;
		case "����":
			System.out.println("������ �޿��� 500�� �Դϴ�.");
			break;
		case "����":
			System.out.println("������ �޿��� 600�� �Դϴ�.");
			break;
		default:
			System.out.println(str + "��(��) ���� �����Դϴ�.");
			System.out.println("������ �ٽ� �Է����ּ���.");
			break;
		}// switch ~ case��
	}//main method
}
