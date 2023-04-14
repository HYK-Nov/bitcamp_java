package day05;

import java.util.Scanner;

public class BreakQuiz1 {

	public static void main(String[] args) {
		// 1. 난수 2개 발생. 단, 난수는 1 ~ 10 범위 2개
		// 2. while문을 무한루프로 만들고, 위에서 발생한 난수 2개 a * b의 답은? 이라고 질문하여 문제로 출제
		// 3. if문으로 비교해 정답 시 break로 루프 빠져나오고 오답인 경우 "오답입니다" 라는 멘트와 함께 답을 재입력 받음
		Scanner scan = new Scanner(System.in);
		
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		
		while(true) {
			System.out.printf("a * b의 답은? : ");
			int result = scan.nextInt();
			
			if (result == a * b) {
				break;
			}else {
				System.out.println("오답입니다");
			}
		}
	}

}
