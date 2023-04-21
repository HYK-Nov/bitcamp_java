package example.thread3;

public class Main {

	public static void main(String[] args) {
		// Runnable ����ü ���� ��� �͸� Ŭ���� �������� ��ü ����
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("������ 1��");
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("������ 2��");
				}
			}
		});
		
		System.err.println("-------------");
		System.err.println("���� ������ ����");
		t1.start();
		t2.start();
		System.err.println("���� ��");
	}

}
