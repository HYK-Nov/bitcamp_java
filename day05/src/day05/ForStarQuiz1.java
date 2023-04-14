package day05;

import java.util.Scanner;

public class ForStarQuiz1{
    public static void main(String[] agrs){
    	Scanner scan = new Scanner(System.in);
    	
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        scan.close();
    }
}