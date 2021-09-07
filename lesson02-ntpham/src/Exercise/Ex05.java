package Exercise;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = input.nextInt();
		System.out.println("Binary : " + decimalToBinary(n));
	}
	
	public static String decimalToBinary(int n) {
		String result = "";
		while (n != 0) {
			int k = n % 2;
			result += Integer.toString(k);
			n /= 2;
		}
		return reverseString(result);
	}
	
	public static String reverseString(String s) {
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp += s.charAt(i);
		}
		return temp;
	}
}
