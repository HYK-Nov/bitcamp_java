package example.override;

public class Programmer extends Human{
	public String devLang;
	public int jobYear;
	
	@Override
	public void �ڵ��ϱ�() {
		System.out.println(devLang + " �� �̿��� �ڵ� �� �� �ֽ��ϴ�.");
	}
	
	@Override
	public void �ڱ�Ұ��ϱ�() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println(devLang + " " + jobYear + "���� �������Դϴ�");
	}
}
