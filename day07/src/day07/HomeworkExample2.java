package day07;

public class HomeworkExample2 {

	public static void main(String[] args) {
		// 리스트 사용 방식
		// 메뉴 설정
		String[] menu = {"1", "2", "3", "ㄱ", "ㄴ"};
		
		// 난수 구하기
		int idx = (int)(Math.random() * menu.length);
		
		System.out.println(menu[idx]);
	}

}
