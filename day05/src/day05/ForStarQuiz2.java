package day05;

import java.util.Scanner;

public class ForStarQuiz2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = N; j > i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
