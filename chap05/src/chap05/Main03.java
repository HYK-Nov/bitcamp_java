package chap05;

public class Main03 {
	int sum_08(int a, int b) {
		return a + b;
	}
	
	String say_08() {
		return "Hi";
	}
	
	void sum1_08(int a, int b) {
		System.out.println(a + "�� " + b + "�� ���� " + (a + b) + "�Դϴ�.");
	}
	
	void say1_08() {
		System.out.println("Hi");
	}
	
	void sayNick_08(String nick) {
		if ("fool".equals(nick)) {
			return;
		}
		System.out.println("���� ������ " + nick + "�Դϴ�.");
	}
	
	int a_08;
	
	int varTest_08(int a) {
		a++;
		return a;
	}
	
	/*
	 * void varTest1_08(Main03 main_08) { main_08.a_08++; }
	 */
	
	void varTest1_08() {
		this.a_08++;
	}

	public static void main(String[] args) {
		int a_08 = 3;
		int b_08 = 4;
		
		Main03 main_08 = new Main03();
		int c_08 = main_08.sum_08(a_08, b_08);
		
		System.out.println(c_08);
		
		String a1_08 = main_08.say_08();
		System.out.println(a1_08);
		
		main_08.sum1_08(3, 4);
		
		main_08.say1_08();
		
		main_08.sayNick_08("angel");
		main_08.sayNick_08("fool");
		
		a_08 = main_08.varTest_08(a_08);
		System.out.println(a_08);
		
		main_08.a_08 = 1;
		main_08.varTest1_08();
		System.out.println(main_08.a_08);
	}

}
