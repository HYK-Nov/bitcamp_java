package api.lang.system;

public class SystemTimeExample {

	public static void main(String[] args) {
		/*
		 * - currentTimeMillis()�� nanoTime() �޼����
		 *   UNIX �ð��̶�� ü�踦 �����
		 * - UNIX �ð��̶� 1970�� 1�� 1�� 00�� 00�� 00�ʸ� ��������
		 *   ��ŭ�� �ð��� �������� ���ڷ� ǥ���ϴ� ü����
		 * - ��������� �ð��� 1000���� 1�ʷ� ��ȯ�� �����ð���
		 *   ��������� �ð��� 10����� 1�ʷ� ��ȯ�� �����ð���
		 *   long Ÿ������ ������
		 */
		long start = System.currentTimeMillis(); // �޼��� ����Ÿ�� long
		long sum = 0;
		
		for (int i = 1; i < 10000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(new StringBuffer("���� �ð�: ").append(start));
		System.out.println(new StringBuffer("���� �ð�: ").append(end));
		System.out.println(new StringBuffer("�ҿ� �ð�: ").append(end - start));
		
	}

}
