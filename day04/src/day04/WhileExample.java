package day04;

public class WhileExample {
	public static void main(String[] args) {
		int count = 0; // while 반복문 로직 파악을 위한 예시
		
		while(count < 3){
			count++;
			System.out.println("While이 실행중입니다. " + count);
		}
		
		count = 0;
		
		while(count <= 5) {
			System.out.println("test " + count);
			count++;
		}
	}
}
