package poly.static_.var;

public class Asean {
	private String name;
	private int attendanceScore; // ���
	private int finalTermScore; // �⸻
	
	public static int presentationScore; // ��ǥ(���� ����)
	
	public Asean(String name, int attendanceScore, int finalTermScore) {
		this.name = name;
		this.attendanceScore = attendanceScore;
		this.finalTermScore = finalTermScore;
	}
	
	// static ��� ���� �ڵ�� ���α׷� ���� ��� �ڵ����� �� �� ȣ���
	static {
		presentationScore = 29;
	}
	
	public void showStudentScore(){
		System.out.println("�л���: " + this.name);
		System.out.println("�⼮ ����: " + this.attendanceScore);
		System.out.println("�� ����: " + presentationScore);
		System.out.println("�⸻ ����: " + this.finalTermScore);
		System.out.println("���� ����: " + (this.attendanceScore + 
										this.presentationScore + 
										this.finalTermScore));
		System.out.println("------------------------");
	}
	
	public static void showScore2() {
		System.out.println("1234");
	}
}
