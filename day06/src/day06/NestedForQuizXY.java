package day06;

public class NestedForQuizXY {

	public static void main(String[] args) {
		// 4x + 5y = 60�� ����� �ظ� ��� ���Ͻÿ�
		for (int x = 1; x <= 15; x++) {
			for (int y = 1; y <= 11; y++) {
				// ���ǽ��� �̿��� �������� �ذ� ������ ��츸 ���
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("x = " + x);
					System.out.println("y = " + y);
				}
			}
		}
	}

}
