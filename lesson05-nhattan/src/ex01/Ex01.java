package ex01;

import static java.lang.Math.*;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(8,2));
		System.out.println(isPowerOfTwo(2,8));
		System.out.println(isPowerOfTwo(6,2));
		System.out.println(isPowerOfTwo(20,4));
		System.out.println(isPowerOfTwo(64,4));
	}
	
	private static boolean isPowerOfTwo(double a, double b ) {
		if (a == 0 || b == 0) {
			return false;
		}
		double temp1 = log (a);
		double temp2 = log (b);
		double base = temp1 / temp2;
		if(ceil(base) == floor(base)){
			return true;
		}
		base = temp2 / temp1;
		return ceil(base) == floor(base);
	}
}
