package example.modi.member.pack1;

public class B {
	
	// ������ ���ο� �ڵ� �ۼ�
	public B() {
		A a = new A();
		
		a.a = 1; // public ���� ����
		a.b = 2; // default ���� ����
		a.c = 3; // private ���� �Ұ�
		
		a.method1(); // public ���� ����
		a.method2(); // default ���� ����
		a.method3(); // private ���� �Ұ�
		
	}	
}
