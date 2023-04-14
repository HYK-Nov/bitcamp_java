package chap03;

public class Main06 {
	public static void main(String[] args) {
		int[] odd_08 = {1, 3, 5, 7, 9};
		String[] weeks_08 = {"월", "화", "수", "목", "금", "토"};
		
		System.out.println(weeks_08[3]); // 목
		
		for (int i = 0; i < weeks_08.length; i++) {
			System.out.println(weeks_08[i]);
		}
	}
}
