package example.thread2;

public class Printer implements Runnable{

	@Override
	public void run() {
		System.out.println("500�� ����Ʈ�� �����մϴ�.");
		
		try {
			for (int i = 0; i < 500; i++) {
				System.out.println("�����ͱⰡ ����Ʈ�մϴ�.");
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
