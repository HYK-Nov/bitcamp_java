package day03;

public class TernaryOperatorExample {
	public static void main(String[] args) {
		// ���׿����ڴ� (���ǽ� ? ���1 : ���2) �������� �ۼ�
		// �ش� ��ġ�� ������ true �̸� ���1, false �̸� ���2
		int height = 115;

		String result = (height < 130) ? "����" : "����";

		System.out.println(result);
	}
}
