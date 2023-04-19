package api.lang.string;

public class StringSubstring {

	public static void main(String[] args) {
		// 주민번호 양식
		String ssn = "991231-1234567";
		System.out.println(ssn);
		
		/*
		 * - subString() 메서드에 매개 값으로 인덱스를 1개 지정시
		 *   해당 인덱스부터 마지막 지점까지 문자 추출
		 */
		String last = ssn.substring(7);
		System.out.println(last);
		
		/*
		 * - subString() 메서드에 매개 값으로 인덱스를 2개 지정시
		 *   첫 번째 매개 값 이상 두 번째 매개값 미만 범위 문자를 추출
		 */
		String first = ssn.substring(0, 6);
		System.out.println(first);
	}

}
