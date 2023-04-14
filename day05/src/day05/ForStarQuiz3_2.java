package day05;

import java.util.Scanner;

public class ForStarQuiz3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = N; j > 0; j--) {
				if (j > i) {
					System.out.printf(" ");
				} else {
					System.out.printf("*");
				}
			}
			
			System.out.println();
		}
		
		scan.close();
	}

}
