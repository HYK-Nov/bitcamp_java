package day04;

import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {
		// ��ǻ�Ͷ� ������ ���߱�
		Scanner scan = new Scanner(System.in);

		System.out.printf("�ּ� ��: ");
		int minValue = scan.nextInt();

		System.out.printf("�ִ� ��: ");
		int maxValue = scan.nextInt();

		int comValue = (int) (Math.random() * maxValue + 1);

		while (comValue < minValue || comValue > maxValue) {
			comValue = (int) (Math.random() * maxValue + 1);
		}

		System.out.println(minValue + " ~ " + maxValue + " ������ ���ڸ� �Է����ּ���.");

		int userValue = scan.nextInt();
		int count = 1;

		while (comValue != userValue) {
			while (userValue > maxValue || userValue < minValue) {
				System.out.println("�ٽ� �Է����ּ���");
				userValue = scan.nextInt();
			}
			if (userValue > comValue) {
				System.out.println("�ٿ�");
				userValue = scan.nextInt();
				count++;
			} else if (userValue < comValue) {
				System.out.println("��");
				userValue = scan.nextInt();
				count++;
			}
		}

		System.out.println("*����* �õ� Ƚ��: " + count);

		scan.close();
	}

}
