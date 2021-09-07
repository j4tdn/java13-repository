package Exercise;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = input.nextInt();
		if (isReverNumber(n)) System.out.println(n +" is reverse number");
		else System.out.println(n + " is not reverse number");
	}
	
	public static int reverseNumber(int n) {
		int rn = 0;
		while (n != 0) {
			int temp = n % 10;
			rn = rn * 10 + temp;
			n /= 10;
		}
		return rn;
	}
	
	public static boolean isReverNumber(int n) {
		return n == reverseNumber(n);
	}
}
