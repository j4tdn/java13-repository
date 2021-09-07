package Exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = input.nextInt();
		if (powerFunction(n)) System.out.println(n + " is power of 2");
		else System.out.println(n + " is not power of 2");
	}
	
	public static boolean powerFunction(int n) {
		if (n == 0) return false;
		if (n == 1) return true;
		return n % 2 == 0 ? powerFunction(n/2) : false;
	}
	
}