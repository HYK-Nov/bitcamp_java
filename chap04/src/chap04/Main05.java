package chap04;

import java.util.ArrayList;
import java.util.Arrays;

public class Main05 {
	public static void main(String[] args) {
		String[] numbers_08 = {"one", "two", "three"};
		
		for (String number : numbers_08) {
			System.out.println(number);
		}
		
		ArrayList<String> numbersList_08 = new ArrayList<>(Arrays.asList(numbers_08));
		
		for(String number : numbersList_08) {
			System.out.println(number);
		}
	}
}
