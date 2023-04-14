package day03;

import java.util.Scanner;

public class SwitchExample1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("메뉴를 번호로 입력해주세요");
		System.out.println("1. 아메리카노, 2. 카페라떼, 3. 카페모카");
		int order = scan.nextInt();

		switch (order) {
			case 1:
				System.out.println("아메리카노");
				break;
			case 2:
				System.out.println("카페라떼");
				break;
			case 3:
				System.out.println("카페모카");
				break;
			default:
				System.out.println("없는 거 시키지 마세요");
		}

		scan.close();
	}
}
