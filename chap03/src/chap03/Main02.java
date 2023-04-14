package chap03;

public class Main02 {

	public static void main(String[] args) {
		boolean isSuccess_08 = true;
		boolean isTest_08 = false;
		
		System.out.println(2 > 1); // true
		System.out.println(1 == 2); // false
		System.out.println(3 % 2 == 1); // true
		System.out.println("3".equals("2"));
		
		int base_08 = 180;
		int height_08 = 185;
		boolean isTall_08 = height_08 > base_08;
		
		if(isTall_08) System.out.println("Å°°¡ Å®´Ï´Ù");
		
		int i_08 = 3;
		boolean isOdd_08 = i_08 % 2 == 1;
		System.out.println(isOdd_08);
	}

}
