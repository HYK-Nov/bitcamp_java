package day06;

public class BreakExample2 {

	public static void main(String[] args) {
		/*
		 * ���� �ݺ������� break�� ����Ͽ� �ٱ��� �ݺ�������
		 * �� ���� �����Ű�� �ʹٸ� �ܺ� �ݺ����� label�� ���δ�
		 */
		
		// outer ��� �̸��� label�� �ܺ� �ݺ����� ���̱�
		outer : for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.println(i + ", " + j);
				if (i == 2 && j == 3) {
					break outer;
				}
			}
		}
	}

}
