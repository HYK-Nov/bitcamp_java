package example.thread3;

public class ThreadNotSafty extends Thread {

	static int share;
	
	public static void main(String[] args) {
		ThreadNotSafty t1 = new ThreadNotSafty();
		ThreadNotSafty t2 = new ThreadNotSafty();
		
		t1.start();
		t2.start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(share++);
			try {sleep(1000);} 
			catch (InterruptedException e) {}
		}
	}

}
