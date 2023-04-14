package example.encap.good;

public class MainClass {

	public static void main(String[] args) {
		MyBirthDay mb = new MyBirthDay(2025, 16, 2);
		
		// 접근제한자 private이므로 직접 수정 불가
		// mb.year = 2025;
		// mb.month = 16;
		// mb.day = 2;
		
		mb.showDateInfo();
	}

}
