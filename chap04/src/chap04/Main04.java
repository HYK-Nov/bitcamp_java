package chap04;

public class Main04 {
	public static void main(String[] args) {
		int[] marks_08 = {90, 25, 67, 45, 80};
		
		for (int i = 0; i < marks_08.length; i++) {
			if (marks_08[i] >= 60) {
				System.out.println((i+1) + "�� �л��� �հ��Դϴ�.");
			} else {
				System.out.println((i+1) + "�� �л��� ���հ��Դϴ�.");
			}
		}
		
		for (int i = 0; i < marks_08.length; i++) {
			if (marks_08[i] < 60) {
				continue;
			} else {
				System.out.println((i+1) + "�� �л� �����մϴ�. �հ��Դϴ�.");
			}
		}
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}
}
