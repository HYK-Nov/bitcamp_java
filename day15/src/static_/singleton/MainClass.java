package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		// Singleton ��ü�� �����ڰ� private�̹Ƿ� �ν��Ͻ� ���� �Ұ�
//		Singleton s1 = new Singleton();
//		s1.getInstance();
		
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1�� �ּ�: " + s1);
		
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2�� �ּ�: " + s2);
	}

}
