package day04;

public class ForExample2 {

	public static void main(String[] args) {
		// �ݺ����� �̿��� 100 ���� �� �� 7�� ����� ���
		// 1. 0 ~ 100 ���� ������ if������ 7�� ����� ���̽��� �ܼ�â�� ���
		for (int i = 0; i <= 100; i++) {
			if (i > 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("-----------------");
		
		// 2. 7���� �����ؼ� 7�� ���ϱ�
		for (int i = 7; i < 101; i += 7) {
			System.out.println(i);
		}
	}

}
