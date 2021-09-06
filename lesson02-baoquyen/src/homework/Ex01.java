package homework;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Enter n: ");
		n = input.nextInt();
		if(isPowerOf2(n)) System.out.println(n + " is power of 2");
		else System.out.println("is NOT power of 2");
		
	}
	private static boolean isPowerOf2(int n) {
		int i  = n;
		while(i > 1 && i% 2 == 0 ) {
			i = i /2;
		}
		if (i == 1)return true;
		else return false;

	}
}
