package day06;

public class MethodExample3 {
	
	public static int mulNumber(int i) {
		int mul = 0;
		mul = i * 10;
		return mul;
	}
	
	public static void printAnything() {
		System.out.print("Print ");
		System.out.print("Anything ");
		System.out.println("YE-AH");
	}
	
	public static void good(String str, int i) {
		for (int j = 0; j < i; j++) {
			System.out.println("good " + str);
		}
	}

	public static void main(String[] args) {
		System.out.println(mulNumber(9));
		printAnything();
		good("for you", 4);
	}

}
