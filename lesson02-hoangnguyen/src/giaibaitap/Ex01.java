package giaibaitap;

import java.util.Scanner;

/**
 * 
 * VD: 2^a = n. Điều kiện a là số nguyên : 2 4 8 16 32 64 >> is power of 2
 * double base = Math.log(n) / Math.log(2); return Math.pow(2, base) == n;
 */

public class Ex01 {

	public static void main(String[] args) {

		double[] numbers = { 0, 2, 0.25, 4, 6, 18, 23, 64, 50 };

		for (double number : numbers) {
			boolean isPower = isPowerOfTwoCode(number);
			System.out.println(number + ": " + isPower);
		}

	}

	private static boolean isPowerOf2(double n) {
		if (n == 0) {
			return false;
		}

		double base = Math.log(n) / Math.log(2);
		return Math.ceil(base) == Math.floor(base);
	}

	private static boolean isPowerOfTwoCode(double n) {
		
		if (n == 0 || n == 1) 
			return false;
		
		if(n < 1) {
			n = 1 / n;
		}

		while (n != 2) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}
}
