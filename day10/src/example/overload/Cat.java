package example.overload;

public class Cat {
	public String name;
	public String kind;
	
	public Cat() {
		kind = "ǰ��";
		name = "�̸�";
	}
	
	public Cat(String n, String k) {
		name = n;
		kind = k;
		System.out.println("���ݺ��� �� ������ �̸��� " + n + " �Դϴ�");
	}
	
	public void call() {
		System.out.println("�߿˾� �̸���");
	}
	
	public void call(String n) {
		System.out.println(n + "�� �̸���");
	}
}
