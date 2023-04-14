package day02;

public class IntegerExample2 {

	public static void main(String[] args) {
		byte a = 27;
		short b = 32767;
		int c = 2147483647;
		// 2147483647은 int 최대값
		// long은 2147483647 넘는 값 뒤에 L을 붙임.
		long d = 2147483648L;
		
		System.out.printf("%d %d %d %d \n", a, b, c, d);
		
		// 2진수 저장시, 매직넘버 앞에 접두어로 0b를 붙임
		int bin = 0b1010; // binary		
		// 8진수 저장시, 정수 앞에 접두어로 0을 붙임
		int oct = 064; // octal
		// 16진수 저장시, 정수 앞에 접두어로 0x를 붙임
		int hex = 0x3a4c; // hexadecimal
		
		System.out.printf("%d %d %d", bin, oct, hex);
	}

}
