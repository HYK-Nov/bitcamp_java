package abstract_.abs;

public class Store extends PopupStore{
	@Override
	public void orderApple() {
		System.out.println("���� ����ֽ��� 20,000�� �Դϴ�.");
	}
	
	@Override
	public void orderOrange() {
		System.out.println("���� �������ֽ��� 24,000�� �Դϴ�.");
	}
	
	@Override
	public void orderGrape() {
		System.out.println("���� �����ֽ��� 15,000�� �Դϴ�.");
	}
}
