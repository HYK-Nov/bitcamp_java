package chap04;

public class Main03 {
	public static void main(String[] args) {
		int treeHit_08 = 0;
		
		while (treeHit_08 < 10) {
			treeHit_08++;
			System.out.println("������ " + treeHit_08 + "�� ������ϴ�.");
			if (treeHit_08 == 10) {
				System.out.println("���� �Ѿ�ϴ�.");
			}
		}
		
//		while (true) {
//			System.out.println("Ctrl-C�� ������ while���� ���� ���� �� �ֽ��ϴ�.");
//		}
		
		int coffee_08 = 10;
		int money_08 = 300;
		
		while (money_08 > 0) {
			System.out.println("���� �޾����� Ŀ�Ǹ� �ݴϴ�.");
			coffee_08--;
			System.out.println("���� Ŀ���� ���� " + coffee_08 + "�Դϴ�.");
			
			if (coffee_08 == 0) {
				System.out.println("Ŀ�ǰ� �� ���������ϴ�. �ǸŸ� �����մϴ�.");
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
