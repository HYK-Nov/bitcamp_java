package day03;

public class BitOperatorExample {

	public static void main(String[] args) {
		byte a = 5; // 00000101
		byte b = 3; // 00000011
		
		// ��Ʈ ��(AND, &)
		System.out.println(a & b);
		
		// ��Ʈ ��(OR, |)
		System.out.println(a | b);
		
		// ��Ÿ�� ����(XOR, ^)
		System.out.println(a ^ b);
		
		// ��Ʈ �̵� ������(<<, >>)
		System.out.println(a << 4); // 00000101 -> 01010000
		byte c = 48; // 00110000
		System.out.println(c >> 3); // 00110000 -> 00000110
	}

}
