package day03;

public class IfExample {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 101); // 0 ~ 100
		
		if (score >= 70) {
			System.out.println(score);
			System.out.println("�հ�");
		}
		else {
			System.out.println(score);
			System.out.println("���հ�");
		}
	}
}
