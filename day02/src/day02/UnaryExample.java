package day02;

public class UnaryExample {

	public static void main(String[] args) {
		// ���� ������ ++, --
		int i = 1;
		int j = i++; // ���� �����ڴ� ���� �ش� �ڵ带 �����ϰ�, �� �Ŀ� ������ ������ ������.
		/*
		 * int j = i�� ���� �����ϰ� ( i = 1 )
		 * i++�� ������ 1�� ���� ( i = 2 )
		 * ���������� j�� 1, i�� 2�� ������
		 */		
		System.out.println(i + " " + j);
		
		int x = 1;
		int y = ++x;
		/*
		 * ++x�� ���� �����Ͽ� x�� 1�� ���� ( x = 2 )
		 * int y = x�� �����ؼ� y�� x ���� ������ ( y = 2 )
		 * x�� 2, y�� 2
		 */
		System.out.println(x + " " + y);
	}

}
