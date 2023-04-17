package final_.field;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("kim");
//		p1.nationality = "Japan"; // final
//		p1.name = "Park"; // final
		p1.age = 25;
		
		System.out.println("국적: " + p1.nationality);
		System.out.println("이름: " + p1.name);
		System.out.println("나이: " + p1.age);
	}

}
