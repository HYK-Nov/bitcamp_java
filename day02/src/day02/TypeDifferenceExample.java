package day02;

public class TypeDifferenceExample {

	public static void main(String[] args) {
		// 정수와 실수간 연산은 진행 될 것 같아 보이지만
		// 실제로는 저장되는 자료형에 따라 다른 결과가 나옴
		
		// 정수 + 실수를 정수에 저장하는 경우 연산 불가
//		int result = 1 + 2.5;
		
		// 정수 + 실수를 실수에 저장하는 경우 가능
		double result2 = 1 + 2.5;
	}

}
