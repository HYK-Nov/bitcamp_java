package example.thread2;

public class Me {

	public static void main(String[] args) {
		// �����ͱ� Ű�� �� ����� �� �� ����
		Runnable prt = new Printer();
		Runnable alr = new AlarmMachine();
		
		Thread prtThread = new Thread(prt);
		Thread alrThread = new Thread(alr);
		
		System.err.println("���� �غ��մϴ�.");
		System.err.println("������ ����� �����Խ��ϴ�.");
		prtThread.start();
		alrThread.start();
		
		try {
			System.err.println("���� �մϴ�...");
			Thread.sleep(3000);
			System.err.println("���� �մϴ�...");
			Thread.sleep(3000);
			System.err.println("�� �ϼ�");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.err.println("����ϰ� ���������� �Ϸ�");
	}

}
