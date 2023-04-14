package chap04;

public class Main02 {
	public static void main(String[] args) {
		int month_08 = 8;
		String monthString_08 = "";
		
		switch (month_08) {
			case 1: monthString_08 = "January"; break;
			case 2: monthString_08 = "February"; break;
			case 3: monthString_08 = "March"; break;
			case 4: monthString_08 = "April"; break;
			case 5: monthString_08 = "May"; break;
			case 6: monthString_08 = "June"; break;
			case 7: monthString_08 = "July"; break;
			case 8: monthString_08 = "August"; break;
			case 9: monthString_08 = "September"; break;
			case 10: monthString_08 = "October"; break;
			case 11: monthString_08 = "November"; break;
			case 12: monthString_08 = "December"; break;
			default : monthString_08 = "Invalid month"; break;
		}
		System.out.println(monthString_08);
	}
}
