package example.thread;

// 보조 쓰레드에서 실행할 내용을 정의하기 위해서
// 1. Runnable 인터페이스를 구현
public class MultiThread implements Runnable{

	// 2. Runnable 인터페이스의 run() 메서드를 오버라이딩해 실행할 내용을 적음
	@Override
	public void run() {
		// 여태까지 코드는 순차적으로 쉬는 시간 없이 실행되었음
		// Thread.sleep(밀리초); 는 해당 쓰레드 실행을 입력한 초만큼 중단
		// 쓰레드 중지는 try catch 블럭에 넣어야 함
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("보조쓰레드: 실행" + i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
