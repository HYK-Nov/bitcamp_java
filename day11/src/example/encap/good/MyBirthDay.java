package example.encap.good;

public class MyBirthDay {

	/*
	 * ����(ĸ��ȭ) �� ������ ������ private ó��
	 */
	private int year;
	private int month;
	private int day;

	// alt + shift + s Ȥ�� ���콺 ��Ŭ�� -> source > generate constructor using fields
	public MyBirthDay(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	void showDateInfo() {
		System.out.println("�� ������");
		System.out.println(year + "�� " + month + "�� " + day + "��");
	}

	/*
	 * ���е� ������ �����ϱ� ���ؼ��� Ŭ���� ����� �̸� �����ص� setter/getter �޼��带 �̿��� �����Ϳ� �����ؾ� ��
	 */

	/*
	 * - setter �޼��� ���� 1. setter �޼���� ���к����� ���� ����(����)�ϱ� ���� ���� 2. �޼����� ���������ڴ�
	 * public���� �����ϰ� �̸��� �Ϲ������� set+������ ���� ����
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
	 * - getter �޼��� ���� 1. getter �޼���� �� �״�� ���� get�ϴ� �뵵 2. ���� ��ȸ�� �� �� �ְ� ������ �Ұ����ϱ�
	 * ������ ���ȼ��� �����ݴϴ� 3. �̸��� ���������� get+�������� ����� ����
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
