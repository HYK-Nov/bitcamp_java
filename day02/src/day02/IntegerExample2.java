package day02;

public class IntegerExample2 {

	public static void main(String[] args) {
		byte a = 27;
		short b = 32767;
		int c = 2147483647;
		// 2147483647�� int �ִ밪
		// long�� 2147483647 �Ѵ� �� �ڿ� L�� ����.
		long d = 2147483648L;
		
		System.out.printf("%d %d %d %d \n", a, b, c, d);
		
		// 2���� �����, �����ѹ� �տ� ���ξ�� 0b�� ����
		int bin = 0b1010; // binary		
		// 8���� �����, ���� �տ� ���ξ�� 0�� ����
		int oct = 064; // octal
		// 16���� �����, ���� �տ� ���ξ�� 0x�� ����
		int hex = 0x3a4c; // hexadecimal
		
		System.out.printf("%d %d %d", bin, oct, hex);
	}

}
