package poly.hetero;

public class MainClass {
	public static void main(String[] args) {
		// �⺻ �ڷ������� ���� �迭 ����
		// �ٸ� �ڷ����� ���� �� ����
//		int[] iaa = {1, 2, 3, 4, 5, 6, 7, 8, 9, "������"};
		
		// A�ڷ����� �� �ּҸ� �迭�� ���� ������
		A[] aArr = new A[2];
		
		A a1 = new A();
		A a2 = new A();
		
		aArr[0] = a1;
		aArr[1] = a2;
		
		Object[] oArr = new Object[2];
		
		B b1 = new B();
//		aArr[1] = b1; // AŸ�� �迭�� BŸ�� ����
		oArr[0] = b1;
		oArr[1] = a2;
		
		oArr[1] = 10; // �⺻�� �ڷᵵ ���� ����
	}
}
