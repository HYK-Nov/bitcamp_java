package example.modi.protec.pack2;

//import ��Ű�� ���� protec���� �� Ȯ��!
import example.modi.protec.pack1.A;

public class D extends A{
	public D() {
//		A a = new A();
//		a.s = "hi";
//		a.method();
		
		/*
		 * protected�� ��Ű���� �ٸ� ���
		 * �� Ŭ���� ���̿� ��Ӱ��谡 �ִٸ�
		 * super Ű���带 �̿��� �θ��� ������ ���
		 */
		
		super(); // super() �����ڴ� ������ ù �ٿ� �־�� ��
		super.s = "hi";
		super.method();
	}
}
