package abstract_.noabs;

public class MainClass {

	public static void main(String[] args) {
		// 2���� ������ üũ
		
		// 1. ��� �������� ���� �˾������ ���� ����
		PopupStore ps = new PopupStore();
		
		// 2. �������̵� ���䰡 ���� �ʾ� �������̵��� �ʿ��� �޼��� ����
		PopupStore s = new Store();
		s.orderApple(); // ���� ����
		s.orderOrange(); // ���� ����
		s.orderGrape(); // ���� ���� ����
	}

}
