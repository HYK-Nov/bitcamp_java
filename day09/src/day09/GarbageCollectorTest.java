package day09;

public class GarbageCollectorTest {
	
	public int objectNum; // ��ü ��ȣ
	
	// ������(��ü�� ������ �����Ǳ� ������ �޼���)
	public GarbageCollectorTest(int number) { 
		objectNum = number;
		System.out.println(objectNum + "�� ��ü ����");
	}
	
	// �Ҹ���(��ü�� ������ �����Ǳ� ������ ����Ǵ� �޼���)
	@Override
	protected void finalize() throws Throwable {
		System.out.println(objectNum + "�� ��ü�� ������ �����˴ϴ�.");
	}
}
