package chap04;

import java.util.ArrayList;

public class Main01 {
	public static void main(String[] args) {
		int money_08 = 2000;
		boolean hasCard_08 = true;

		if (money_08 >= 3000 || hasCard_08) {
			System.out.println("택시 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		
		ArrayList<String> pocket_08 = new ArrayList<String>();
		pocket_08.add("paper");
		pocket_08.add("handphone");
//		pocket_08.add("money");
		
		if (pocket_08.contains("money")) {
			System.out.println("택시 타고 가라");
		} else {
			if (hasCard_08) {
				System.out.println("택시 타고 가라");
			} else {
				System.out.println("걸어가라");
			}
		}
	}
}
