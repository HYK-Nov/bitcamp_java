package day05;

public class BreakExample1 {

	public static void main(String[] args) {
		/*
		 * ���� ������ ���� break�� ������ �����
		 */
		int i = 0;
		while(true) {
			if (i == 15) break; // if, for, while ���� Ÿ�� ������ 1���� ��� �߰�ȣ �ʿ� ����
			System.out.println(i);
			i++;
		}
	}

}
