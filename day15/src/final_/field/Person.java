package final_.field;

public class Person {
	/*
	 * final ������ �� �� �� �ʱ�ȭ �� �� �ְ�
	 * ���Ŀ��� ������ �Ұ����ϱ� ������
	 * ����ÿ� �ƿ� ���� �ʱ�ȭ�� ���ְų�
	 * �����ڿ��� �ʱ�ȭ �� ��� ��
	 */
	
	public final String nationality = "���ѹα�"; // ����� �ʱ�ȭ
	public final String name; // ���⼭ �ʱ�ȭ �� �ϸ� ������ ������ �ʱ�ȭ
	public int age; // final�� ���� ���� ��������� �ʱ�ȭ �ǹ�X
	
	public Person(String name) {
		this.name = name;
	}
}
