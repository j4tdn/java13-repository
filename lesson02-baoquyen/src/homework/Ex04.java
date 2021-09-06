package homework;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		int [] a;
		int n, ans = 0;
		System.out.print("Enter the size of array number: ");
		n = input.nextInt();
		a = new int[n];
		for(int i = 0; i< n; i++) {
			System.out.print("a[ "+ i+ " ]");
			a[i] = input.nextInt();
		}
		for(int i = 0; i< n; i++) {
			if(isOddNumber(a[i])) {
				if(ans == 0) ans = a[i];
				else if(a[i]> ans) ans = a[i];
			}
		}
		if(ans == 0) System.out.println("There are no odd number in the array");
		else System.out.println("the largest odd number is: "+ ans);
	}
	private static boolean isOddNumber(int n) {
		return n % 2 != 0;
	}
}
