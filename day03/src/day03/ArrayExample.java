package day03;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// 배열 선언 - stack에 배열 주소를 담을 변수 생성
		int[] score; // int score[]; 도 가능
		
		// 배열 생성 - heap에 실제 데이터가 저장될 공간 생성
		// 배열 생성 시, 크기를 명시. 한 번 크기 세팅 시, 조정 불가
		score = new int[5]; // int 5개를 담을 수 있는 크기
		System.out.println(score); // 실제로 주소를 담고 있으므로 주소 출력
		
		// 배열 초기화 - 배열 내부에 값을 직접 저장
		// 프로그램은 순서를 0부터 시작함
		score[0] = 12;
		score[1] = 67;
		score[4] = 55;
		
		// 배열 값 참조
		System.out.printf("%d %d %d %d %d\n", score[0], score[1], score[2], score[3], score[4]);
		
		// 배열 내부 값을 문자열로 조회 -> Arrays.toString();
		System.out.println(Arrays.toString(score));
		
		// 배열 길이 -> .length
		System.out.println(score.length);
		
		// 배열 선언과 생성 동시에
		int[] iArr = new int[7];
		
		// 배열 선언과 초기화 동시에
		int[] iArr2 = {1, 3, 5, 7, 9};
		
		System.out.println(Arrays.toString(iArr2));
	}

}
