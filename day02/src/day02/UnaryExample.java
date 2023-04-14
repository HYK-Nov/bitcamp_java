package day02;

public class UnaryExample {

	public static void main(String[] args) {
		// 증감 연산자 ++, --
		int i = 1;
		int j = i++; // 후위 연산자는 먼저 해당 코드를 수행하고, 그 후에 연산자 로직을 수행함.
		/*
		 * int j = i를 먼저 수행하고 ( i = 1 )
		 * i++을 수행해 1을 더함 ( i = 2 )
		 * 최종적으로 j는 1, i는 2를 저장함
		 */		
		System.out.println(i + " " + j);
		
		int x = 1;
		int y = ++x;
		/*
		 * ++x를 먼저 수행하여 x에 1을 더함 ( x = 2 )
		 * int y = x를 수행해서 y에 x 값을 저장함 ( y = 2 )
		 * x는 2, y는 2
		 */
		System.out.println(x + " " + y);
	}

}
