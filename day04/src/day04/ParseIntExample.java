package day04;

public class ParseIntExample {
	public static void main(String[] args) {
		// ����������, ���ڷθ� �̷���� ���ڴ� int������ ��ȯ�� �� ����
		String str = "2002";
		
		// Integer.parseInt(����)
		int year = Integer.parseInt(str);
		
		System.out.println(year + 1);
		System.out.println(str + 1);
		
		String str2 = "abcd"; // ���ڷ� �ٲ� �� ���� ����
//		Integer.parseInt(str2);
	}
}
