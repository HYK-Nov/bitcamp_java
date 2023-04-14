package day03;

public class IfQuiz {
	public static void main(String[] args) {
		int number = 100;
		
		if (number > 0) {
			if (number % 2 != 0) {
				System.out.printf("홀수");
			} else {
				System.out.printf("짝수");
			}
			System.out.println(" 양수입니다");
		} else if(number < 0) {
			System.out.println("음수입니다");
		} else {
			System.out.println("0입니다");
		}
	}
}
