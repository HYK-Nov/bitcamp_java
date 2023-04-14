package day04;

import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {
		// 컴퓨터랑 스무고개 맞추기
		Scanner scan = new Scanner(System.in);

		System.out.printf("최소 값: ");
		int minValue = scan.nextInt();

		System.out.printf("최대 값: ");
		int maxValue = scan.nextInt();

		int comValue = (int) (Math.random() * maxValue + 1);

		while (comValue < minValue || comValue > maxValue) {
			comValue = (int) (Math.random() * maxValue + 1);
		}

		System.out.println(minValue + " ~ " + maxValue + " 사이의 숫자를 입력해주세요.");

		int userValue = scan.nextInt();
		int count = 1;

		while (comValue != userValue) {
			while (userValue > maxValue || userValue < minValue) {
				System.out.println("다시 입력해주세요");
				userValue = scan.nextInt();
			}
			if (userValue > comValue) {
				System.out.println("다운");
				userValue = scan.nextInt();
				count++;
			} else if (userValue < comValue) {
				System.out.println("업");
				userValue = scan.nextInt();
				count++;
			}
		}

		System.out.println("*정답* 시도 횟수: " + count);

		scan.close();
	}

}
