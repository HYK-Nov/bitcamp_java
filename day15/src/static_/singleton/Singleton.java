package static_.singleton;

public class Singleton {
	/*
	 * �̱��� ���� - ��ü�� 1���� ����� �����ϱ� ���� ������ ����
	 * 
	 * 1. �ܺο��� �����ڸ� ����� �� ������ �����ڿ� private�� ����
	 */
	private Singleton() {};
	
	/*
	 * 2. �ڽ��� Ŭ���� ���ο��� �������� ��ü�� 1�� ������
	 */
	private static Singleton instance;
	
	static {
		instance = new Singleton();
	}
	
	/*
	 * 3. �ܺο��� �� Ŭ������ ��ü�� �ʿ�� �ϴ� ���
	 * 	  2������ static���� ������ ��ü�� �ּҸ� return��
	 */
	public static Singleton getInstance() {
		return instance;
	}
}
