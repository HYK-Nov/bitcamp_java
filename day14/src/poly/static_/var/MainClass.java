package poly.static_.var;

public class MainClass {

	public static void main(String[] args) {
		// 인스턴스 생성 전부터 이미 조회
		System.out.println(Asean.presentationScore);
		Asean.showScore2();
		
		Asean.presentationScore = 50; // 말 그래도 공용
		Asean a1 = new Asean("kim", 20, 43);
		Asean a2 = new Asean("Lee", 20, 40);
		Asean a3 = new Asean("Park", 20, 39);
		Asean a4 = new Asean("Choi", 14, 42);
		
		a1.showStudentScore();
		a2.showStudentScore();
		a3.showStudentScore();
		a4.showStudentScore();
	}

}
