package example.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		// 같은 패키지 내부 클래스 파일을 가져다 쓸 때는 import 구문 필요없음
		MyBirthDay b = new MyBirthDay();
		
		b.year = 2023;
		b.month = 13; // 13월을 넣어도 동작
		b.day = 32; // 32일도 동작
		
		b.showDateInfo();
	}

}
