package example.encap.good;

public class MyBirthDay {

	/*
	 * 은닉(캡슐화) 시 변수는 무조건 private 처리
	 */
	private int year;
	private int month;
	private int day;

	// alt + shift + s 혹은 마우스 우클릭 -> source > generate constructor using fields
	public MyBirthDay(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}

	/*
	 * 은닉된 변수에 접근하기 위해서는 클래스 설계시 미리 설정해둔 setter/getter 메서드를 이용해 데이터에 접근해야 함
	 */

	/*
	 * - setter 메서드 선언 1. setter 메서드는 은닉변수에 값을 저장(세팅)하기 위해 선언 2. 메서드의 접근제한자는
	 * public으로 설정하고 이름은 일반적으로 set+변수명 으로 지정
	 */
	public void setYear(int year) {
		if (year < 1 || year > 2023) {
			this.year = 2023;
		} else {
			this.year = year;
		}
	}

	public void setMonth(int month) {
		if (month > 12) {
			this.month = month % 12;
		} else if (month < 1) {
			this.month = (-month % 12);
		} else {
			this.month = month;
		}
	}

	public void setDay(int day) {
		if (day < 1 || day > 31) {
			this.day = 1;
		} else {
			this.day = day;
		}
	}

	/*
	 * - getter 메서드 선언 1. getter 메서드는 말 그대로 수를 get하는 용도 2. 값을 조회만 할 수 있고 변경은 불가능하기
	 * 때문에 보안성을 높여줍니다 3. 이름은 마찬가지로 get+변수명을 사용해 만듦
	 */
	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}
}
