package lesson02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = sc.nextInt();
		int keepNumber = number;
		int baseTwo = 0;
		int i = 1;
		do {
			baseTwo = baseTwo + i * (number % 2);
			number/=2;
			i*=10;
		}
		while(number>0);
		System.out.print("Base 2 of " + keepNumber + " is: " + baseTwo);
		sc.close();
	}
}
