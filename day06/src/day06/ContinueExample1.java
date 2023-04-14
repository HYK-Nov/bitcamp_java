package day06;

public class ContinueExample1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// 홀수인 경우 해당 반복을 스킵하고 시작지점으로 즉시 이동
			if (i % 2 != 0) continue;
			
			System.out.println(i);
		}
	}

}
