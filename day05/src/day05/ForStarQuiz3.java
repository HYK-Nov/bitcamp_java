package day05;

import java.util.Scanner;

public class ForStarQuiz3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
				
		for (int i = 1; i <= N; i++) {
			for (int j = N; j > i; j--) {
				System.out.printf(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
