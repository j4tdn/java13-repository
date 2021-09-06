package lesson02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number = ip.nextInt();
		int original = number;
		int sym;
		
		for (sym = 0; number != 0; number /= 10) {
			int digit = number % 10;
			sym = sym*10 + digit;
		}
		if (sym == original) {
			System.out.println(original + " is symmetry" );
		}else
		System.out.println(original + " isn't symmetry");
	}
}
