package exception.runtime;

public class NullPointerExample {
	public static void main(String[] args) {
		String str = null;
//		str = "Hello";
		
		// toLowerCase�� ��� ���ڿ��� �ҹ��ڷ� �������
		System.out.println(str.toLowerCase());
	}
}
