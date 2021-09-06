package homework;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n, x, t = 0;
		System.out.print("Enter number:");
		n = ip.nextInt();
		x = n;
		while(x > 0) {
			t = t*10 + x%10; 
			x = x/10;
		}
		if (t == n) System.out.println(n + " is palindrome number");
		else System.out.println(n + " is NOT palindrome number");
	}
}
