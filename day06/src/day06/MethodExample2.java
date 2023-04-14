package day06;

/*
 * 매개 변수(parameter)
 * 
 * 1. 매개변수는 메서드 호출시 불완전하 문장을 채워주기 위해 사용하는 변수
 * 2. 매개변수에 어떤 값이 전달되는지에 따라 메서드의 실행 결과가 달라집니다.
 * 3. 어떤 매개변수를 이용해 문장을 완성시킬지는 선언부에 작성
 * 4. 매개변수가 필요 없는 경우 비울 수 있음
 */

public class MethodExample2 {
	// 메서드는 메서드 내부에 작성될 수 없음
	public static void greet(String name) {
		System.out.println(name + "님 안녕하세요");
	}
	
	public static void getThaiNumber() {
		System.out.println("능 : 1");
		System.out.println("썽 : 2");
		System.out.println("쌈 : 3");
		System.out.println("씨 : 4");
	}

	public static void main(String[] args) {
		// 위 구문들은 return 구문이 없으므로, 
		// System.out.println(); 사이에 넣을 수 없음
		// 메서드 종료 후 호출 위치로 전달 될 값이 없기 때문
		greet("Name");
//		System.out.println(greet("Name"));
		getThaiNumber();
//		System.out.println(getThaiNumber());
	}

}
