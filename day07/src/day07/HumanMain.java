package day07;

public class HumanMain {
	public static void getHumanInfo(Human h) {
		System.out.println("name : " + h.name);
		System.out.println("age : " + h.age);
		System.out.println("height : " + h.height);
	}

	public static void main(String[] args) {
		// Ÿ Ŭ������ ���ǵ� ��Ҹ� main ���ο��� ������ �� �� ����
		
		// new Ű����� ���� �ڷḦ ����
		// �ڷ��� ���� = new �ڷ���();
		// �� ��ɾ�� ����ü�� �ν��Ͻ��� ������ �� ����
		
		// ��� 1 ����
		Human h1 = new Human();
		h1.name = "Name";
		h1.age = 1;
		h1.height = 200;
		
		getHumanInfo(h1);
		
		// ��� 2 ����
		Human h2 = new Human();
		h2.name = "N ame";
		h2.age = 2;
		h2.height = 250;
		
		getHumanInfo(h2);
	}

}
