package day06;

/*
 * 1. 메서드 정의(선언)이 이루어져야 추후 호출 할 수 있음
 * 2. 메서드 선언은 메서드 내부에서 할 수 없음
 *    클래스 내부이면서 다른 메서드 외부에 작성해야 함
 * 3. 메서드 내부에서는 다른 메서드의 호출만 가능함
 * 4. 호출하는 과정중 다른 메서드 내부 지역으로 이동해서 해당 코드를 실행하고
 *    타 메서드 호출이 끝나면 원래 호출했던 그 위치로 복귀
 */

public class MethodExample1 {
	// 메인 메서드와 함꼐 존재하는 메서드는 static을 붙여서 생성
	public static void sayHello() {
		System.out.println("Hello, World!");
	}
	
	public static int calcSum(int x) {
		int sum = 0;
		for (int i = 0; i <= x; i++)  sum += i;
		
		return sum;
	}
	
	public static int totalSum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// 단독 메서드 호출 구문은 아래와 같이 이탤릭체로 표시됩니다.
		sayHello();
		// 리턴 구문은 콘솔창에 출력되는 것을 보장하지 않습니다.
		System.out.println(calcSum(10));
		totalSum(1, 2);
	}

}
