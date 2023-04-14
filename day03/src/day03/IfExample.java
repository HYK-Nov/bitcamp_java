package day03;

public class IfExample {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 101); // 0 ~ 100
		
		if (score >= 70) {
			System.out.println(score);
			System.out.println("합격");
		}
		else {
			System.out.println(score);
			System.out.println("불합격");
		}
	}
}
