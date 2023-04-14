package example.override;

public class OverrideExample {
	public static void main(String[] args) {
		// 학생 클래스의 인스턴스 생성
		Student s1 = new Student();
		s1.name = "Java";
		s1.age = 22;
		s1.major = "사학과";
		
		s1.자기소개하기();
		s1.코딩하기();
		
		System.out.println("------------------");

		Programmer p1 = new Programmer();

		p1.name = "John";
		p1.age = 35;
		p1.devLang = "Java";
		p1.jobYear = 5;

		p1.자기소개하기();
		p1.코딩하기();
	}
}
