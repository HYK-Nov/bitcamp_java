package day03;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// 1. ��ĳ�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		// 2. �� �Է¹ޱ�
		System.out.println("�̸� �Է�");
		String userName = scan.next(); // int�� nextInt();
		
		System.out.println("�ȳ��ϼ��� " + userName);
		
		// 3. ��ĳ�� ����
		scan.close();
	}
}
