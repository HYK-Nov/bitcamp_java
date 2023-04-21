package example.thread;

// ���� �����忡�� ������ ������ �����ϱ� ���ؼ�
// 1. Runnable �������̽��� ����
public class MultiThread implements Runnable{

	// 2. Runnable �������̽��� run() �޼��带 �������̵��� ������ ������ ����
	@Override
	public void run() {
		// ���±��� �ڵ�� ���������� ���� �ð� ���� ����Ǿ���
		// Thread.sleep(�и���); �� �ش� ������ ������ �Է��� �ʸ�ŭ �ߴ�
		// ������ ������ try catch ���� �־�� ��
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("����������: ����" + i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
