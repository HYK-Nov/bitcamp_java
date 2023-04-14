package day07;

public class HumanMain {
	public static void getHumanInfo(Human h) {
		System.out.println("name : " + h.name);
		System.out.println("age : " + h.age);
		System.out.println("height : " + h.height);
	}

	public static void main(String[] args) {
		// 타 클래스에 정의된 요소를 main 내부에서 생성해 쓸 수 있음
		
		// new 키워드는 힙에 자료를 저장
		// 자료형 변수 = new 자료형();
		// 위 명령어로 구조체의 인스턴스를 생성할 수 있음
		
		// 사람 1 생성
		Human h1 = new Human();
		h1.name = "Name";
		h1.age = 1;
		h1.height = 200;
		
		getHumanInfo(h1);
		
		// 사람 2 생성
		Human h2 = new Human();
		h2.name = "N ame";
		h2.age = 2;
		h2.height = 250;
		
		getHumanInfo(h2);
	}

}
