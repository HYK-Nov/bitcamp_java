package example.overload;

public class Human {
	public String name;
	public int age;
	
	public Human() {
		name = "NAME";
		age = 99999;
	}
	
	public Human(String s, int a) {
		name = s;
		age = a;
	}
}
