package example.thread3;

public class Main {

	public static void main(String[] args) {
		// Runnable 구현체 생성 대신 익명 클래스 생성으로 대체 가능
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("쓰레드 1번");
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("쓰레드 2번");
				}
			}
		});
		
		System.err.println("-------------");
		System.err.println("메인 쓰레드 시작");
		t1.start();
		t2.start();
		System.err.println("메인 끝");
	}

}
