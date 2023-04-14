package example.overload;

public class Cat {
	public String name;
	public String kind;
	
	public Cat() {
		kind = "품종";
		name = "이름";
	}
	
	public Cat(String n, String k) {
		name = n;
		kind = k;
		System.out.println("지금부터 이 아이의 이름은 " + n + " 입니다");
	}
	
	public void call() {
		System.out.println("야옹아 이리와");
	}
	
	public void call(String n) {
		System.out.println(n + "아 이리와");
	}
}
