package chap03;

public class Main04 {
	public static void main(String[] args) {
		String a_08 = "Happy Java"; // new String("Happy Java");
		String b_08 = "a"; // new String("a");
		String c_08 = "123"; // new String("123");
		
		String a2_08 = "hello";
		String b2_08 = "java";
		String c2_08 = "hello";
		System.out.println(a2_08.equals(b2_08));
		System.out.println(a2_08.equals(c2_08));
		
		String a3_08 = "hello";
		String b3_08 = new String("hello");
		System.out.println(a3_08.equals(b3_08));
		System.out.println(a3_08 == b3_08);
		
		System.out.println(a_08.indexOf("Java")); // 6
		System.out.println(a_08.contains("Java")); // true
		System.out.println(a_08.charAt(6)); // J
		System.out.println(a_08.replaceAll("Java", "World"));
		System.out.println(a_08.substring(0, 4)); // Happy
		System.out.println(a_08.toUpperCase()); // HAPPY JAVA
		
		String[] result_08 = a_08.split(" "); // {HAPPY, JAVA}
		
		System.out.println(String.format("I eat %d apples.", 3));
		System.out.println(String.format("I eat %s apples.", "five"));
		System.out.printf("I ate %d apples. so I was sick for %s days.\n", 10, "three");
		
		System.out.printf("%10s \n", "hi"); //"        hi"
		System.out.printf("%-10s \n", "hi"); //"hi        "
		System.out.printf("%.4f\n", 3.42134234); // 3.4213
		System.out.printf("%s", a3_08);
	}
}
