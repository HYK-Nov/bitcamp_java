package day08;

public class BasketballPlayer {
	public String name; // �󱸼����� �̸�
	public int height; // Ű
	public int age; // ����
	public int salary; // ����
	
	public BasketballPlayer(String n, int h, int a, int sal) {
		name = n;
		height = h;
		age = a;
		salary = sal;
	}
	
	public void showInfo() { 
		System.out.println("name: " + name);
		System.out.println("height: " + height);
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		System.out.println("------------------");
	}
	
	public void dunkShoot() { // ��ũ�� ���
		if (height > 190) {
			System.out.println("��ũ�� ����!");
			System.out.println();
		}else {
			System.out.println("��뿡 ���� ����");
			System.out.println();
		}
	}
}
