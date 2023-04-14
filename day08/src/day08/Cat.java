package day08;

public class Cat {
	// 이름, 나이, 품종, 털색깔
	public String name;
	public int age;
	public String kind;
	public String color;
	
	public Cat(String getName, int getAge, String getKind, String getColor) {
		name = getName;
		age = getAge;
		kind = getKind;
		color = getColor;
	}
	
	// 설계 클래스 내부에 선언하는 메서드는 static을 쓰지 않음
	public void showCatInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("품종: " + kind);
		System.out.println("털색깔: " + color);
		System.out.println("-----------------");
	}
}
