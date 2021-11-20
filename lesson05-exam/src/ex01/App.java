package ex01;

import static java.lang.Math.*;

/**
 * Viết hàm kiểm tra một số(a) có phải là lũy thừa của một số khác(b) không
 */
public class App {
	public static void main(String[] args) {
		// n = log(b)/log(a) >> power(a, n) = b;
		int a = 8;
		int b = 2;
		
		boolean isPower = isPowerOf(a, b);
		System.out.println("isPower: " + isPower);
	}

	private static boolean isPowerOf(int a, int b) {
		double n = a > b ? log(a) / log(b) : log(b) / log(a) ;
		System.out.println("n: " + n);
		return ceil(n) == floor(n);
	}
}
