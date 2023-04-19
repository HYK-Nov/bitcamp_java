package api.lang.string;

public class StringTrim {

	public static void main(String[] args) {
		// trim은 좌측, 우측에서 다른 단어가 나오기 직전까지 공백을 전부 제거
		String trimBefor = "             거슬려요      ";
		System.err.println(trimBefor);
		String trimAfter = trimBefor.trim();
		System.out.println(trimAfter);
	}

}
