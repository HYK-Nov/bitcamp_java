package day03;

public class BitOperatorExample {

	public static void main(String[] args) {
		byte a = 5; // 00000101
		byte b = 3; // 00000011
		
		// 비트 곱(AND, &)
		System.out.println(a & b);
		
		// 비트 합(OR, |)
		System.out.println(a | b);
		
		// 배타적 논리합(XOR, ^)
		System.out.println(a ^ b);
		
		// 비트 이동 연산자(<<, >>)
		System.out.println(a << 4); // 00000101 -> 01010000
		byte c = 48; // 00110000
		System.out.println(c >> 3); // 00110000 -> 00000110
	}

}
