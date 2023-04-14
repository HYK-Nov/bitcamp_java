package chap04;

public class Q5 {

	public static void main(String[] args) {
		int[] marks_08 = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		int sum = 0;
		
		for(int i : marks_08) {
			sum += i;
		}
		
		System.out.println(sum / marks_08.length);
	}

}
