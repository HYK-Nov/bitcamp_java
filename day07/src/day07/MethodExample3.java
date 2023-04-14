package day07;

public class MethodExample3 {
	/*
	 * 반환 유형(return type)
	 * 
	 * 1. 반환 값은 메서드를 호출한 곳으로 전달해주는 return 구문 우측 값을 의미함 2. 매개 변수는 여러개를 입력받을 수 있지만
	 * 반환값은 오로지 하나여야 함 3. return 키워드를 사용해 반환 값을 지정할 수 있음 4. 전달할 반환값의 자료형을 반환 유형이라고
	 * 부름 5. 반환 값이 있는 메서드는 호출문 위치에 하나의 값이 전달되기 때문에 매직넘버 대신 사용할 수 있음 6. 반환 값이 없는 메서드는
	 * void를 기입. 이 때, return 구문을 쓰지 않음 7. 모든 메서드는 return을 만나는 순간 즉시 종료 분기가 아닌 return
	 * 구문 하단에는 추가 코드를 작성하면 경고가 뜸
	 */

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static void callMyName(String name) {
		// 문자열도 배열이므로 .length로 문자 갯수를 셀 수 있음
		if (name.length() < 2) {
			System.out.println("이름은 최소 2글자 이상 입력하세요.");
			return;
		}
		System.out.println("내 이름은 " + name + " 입니다.");
	}
	
	// 배열 리턴시 자료형에도 배열임을 명시해야 함
	public static int[] totalOperate(int n1, int n2) {
		int[] total = { n1+n2, n1-n2, n1*n2, n1/n2};
		return total;
	}

	public static void main(String[] args) {
		int result1 = add(3, 5);
		System.out.println(result1);
		
		// 리턴 자료가 있는 함수는 매직넘버 대신 사용할 수 있음
		int result2 = add(add(2, 4), add(5, 6));
		System.out.println(result2);
		
		int[] tot = totalOperate(20, 7);
		for (int i : tot) System.out.print(i + " ");
		
		System.out.println();
		
		callMyName("JAVA"); // 반환 값이 void이며 return 구문 실행 안 됨
		callMyName("C"); // 반환 값이 void이며 return 구문 실행 됨
	}

}
