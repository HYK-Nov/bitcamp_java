package day03;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// 1. 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 2. 값 입력받기
		System.out.println("이름 입력");
		String userName = scan.next(); // int는 nextInt();
		
		System.out.println("안녕하세요 " + userName);
		
		// 3. 스캐너 종료
		scan.close();
	}
}
