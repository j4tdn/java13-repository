package io;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Random a numberwith 3 digits >> 000 - 999
		// Eg: 001 070 920...
		Random rd = new Random();
		System.out.println("" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println(number + " is even number");
		} else {
			System.out.println(number + " is odd number");
		}
	
	}
	
}
