package poly.casting;

public class MainClass1 {

	public static void main(String[] args) {
		// Promotion이 적용되면 자식 클래스에만 정의된 요소 조회 불가능
		Parent p = new Child();
		p.method1(); // Parent에만 정의된 메서드
		p.method2(); // 오버라이딩된 메서드는 타입 상관없이 인스턴스의 자식쪽 메서드 호출
//		p.method3(); // 부모쪽 지역변수로는 자식쪽에만 있는 요소 호출 불가능
		System.out.println("--------------------");
		
		Child c = (Child)p; // 부모타입 변수를 자식으로 강제형변환(casting)
		c.method3(); // 형변환 후에는 자식쪽에만 있는 요소 호출 가능
		
		Child cc = new Child();
		cc.method3(); // 별다른 조치 없이 호출 가능
		
	}

}
