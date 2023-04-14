package day04;

public class ForQuiz {

	public static void main(String[] args) {
		// 랜덤 구구단
		// 구구단의 범위는 1 ~ 9까지
		// Math.random()을 활용(0 ~ 8)
		// 난수로 얻은 값에 1 ~ 9로 곱한 값을 for문을 이용해 9바퀴 돌려서 콘솔에 찍기
		
		int num = (int)(Math.random() * 9) + 1;
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
