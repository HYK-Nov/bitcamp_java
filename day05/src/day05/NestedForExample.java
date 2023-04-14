package day05;

public class NestedForExample {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("*"); // println (X) -> print (O)
			}// 내부 for문(j)
			
			System.out.println(); // 줄 바꿈만 수행
		} // 외부 for문(i)
	}

}
