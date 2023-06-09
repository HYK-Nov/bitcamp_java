package day04;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// 배달어플은 첫 구매시 구매내역이 0원이어도 혜택을 주고
		// 그 뒤로는 특정 구매금액이 충족되어야 혜택을 줌
		// do ~ while을 이용해 이런 상황을 구현할 수 있음
		
		int prevOrderPrice = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("할인 혜택을 받았습니다.");
			System.out.println("다음 구매금액은?");
			prevOrderPrice = scan.nextInt();
		} while (prevOrderPrice >= 15000);
		
		scan.close();
	}

}
