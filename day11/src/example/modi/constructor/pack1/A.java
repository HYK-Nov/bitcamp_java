package example.modi.constructor.pack1;

public class A {
	// ��� ���� ����
	A a1 = new A(true); // public ������ ȣ��
	A a2 = new A(3); // ����Ʈ ������ ȣ��
	A a3 = new A("hi"); // private ������ ȣ��
	
	// ������ ����
	public A(boolean b) {} // public �����ڴ� boolean �Ķ����
	
	A(int i) {} // default �����ڴ� int �Ķ����
	
	private A(String s) {} // private �����ڴ� String �Ķ����
}
