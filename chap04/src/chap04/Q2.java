package chap04;

public class Q2 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		
		while (count <= 1000) {
			if (count % 3 == 0) {
				sum += count;
			}
			count++;
		}
		
		System.out.println(sum);
	}
}
