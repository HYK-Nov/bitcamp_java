package api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		Random r = new Random();
		
		// nextDouble(): 0.0 �̻�, 1.0 �̸��� �Ǽ� ���� ����
		double d = r.nextDouble();
		System.out.println("�Ǽ� ���� ��: " + d);
		
		// nextBoolean(): �� ���� �� ����
		boolean b = r.nextBoolean();
		System.out.println("�� ���� ��: " + b);
		
		// nextInt(): ���� ���� �� ����
		// ���� int�� ������ �� �ִ� ��� �������� ���� �߻�
		int i = r.nextInt();
		System.out.println("���� ���� ��: " + i);
		
		// ���� 0 �̻� 10 �̸� ���� �߻�
		i = r.nextInt(10);
		System.out.println("����(0~9): " + i);
		
		// ���� 1 �̻� 11 �̸� ���� �߻�
		i = r.nextInt(10)+1;
		System.out.println("����(1~10): " + i);
	}

}
