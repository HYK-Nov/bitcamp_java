package example.overload;
/*
 * �����ε�(�ߺ� - �ϳ��� Ŭ���� ���ο� ���� �̸��� ���� �޼��带
 * ���� �� ������ �� �ֵ��� ����ϴ� ����)
 * 
 * 1. �̸��� ���� �ڷ����� ���ƾ� ��
 * 2. �Ű������� ������ �ڷ����� �޶�� ��
 * 3. ���� �ڷ����� ������ �ٸ��� ���
 */

public class OverloadExample {
	public void input(int a) {
		System.out.println("���� 1�� �Է� ����");
	}

	public void input(String a) {
		System.out.println("���ڿ� 1�� �Է� ����");
	}
	
	public void input(int a, int b) {
		System.out.println("���� 2�� �Է� ����");
	}
	
	public void input(String a, double d) {
		System.out.println("���ڿ� 1��, �Ǽ� 1�� �Է� ����");
	}
	
	public void input(double d, String s) {
		System.out.println("�Ǽ� 1��, ���ڿ� 1�� �Է� ����");
	}
	
//	// Ÿ�԰� ������ ��ġ�� �ȵ�
//	public void input(int i) {
//		System.out.println("�̸�, Ÿ�� �� ������?");
//	}
}
