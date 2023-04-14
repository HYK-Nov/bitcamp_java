package day07;

public class CatMain {
	public static void showCatInfo(Cat cat) {
		System.out.println("name: " + cat.name);
		System.out.println("age: " + cat.age);
		System.out.println("color: " + cat.color);
		System.out.println("type: " + cat.type);
		System.out.println("---------------------");
	}

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.name = "Hoya";
		c1.age = 9;
		c1.color = "gray";
		c1.type = "Chartreux";
		
		showCatInfo(c1);
		
		// c2, c3를 새롭게 생성하고
		// 이 고양이들도 showCatInfo로 조회할 때
		// 메모리구조가 어떻게 전개될지 직접 그려보기
		// c1, c2, c3을 조회하는 각각의 순간
		// 3장의 메모리 구조 그림 보내기
		
		Cat c2 = new Cat();
		c2.name = "Dooya";
		c2.age = 4;
		c2.color = "white";
		c2.type = "Turkish angora";
		
		showCatInfo(c2);
		
		Cat c3 = new Cat();
		c2.name = "Kirby";
		c2.age = 4;
		c2.color = "gray";
		c2.type = "Russian Blue";
		
		showCatInfo(c3);
		
	}

}
