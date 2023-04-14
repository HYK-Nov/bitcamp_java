package day04;

public class WhileExample2 {

	public static void main(String[] args) {
		// 무한루프는 어덯게 판단해도 "true" 가 나올 수 밖에 없는
		// 조건식을 while문 조건식에 집어넣으면 만들어짐
		// 일반적으로는 절대 종료되지 않으므로 강제로 종료 버튼을 눌러야 해결됨
		
		while(true) {
			System.out.println("무 한 루 프");
		}
	}

}
