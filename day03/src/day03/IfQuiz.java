package day03;

public class IfQuiz {
	public static void main(String[] args) {
		int number = 100;
		
		if (number > 0) {
			if (number % 2 != 0) {
				System.out.printf("Ȧ��");
			} else {
				System.out.printf("¦��");
			}
			System.out.println(" ����Դϴ�");
		} else if(number < 0) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("0�Դϴ�");
		}
	}
}
