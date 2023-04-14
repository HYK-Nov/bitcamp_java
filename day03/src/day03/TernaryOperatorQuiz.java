package day03;

public class TernaryOperatorQuiz {

	public static void main(String[] args) {
		// 난수 발생 명령어 Math.random()은 호출 위치에
		// 0 보다는 크고 1보다 작은 난수를 발생
		int randomNumber = (int)(Math.random()*10);
		
		String result = (randomNumber > 7) ? "당첨" : "낙첨";
		
		System.out.println(result);
	}

}
