package final_.field;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("kim");
//		p1.nationality = "Japan"; // final
//		p1.name = "Park"; // final
		p1.age = 25;
		
		System.out.println("����: " + p1.nationality);
		System.out.println("�̸�: " + p1.name);
		System.out.println("����: " + p1.age);
	}

}
