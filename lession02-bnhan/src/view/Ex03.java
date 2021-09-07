package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("Nhap a");
		a = sc.nextInt();
		checkPalindrome(a);
		
	}
	public static void checkPalindrome(int n) {
		int reversed = 0 , t = 0, original  ;
		original = n;
		while ( n != 0) {
			t = n % 10;
			reversed = reversed * 10 + t;
			n /= 10;
		}
		if( reversed == original) {
			System.out.println("True");
		}
		else System.out.println("False");
	}
}
