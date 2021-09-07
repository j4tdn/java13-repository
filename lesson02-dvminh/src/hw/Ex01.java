package hw;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = ip.nextInt();
		ex01(a);
		
	}
	
	private static void ex01(int input) {
		int n = 0;
		while(n*n <= input) {
			if (n*n == input) {
				System.out.println(input + " true");
				return;
			}
			n++;
		}
		System.out.println(input + " false");
	}

}
