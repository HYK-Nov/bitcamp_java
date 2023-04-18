package exception.throws_;

public class ThrowsExample {
	
	public static String[] greetings = {"�ȳ�", "�ϼ�", "��"};
	
	/*
	 * ������ ������ �޼��� ����ΰ� �ƴ� ȣ��ο� ���� ���
	 * ����ó���� �޼��� ȣ���������� ���ѱ�� ��Ĵ� throws��� ��
	 * �޼��� Ȥ�� ������ ȣ��� ����ó���� �����ϰ� ������ ���
	 */
	
	public static void greet(int idx) throws Exception{
		System.out.println(greetings[idx]);
	}

	public static void main(String[] args) {
		/*
		 * throws�� �پ��ִ� �޼��峪 ������ ȣ��ÿ���
		 * try ��� ���ο��� ȣ���ؾ� ����ó���� ��������
		 */
		try {
			greet(3);
		} catch (Exception e) {
			/*
			 * printStackTrace()�� ���ܹ߻� ��θ� �����ϴ� �޼����� ���
			 * �ַ� ���߰������� ������ ������ ã�� �� �̿�
			 */
			e.printStackTrace();
		}
		System.out.println("���α׷� ��������");
	}

}
