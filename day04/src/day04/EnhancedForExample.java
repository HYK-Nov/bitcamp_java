package day04;

public class EnhancedForExample {

	public static void main(String[] args) {
		String[] weekDay = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		// ���� for���� ���� ���� ����Ʈ ���� �ڷḦ �ϳ��� �Һ��� �ݺ����� ����
		// Java 5���� �߰��� ����
		for(String day: weekDay) {
			System.out.println(day + "����");
		}
	}

}
