package api.util.date;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 0���� ����
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); // �Ͽ����� 1
		String[] weekStr = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(new StringBuffer("������ ").append(year).append("�� ")
				.append(month).append("�� ").append(day).append("�� �Դϴ�."));
		System.out.println(new StringBuffer().append(hour).append("�� ").append(minute).append("�� ")
				.append(second).append("�� ").append(weekStr[week-1]).append("����"));
	}

}
