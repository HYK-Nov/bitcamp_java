package abstract_.abs;

public abstract class PopupStore {
	
	/*
	 * 1. �޼��忡 abstract�� ���̸� �ش� �޼���� �߻�޼��尡 �ǰ�
	 *    �� �޼���� �ݵ�� �������̵� �ؾ� ��
	 * 2. �߻�޼���� ����� �������� ������ �޼������� ������ �������� 
	 * 	  ����� �޼��尡 �ƴϱ� ������ �޼����� ��ü({}) �κ��� ����
	 * 	  ���� �������� �����ݷ�(;)���� ��
	 * 3. �Ϲ� Ŭ�������� �߻� �޼��带 ������ �� ����
	 * 	  �߻�޼��尡 �ϳ� �̻� �����ϸ� ������ �߻�Ŭ������ ����
	 * 4. �߻� Ŭ���� ���ο����� �߻� �޼��尡 �ϳ� �̻� �����Ѵٸ�
	 * 	  �Ϲ� �޼��� ���� ������ ����
	 */
	public abstract void orderApple();
	public abstract void orderOrange();
	public abstract void orderGrape();
	
	public final void refund() {
		System.out.println("��ǰ�� ������ �־� ȯ���մϴ�.");
	}
}
