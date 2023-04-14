package day05;

public class Quiz {

	public static void main(String[] args) {	
		int x = 1;
		int y = 1;
		
		while(4 * x <= 60) {
			
			while((4 * x) + (5 * y) < 60) y++;
			
			if ((4 * x) + (5 * y) == 60) {
				System.out.println("x = " + x);
				System.out.println("y = " + y);
			}
			
			y = 1;			
			x++;
		}
	}

}
