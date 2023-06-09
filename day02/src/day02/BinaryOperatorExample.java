package day02;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		// 산술연산자(+, -, *, /, %)
		int i = 7/3; // 정수 나누기 정수의 결과는 무조건 정수여야 함
		int j = 7%3; // 나머지는 정수 최대 몫을 구하고 남는 숫자만 구함
		
		System.out.println("7/3 몫: " + i); // 문자와 다른 자료형을 더하면 문자가 연장
		System.out.println("7/3 나머지: " + j);
		
		// 비교연산자(<, <=, >, >=, ==, !=)
		// 컴퓨터에게 특정 명제에 대한 참/거짓을 물음
		System.out.println((i > j) + " " + (20 <= 20));
		System.out.println('가' == 123);
	}

}
