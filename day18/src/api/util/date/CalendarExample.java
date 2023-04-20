package api.util.date;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 0부터 시작
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일요일이 1
		String[] weekStr = {"일", "월", "화", "수", "목", "금", "토"};
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(new StringBuffer("오늘은 ").append(year).append("년 ")
				.append(month).append("월 ").append(day).append("일 입니다."));
		System.out.println(new StringBuffer().append(hour).append("시 ").append(minute).append("분 ")
				.append(second).append("초 ").append(weekStr[week-1]).append("요일"));
	}

}
