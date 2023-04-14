package day03;

public class ShortCircuitExample {

	public static void main(String[] args) {
//		 * &, |은 모든 결과를 확인하고 넘어가기 때문에
//		 * 연산효율이 떨어지므로 일반적인 상황에서는 잘 사용하지 않음.
		
		// 거짓 & 3/0의 몫은 1이다 라는 명제(false & ?)
		// 이미 false 확정이지만, 3/0을 수행하여 에러가 발생
//		System.out.println(false & (3/0 == 1));
		
		System.out.println((94 == 1) | (123 >= 122));
	}

}
