package ex01;

import static java.lang.Math.*;

/**
 * Nhớ format code
 * 13đ
 */
public class Ex01 {
	public static void main(String[] args) {
		double a = 64;
		double b = 4;
		System.out.println(isPowerOf(a, b));
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