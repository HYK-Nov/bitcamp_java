package poly.casting;

public class MainClass2 {
	public static void main(String[] args) {
		// Parent Ÿ�Կ��� Child, Child2 ��� ���� ����
		Parent p1 = new Child();
		p1.method2();
		
		// Parent Ÿ�����δ�
		// Child1�� method2��, Child2�� method2�� ȣ�� ����
		p1 = new Child2();
		p1.method2();
		
		// �������̵��� �������� ���� method3�� ȣ�� �Ұ���
//		p1.method3();
		
		Child c1 = new Child();
		// Parent Ÿ�԰��� �޸� Child�� Child �ν��Ͻ��� ���� ����
		Child c2 = new Child2();
	}
}
