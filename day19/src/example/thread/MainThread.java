package example.thread;

public class MainThread {

	public static void main(String[] args) {
		// ���������� ������ ���ؼ��� ���� Thread ��ü ����
		
		// 1. Runnable ����ü�� ����
		Runnable trd = new MultiThread();
		
		// 2. Thread Ŭ������ �ν��Ͻ� ����
		// ������ ȣ�� �� ���� Runnable ����ü�� �Ķ���ͷ� �ѱ�
		Thread sTrd = new Thread(trd);
		
		System.out.println("���������� �غ� �Ϸ�");
		// 3. ����������� .start()���� ȣ�� ����
		sTrd.start();
		System.out.println("���� ������ �� �� ���� ���ξ�����");
	}

}
