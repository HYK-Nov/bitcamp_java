package day05;

import java.util.Scanner;

public class BreakQuiz1 {

	public static void main(String[] args) {
		// 1. ���� 2�� �߻�. ��, ������ 1 ~ 10 ���� 2��
		// 2. while���� ���ѷ����� �����, ������ �߻��� ���� 2�� a * b�� ����? �̶�� �����Ͽ� ������ ����
		// 3. if������ ���� ���� �� break�� ���� ���������� ������ ��� "�����Դϴ�" ��� ��Ʈ�� �Բ� ���� ���Է� ����
		Scanner scan = new Scanner(System.in);
		
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		
		while(true) {
			System.out.printf("a * b�� ����? : ");
			int result = scan.nextInt();
			
			if (result == a * b) {
				break;
			}else {
				System.out.println("�����Դϴ�");
			}
		}
	}

}
