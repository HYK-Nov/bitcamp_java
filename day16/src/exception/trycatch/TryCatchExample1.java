package exception.trycatch;

public class TryCatchExample1 {

	public static void main(String[] args) {
		int i = 0;
		 int j = 0;
//		int j = 5;
		
		try { // ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �ִ� ����
			System.out.println(i / j);
			System.out.println(new StringBuffer("���ܹ߻� �� �� ���� �����"));
		} catch (Exception e) {
			System.out.println(new StringBuffer("0���� ������ catch������� �Ѿ��"));
		}
		System.out.println(new StringBuffer("��·�� �� ������ ��"));
	}

}
