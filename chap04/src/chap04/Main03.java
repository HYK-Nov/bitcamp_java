package chap04;

public class Main03 {
	public static void main(String[] args) {
		int treeHit_08 = 0;
		
		while (treeHit_08 < 10) {
			treeHit_08++;
			System.out.println("나무를 " + treeHit_08 + "번 찍었습니다.");
			if (treeHit_08 == 10) {
				System.out.println("나무 넘어갑니다.");
			}
		}
		
//		while (true) {
//			System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");
//		}
		
		int coffee_08 = 10;
		int money_08 = 300;
		
		while (money_08 > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다.");
			coffee_08--;
			System.out.println("남은 커피의 양은 " + coffee_08 + "입니다.");
			
			if (coffee_08 == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
			}
		}
		
		int a_08 = 0;
		
		while (a_08 < 10) {
			a_08++;
			if (a_08 % 2 == 0) {
				continue;
			}
			System.out.println(a_08);
		}
	}
}
