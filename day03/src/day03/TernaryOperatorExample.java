package day03;

public class TernaryOperatorExample {
	public static void main(String[] args) {
		// 삼항연산자는 (조건식 ? 결과1 : 결과2) 형식으로 작성
		// 해당 위치에 조건이 true 이면 결과1, false 이면 결과2
		int height = 115;

		String result = (height < 130) ? "무료" : "유료";

		System.out.println(result);
	}
}
