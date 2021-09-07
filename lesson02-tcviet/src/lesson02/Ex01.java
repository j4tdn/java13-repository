package lesson02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = sc.nextInt();
		if(isExponentiationofTwo(number)) {
			System.out.println(number + " la luy thua cua 2");
		}
		else {
			System.out.println(number + " khong phai la luy thua cua 2");

		}
		sc.close();
	}

	private static boolean isExponentiationofTwo(int number) {
		double log_double = Math.log(number)/Math.log(2);
		int log_int = (int) Math.floor(log_double);
		if(log_int == log_double) { 
			return true;
		}
		else return false;
			
		
		
	}
}
