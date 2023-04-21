package example.thread;

public class MainThread {

	public static void main(String[] args) {
		// 보조쓰레드 실행을 위해서는 먼저 Thread 객체 생성
		
		// 1. Runnable 구현체를 생성
		Runnable trd = new MultiThread();
		
		// 2. Thread 클래스의 인스턴스 생성
		// 생성자 호출 시 위의 Runnable 구현체를 파라미터로 넘김
		Thread sTrd = new Thread(trd);
		
		System.out.println("보조쓰레드 준비 완료");
		// 3. 보조쓰레드는 .start()으로 호출 가능
		sTrd.start();
		System.out.println("먼저 끝날지 알 수 없는 메인쓰레드");
	}

}
