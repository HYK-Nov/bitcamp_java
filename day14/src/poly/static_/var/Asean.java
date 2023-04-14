package poly.static_.var;

public class Asean {
	private String name;
	private int attendanceScore; // 출결
	private int finalTermScore; // 기말
	
	public static int presentationScore; // 발표(공통 점수)
	
	public Asean(String name, int attendanceScore, int finalTermScore) {
		this.name = name;
		this.attendanceScore = attendanceScore;
		this.finalTermScore = finalTermScore;
	}
	
	// static 블록 내부 코드는 프로그램 시작 즉시 자동으로 한 번 호출됨
	static {
		presentationScore = 29;
	}
	
	public void showStudentScore(){
		System.out.println("학생명: " + this.name);
		System.out.println("출석 점수: " + this.attendanceScore);
		System.out.println("팀 점수: " + presentationScore);
		System.out.println("기말 점수: " + this.finalTermScore);
		System.out.println("최종 성적: " + (this.attendanceScore + 
										this.presentationScore + 
										this.finalTermScore));
		System.out.println("------------------------");
	}
	
	public static void showScore2() {
		System.out.println("1234");
	}
}
