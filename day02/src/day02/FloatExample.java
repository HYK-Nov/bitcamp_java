package day02;

public class FloatExample {
	public static void main(String[] args) {
		// 매직넘버 실수는 double이기 때문에 float에 저장할 때,
		// 뒤에 f를 붙여 float로 바꿔주어야 함.
		float f1 = 7.12345f;
		double d1 = 7.12345;
		
		System.out.println(f1 + " " + d1);
		
		float f2 = 1.234567891234f; // float 자료형이 표현범위가 좁아 뒷자리가 짤림
		double d2 = 1.234567891234;
		
		System.out.println(f2 + " " + d2);
	}
}
