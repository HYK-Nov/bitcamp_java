package day04;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// ��޾����� ù ���Ž� ���ų����� 0���̾ ������ �ְ�
		// �� �ڷδ� Ư�� ���űݾ��� �����Ǿ�� ������ ��
		// do ~ while�� �̿��� �̷� ��Ȳ�� ������ �� ����
		
		int prevOrderPrice = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("���� ������ �޾ҽ��ϴ�.");
			System.out.println("���� ���űݾ���?");
			prevOrderPrice = scan.nextInt();
		} while (prevOrderPrice >= 15000);
		
		scan.close();
	}

}
