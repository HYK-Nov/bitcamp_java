package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date(); // java.util.Date
		System.out.println(date);
		
		Date date2 = new Date(122, 10 , 9, 18, 30, 0);
		System.out.println(date2);
		
		// 날짜 양식 바꾸기
		// 1. SimpleDateFormat 객체를 생성하는데, 표현양식을 넣어 생성
		// 예시) 2023년 4월 20일 10시 09분 28초 형식으로 양식 생성
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		// 2. sdf.format(Date타입변수); 를 넣어서 콘솔에 출력
//		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf = new SimpleDateFormat("오늘은 E요일입니다. 오늘은 1년중 D번째 날입니다.");
		System.out.println(sdf.format(date));
	}

}
