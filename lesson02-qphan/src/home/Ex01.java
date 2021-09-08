package home;

import static java.lang.Math.*;

/**
 * Bài 1: Viết chương trình kiểm tra 1 số có phải là lũy thừa của 2 hay không VD
 * : 2^a = n. Điều kiện a là số nguyên 1 2 3 4 5 6 
 * n : 2 4 8 16 32 64 >> is
 * power of 2 n : 6 12 15 17 30 50 >> not
 * 
 * double base = log(n) / log(2); return pow(2, base) == n; >> invalid with
 * value 6 >> base = 2.584962500721156
 */
public class Ex01 {
	public static void main(String[] args) {
		double[] numbers = { 0, 0.25d, 2, 4, 0.4, 6, 8, 16, 30, 25 };
		for (double number : numbers) {
			boolean isPowerOfTwo = isPowerOfTwoCode(number);
			System.out.println(number + ": " + isPowerOfTwo);
		}
		
		System.out.println("c1: " + (int)(2.6d));
		System.out.println("c1: " + (int)(2.4d));
	}

	private static boolean isPowerOfTwoMath(double n) {
		if (n == 0) {
			return false;
		}
		double base = log(n) / log(2);
		return ceil(base) == floor(base);
	}
	
	private static boolean isPowerOfTwoCode(double n) {
		// n is power of two >> TRUE  >> 2.2.2.2.2...
		//                   >> FALSE >> [2].[#2]...
		// E.g: n = 8, 30, 15
		// Step 1: n is odd  >> return false
		// Step 2: n = n / 2 >> Return step 1
		// Stop condition >> n = 2 >> return true
		
		// case n < 0
		// 2^-1 = 1/2
		// 2^-2 = 1/4
		if (n == 0 || n == 1) return false;
		
		if (n < 1) {
			n = 1/n;
		}
		while(n != 2) {
			if (isOdd(n)) return false;
			n = n / 2;
		}
		return true;
	}
	
	private static boolean isOdd(double n) {
		return n % 2 != 0;
	}
}