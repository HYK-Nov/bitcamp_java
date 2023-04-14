package day03;

public class AssignmentExample {

	public static void main(String[] args) {
		// 선언과 초기화는 한줄에 가능
		int a = 5, b = 5;
		
		// 확장 대입연산자는 해당 연산의 결과를 변수에 즉시 저장함
		a += 3; //  a = a + 3;
		System.out.println(a);
		
		b /= 4; // b = b / 4;
		System.out.println(b);
		
		b %= 21; // b = b % 21;
		System.out.println(b);
	}

}
