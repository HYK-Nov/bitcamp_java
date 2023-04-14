package day04;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("직급을 입력하세요.");
		System.out.println("[사원, 대리, 과장, 차장, 부장]");
		
		String str = scan.next();
		
		switch (str) {
		case "사원":
			System.out.println("사원의 급여는 200만 입니다.");
			break;
		case "대리":
			System.out.println("대리의 급여는 300만 입니다.");
			break;
		case "과장":
			System.out.println("과장의 급여는 400만 입니다.");
			break;
		case "차장":
			System.out.println("차장의 급여는 500만 입니다.");
			break;
		case "부장":
			System.out.println("부장의 급여는 600만 입니다.");
			break;
		default:
			System.out.println(str + "은(는) 없는 직급입니다.");
			System.out.println("직급을 다시 입력해주세요.");
			break;
		}// switch ~ case문
	}//main method
}
