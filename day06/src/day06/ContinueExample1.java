package day06;

public class ContinueExample1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// Ȧ���� ��� �ش� �ݺ��� ��ŵ�ϰ� ������������ ��� �̵�
			if (i % 2 != 0) continue;
			
			System.out.println(i);
		}
	}

}
