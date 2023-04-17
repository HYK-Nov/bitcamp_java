package abstract_.noabs;

public class MainClass {

	public static void main(String[] args) {
		// 2가지 문제점 체크
		
		// 1. 상속 목적으로 만든 팝업스토어 생성 가능
		PopupStore ps = new PopupStore();
		
		// 2. 오버라이딩 강요가 되지 않아 오버라이딩이 필요한 메서드 누락
		PopupStore s = new Store();
		s.orderApple(); // 가격 갱신
		s.orderOrange(); // 가격 갱신
		s.orderGrape(); // 정보 갱신 누락
	}

}
