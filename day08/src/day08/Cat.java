package day08;

public class Cat {
	// �̸�, ����, ǰ��, �л���
	public String name;
	public int age;
	public String kind;
	public String color;
	
	public Cat(String getName, int getAge, String getKind, String getColor) {
		name = getName;
		age = getAge;
		kind = getKind;
		color = getColor;
	}
	
	// ���� Ŭ���� ���ο� �����ϴ� �޼���� static�� ���� ����
	public void showCatInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("ǰ��: " + kind);
		System.out.println("�л���: " + color);
		System.out.println("-----------------");
	}
}
