package example.override;

public class Student extends Human{
	public String major;
	
	@Override // �������̵� �޼��� ���� �ٿ���� �ߴ� ������̼�
	public void �ڱ�Ұ��ϱ�() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + major);
	}
}
