package exception.runtime;

public class NullPointerExample {
	public static void main(String[] args) {
		String str = null;
//		str = "Hello";
		
		// toLowerCase는 모든 문자열을 소문자로 만들어줌
		System.out.println(str.toLowerCase());
	}
}
