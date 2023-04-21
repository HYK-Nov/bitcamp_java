package example.thread3;

public class ThreadNotSafty2 extends Thread {

	static int share;

	public static void main(String[] args) {
		ThreadNotSafty2 t1 = new ThreadNotSafty2();
		ThreadNotSafty2 t2 = new ThreadNotSafty2();

		t1.start();
		t2.start();
	}

	// ������ ������ ���ؼ� ����ϴ� �޼���
	public synchronized static void sharePlust() {
		System.out.println(share++);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			sharePlust(); // �޼��带 �̿��� share 1����
			try {
				sleep(250);
			} catch (InterruptedException e) {}
		}
	}

}
