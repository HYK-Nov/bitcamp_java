package day06;

/*
 * 1. �޼��� ����(����)�� �̷������ ���� ȣ�� �� �� ����
 * 2. �޼��� ������ �޼��� ���ο��� �� �� ����
 *    Ŭ���� �����̸鼭 �ٸ� �޼��� �ܺο� �ۼ��ؾ� ��
 * 3. �޼��� ���ο����� �ٸ� �޼����� ȣ�⸸ ������
 * 4. ȣ���ϴ� ������ �ٸ� �޼��� ���� �������� �̵��ؼ� �ش� �ڵ带 �����ϰ�
 *    Ÿ �޼��� ȣ���� ������ ���� ȣ���ߴ� �� ��ġ�� ����
 */

public class MethodExample1 {
	// ���� �޼���� �Բ� �����ϴ� �޼���� static�� �ٿ��� ����
	public static void sayHello() {
		System.out.println("Hello, World!");
	}
	
	public static int calcSum(int x) {
		int sum = 0;
		for (int i = 0; i <= x; i++)  sum += i;
		
		return sum;
	}
	
	public static int totalSum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// �ܵ� �޼��� ȣ�� ������ �Ʒ��� ���� ���Ÿ�ü�� ǥ�õ˴ϴ�.
		sayHello();
		// ���� ������ �ܼ�â�� ��µǴ� ���� �������� �ʽ��ϴ�.
		System.out.println(calcSum(10));
		totalSum(1, 2);
	}

}
