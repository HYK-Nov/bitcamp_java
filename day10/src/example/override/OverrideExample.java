package example.override;

public class OverrideExample {
	public static void main(String[] args) {
		// �л� Ŭ������ �ν��Ͻ� ����
		Student s1 = new Student();
		s1.name = "Java";
		s1.age = 22;
		s1.major = "���а�";
		
		s1.�ڱ�Ұ��ϱ�();
		s1.�ڵ��ϱ�();
		
		System.out.println("------------------");

		Programmer p1 = new Programmer();

		p1.name = "John";
		p1.age = 35;
		p1.devLang = "Java";
		p1.jobYear = 5;

		p1.�ڱ�Ұ��ϱ�();
		p1.�ڵ��ϱ�();
	}
}
