package day07;

public class CatMain {
	public static void showCatInfo(Cat cat) {
		System.out.println("name: " + cat.name);
		System.out.println("age: " + cat.age);
		System.out.println("color: " + cat.color);
		System.out.println("type: " + cat.type);
		System.out.println("---------------------");
	}

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.name = "Hoya";
		c1.age = 9;
		c1.color = "gray";
		c1.type = "Chartreux";
		
		showCatInfo(c1);
		
		// c2, c3�� ���Ӱ� �����ϰ�
		// �� ����̵鵵 showCatInfo�� ��ȸ�� ��
		// �޸𸮱����� ��� �������� ���� �׷�����
		// c1, c2, c3�� ��ȸ�ϴ� ������ ����
		// 3���� �޸� ���� �׸� ������
		
		Cat c2 = new Cat();
		c2.name = "Dooya";
		c2.age = 4;
		c2.color = "white";
		c2.type = "Turkish angora";
		
		showCatInfo(c2);
		
		Cat c3 = new Cat();
		c2.name = "Kirby";
		c2.age = 4;
		c2.color = "gray";
		c2.type = "Russian Blue";
		
		showCatInfo(c3);
		
	}

}
