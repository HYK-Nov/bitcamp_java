package example.overload;

public class HumanMain {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human("Rosie", 29);
		
		System.out.println(h1.name + " " + h1.age);
		System.out.println(h2.name + " " + h2.age);
	}

}
