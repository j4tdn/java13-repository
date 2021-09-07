package exercises;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("S = 4! +7! + 12! + 18! = ");
		
		long result = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		
		System.out.println(result);
	}
	
	public static long factorial(int number) {
		long factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
