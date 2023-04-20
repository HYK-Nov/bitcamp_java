package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginQuiz {
	public static void main(String[] args) {
		/*
		 * <로그인 입력 값 검증>
		 * 
		 * 1. 입력 받은 아이디가 맵에 입력된 키 값에
		 *    해당하는지의 여부 검사(containsKey 메서드 사용)
		 * 2. 맞다면 다시 한번 비밀번호의 값과 비교하여 비밀번호도 일치하면
		 *    "로그인 성공"을 콘솔에 출력하고 반복문을 탈출
		 * 3. 비밀번호가 다르다면 "비밀번호가 틀렸습니다"를 출력
		 * 4. 입력받은 아이디가 맵에 입력된 키 값이 아니라면
		 *    "아이디가 존재하지 않습니다"를 출력
		 *    
		 * 문제: Scanner를 이용, 아이디와 비밀번호 입력 받고 미리 생성된 HashMap에 저장
		 *     ID와 PW 물어보고 로그인 입력 값 검증 수행     
		 */
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		System.out.println("*** 회원 가입 시작 ***");
		System.out.print("- ID 등록: ");
		String ID = scan.next();
		
		System.out.print("- PW 등록: ");
		String PW = scan.next();
		
		map.put(ID, PW);
		System.out.println("====================");
		
		System.out.println("아이디와 비밀번호 입력:");
		System.out.print("ID: ");
		String inputID = scan.next();
		
		System.out.print("PW: ");
		String inputPW = scan.next();
		
		if (map.containsKey(inputID)) {
			if(map.get(inputID).equals(inputPW)) System.out.println("로그인 성공");
			else System.out.println("로그인 실패");
		}else System.out.println("로그인 실패");
	}
}
