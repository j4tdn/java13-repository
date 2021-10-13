package ex01;

import static java.lang.Math.*;

/**
 * 13đ
 */
public class Ex01 {
	public static void main(String[] args) {
		// method name chưa đúng
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}

	private static boolean isPowerOf(double a, double b) {
		return a > b ? isPower(a, b) : isPower(b, a);
	}
	
	// code bị trùng nên a thay thế bằng cách trên nhé
	private static boolean isPower(double a, double b) {
		if (a == 0 || b == 0) {
			return false;
		}
		double base = log(a) / log(b);
		return ceil(base) == floor(base);
	}
}
