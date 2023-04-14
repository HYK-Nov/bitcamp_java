package day03;

public class SwitchExample2 {
	public static void main(String[] args) {
		String[] foods = { "한식", "일식", "중식", "양식", "굶기" };

		int idx = (int) (Math.random() * 5);

		switch (foods[idx]) {
		case "일식":
			System.out.println("일식입니다");
			break;
		case "중식":
			System.out.println("중식입니다");
			break;
		case "양식":
			System.out.println("양식입니다");
			break;
		default:
			System.out.println("기타요리입니다");
		}
	}
}
