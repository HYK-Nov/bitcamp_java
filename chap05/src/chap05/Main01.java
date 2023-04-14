package chap05;
/*
 * class Calculator1_08 { static int result_08 = 0;
 * 
 * static int add_08(int num) { result_08 += num; return result_08; } }
 * 
 * class Calculator2_08{ static int result_08 = 0;
 * 
 * static int add_08(int num) { result_08 += num; return result_08; } }
 */

class Calculator_08{
	int result_08 = 0;
	int add_08(int num) {
		result_08 += num;
		return result_08;
	}
}

public class Main01 {

	public static void main(String[] args) {
		/*
		 * System.out.println(Calculator1_08.add_08(3));
		 * System.out.println(Calculator1_08.add_08(4));
		 * 
		 * System.out.println(Calculator2_08.add_08(3));
		 * System.out.println(Calculator2_08.add_08(7));
		 */
		Calculator_08 cal1_08 = new Calculator_08();
		Calculator_08 cal2_08 = new Calculator_08();
		
		System.out.println(cal1_08.add_08(3));
		System.out.println(cal1_08.add_08(4));
		
		System.out.println(cal2_08.add_08(3));
		System.out.println(cal2_08.add_08(7));
	}

}
