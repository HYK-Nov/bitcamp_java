package abstract_.abs;

public class MainClass {

	public static void main(String[] args) {
		
		// ����� ������ ���� PopupStore�� ��ü ���� �Ұ���
		// PopupStore ps = new PopupStore();
		
		PopupStore s1 = new Store();
		
		s1.orderApple();
		s1.orderOrange();
		s1.orderGrape();
		
		s1.refund();
	}

}
