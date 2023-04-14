package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		Human h1 = new Human("JAVA", 31);
		h1.showInfo();
		
		Student s1 = new Student("STUDENT", 22);
		s1.showInfo();
		
		Cat c1 = new Cat("TAKE A LOOK", 3);
		c1.meow();
		
		System.out.println(h1 instanceof Human);
		System.out.println(s1 instanceof Human);
		// �ƿ� ���� ���� ��ü�� �񱳴� ���� �߻�
//		System.out.println(c1 instanceof Human);
		System.out.println(h1 instanceof Student);
		System.out.println(s1 instanceof Student);
//		System.out.println(c1 instanceof Student);
	}

}
