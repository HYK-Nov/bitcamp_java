package poly.instanceof_;

public class Human {
	private String name;
	private int age;
	
	// 생성자 만들기
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Human() {
		this("noname", 0);
	}
	
	public void showInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("-------------------");
	}
}
