package api.lang.string;

import java.util.Scanner;

public class StringIndexOfQuiz {

	public static void main(String[] args) {
		// 1. 특정 문장을 스캐너로 입력받기
		// 2. 1에서 입력받은 문장에서 조회할 단어 적기
		// 3. 단어가 몇 개 있는지 카운팅하고, 몇 번 인덱스에 각각 있는지 콘솔에 찍기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(new StringBuffer("전체 문장을 입력해주세요."));
		String str = scan.next();
		
		System.out.println(new StringBuffer("찾을 단어을 입력해주세요."));
		String search = scan.next();
		
		int count = 0;
		
		System.out.println(new StringBuffer(str).append("에서 ").append(search).append("을(를) 찾습니다."));
		
		for (int i = 0; i < str.length(); i++) {
			if(str.indexOf(search, i) > -1) {
				System.out.println(new StringBuffer("단어 감지 인덱스: ").append(str.indexOf(search, i)));
				i = str.indexOf(search, i);
				count++;
			}else break;
		}
		
		System.out.println(new StringBuffer("단어 찾기 종료"));
		System.out.println(new StringBuffer(search).append("의 갯수는 ").append(count).append("개 입니다."));
	}
}
