package poly.casting;

public class MainClass1 {

	public static void main(String[] args) {
		// Promotion�� ����Ǹ� �ڽ� Ŭ�������� ���ǵ� ��� ��ȸ �Ұ���
		Parent p = new Child();
		p.method1(); // Parent���� ���ǵ� �޼���
		p.method2(); // �������̵��� �޼���� Ÿ�� ������� �ν��Ͻ��� �ڽ��� �޼��� ȣ��
//		p.method3(); // �θ��� ���������δ� �ڽ��ʿ��� �ִ� ��� ȣ�� �Ұ���
		System.out.println("--------------------");
		
		Child c = (Child)p; // �θ�Ÿ�� ������ �ڽ����� ��������ȯ(casting)
		c.method3(); // ����ȯ �Ŀ��� �ڽ��ʿ��� �ִ� ��� ȣ�� ����
		
		Child cc = new Child();
		cc.method3(); // ���ٸ� ��ġ ���� ȣ�� ����
		
	}

}
