package exception.trycatch;

public class TryCatchExample2 {

	public static void main(String[] args) {
		String[] greetings = {"�ȳ�", "�ϼ�", "��"};
		

		int i = 0;
		while (i < 5) {
			try {
				System.out.println(greetings[i]);
			} catch (Exception e) {
				System.err.println(new StringBuffer("�迭�� ���� ������ ���"));
			}finally {
				System.out.println(new StringBuffer("��� ������ ������ ���� �������� �� ���"));
			}
			i++;
		}
		System.out.println("��·�� ���α׷� ����");
	}
	

}
