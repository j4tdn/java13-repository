package homework;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter decimal number to convert: ");
		int n = ip.nextInt();
		System.out.println("Binary number: "+ toBinary(n));
	}
	private static String toBinary(int n) {
		int [] a = new int[60];
		int i = 0;
		String s;
		if(n < 0) s = "- ";
		else s = "";
		while(Math.abs(n) > 0) {
			a[i++] = n % 2; 
			n = n/2;
		}
		for(int j = i - 1; j >= 0; j--) {
			s = s + a[j];
		}
		return s;
	}
}
