package exception.runtime;

public class NumberFormatExample {

	public static void main(String[] args) {
		String a = "35";
		String b = "21";
//		System.out.println(a+b);
		
		// ��������� �� ���� �ڵ�
//		StringBuffer c = new StringBuffer("35").append("21");
//		System.out.println(c);
		
		// Str -> int ��ȯ
		// Integer.parseInt("���ڿ�")�� �䱸����
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		System.out.println(i + j);
		
		// parseInt�� ���ڿ� ���ο� ������ ������ ����־��
		// ��ȯ�� �����ϸ� �������� �ƴ϶�� NumberFormatException�� �߻���
		
		String str = "hello";
		System.out.println(Integer.parseInt(str));
	}

}
