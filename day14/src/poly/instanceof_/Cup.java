package poly.instanceof_;

public class Cup {
	private String itemName;
	private int price;
	private String companyName;
	
	public Cup(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
		this.companyName = "��ȸ��";
	}
	
	public Cup() {
		this("�Է¾ȵ�", 0);
	}
}
