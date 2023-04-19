package api.lang.string;

public class StringReplace {

	public static void main(String[] args) {
		/*
		 * 자바 15버전부터 멀티라인 문자열을 지원함 
		 * 자바 문자열은 여닫는 ""를 한 줄에 작성해야했었음
		 * String a = "가나다라"; (허용)
		 * String b = "가나다
		 *                 라마바"; (허용안함)
		 * 여닫는 따옴표를 여러 줄에 걸쳐서 작성할 때는 """ 세 개를 이용
		 */
		String notice = """
				1. 우왕
				2. 좌왕
				3. 상왕
				4. 하왕
				""";
		
		System.out.println(notice);
		// replace()는 String을 리턴하고, 첫 단어를 두 번째 단어로 바꿔줌
		String newNotice = notice.replace("왕", "왕ㅋ굳ㅋ");
		System.out.println(newNotice);
	}

}
