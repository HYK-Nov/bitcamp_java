package chap03;

public class Main01 {

	public static void main(String[] args) {
		int age_08 = 10;
		long countOfStar_08 = 8764827384923849L;
		float pi_08 = 3.14f;
		double morePi_08 = 3.14159265358979323846;
		
		double d1_08 = 123.4;
		double d2_08 = 1.234e2; // 1.234 * 10의 제곱
		
		int octal_08 = 023; // 8진수 (십진수: 19)
		int hex_08 = 0xC; // 16진수 (십진수: 12)
		
		int a_08 = 10;
		int b_08 = 5;
		
		System.out.println(a_08 + b_08);
		System.out.println(a_08 - b_08);
		System.out.println(a_08 * b_08);
		System.out.println(a_08 / b_08);
		
		System.out.println(7 % 3);
		System.out.println(3 % 7);
		
		int i_08 = 0;
		int j_08 = 10;
		
//		System.out.println(i_08++);
//		System.out.println(j_08);
		
		System.out.println(++i_08);
		System.out.println(--j_08);
		
		i_08++;
		j_08--;
		
		System.out.println(i_08);
		System.out.println(j_08);
	}

}
