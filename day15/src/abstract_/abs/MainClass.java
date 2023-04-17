package abstract_.abs;

public class MainClass {

	public static void main(String[] args) {
		
		// 상속을 전제로 만든 PopupStore는 객체 생성 불가능
		// PopupStore ps = new PopupStore();
		
		PopupStore s1 = new Store();
		
		s1.orderApple();
		s1.orderOrange();
		s1.orderGrape();
		
		s1.refund();
	}

}
