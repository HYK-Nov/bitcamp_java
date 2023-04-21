package example.thread2;

public class Me {

	public static void main(String[] args) {
		// 프린터기 키는 건 사람만 할 수 있음
		Runnable prt = new Printer();
		Runnable alr = new AlarmMachine();
		
		Thread prtThread = new Thread(prt);
		Thread alrThread = new Thread(alr);
		
		System.err.println("저녁 준비합니다.");
		System.err.println("프린터 명령이 내려왔습니다.");
		prtThread.start();
		alrThread.start();
		
		try {
			System.err.println("밥을 합니다...");
			Thread.sleep(3000);
			System.err.println("밥을 합니다...");
			Thread.sleep(3000);
			System.err.println("밥 완성");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.err.println("배식하고 설거지까지 완료");
	}

}
