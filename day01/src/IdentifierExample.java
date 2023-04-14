
public class IdentifierExample {
	
	public static void main(String[] args) {
		// java 식별자 이름은 대/소문자를 구분함
		int age = 30;
		int Age = 49;
		
		System.out.println(age + " " + Age);
		
		// 식별자 이름은 숫자로 시작할 수 없음
		int number = 2;
//		int 2number = 2;
		
		// 식별자 이름은 공백을 포함할 수 없음
		int birthDay = 1004;
//		int birth Day = 1004;
		
		// 예약어는 식별자로 사용 불가
//		int static = 123;
		int staticABC = 123;
	}
	
}
