package day04;

public class ForQuiz {

	public static void main(String[] args) {
		// ���� ������
		// �������� ������ 1 ~ 9����
		// Math.random()�� Ȱ��(0 ~ 8)
		// ������ ���� ���� 1 ~ 9�� ���� ���� for���� �̿��� 9���� ������ �ֿܼ� ���
		
		int num = (int)(Math.random() * 9) + 1;
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
