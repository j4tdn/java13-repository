package ex01;

import static java.lang.Math.*;

public class Ex01 {
	public static void main(String[] args) {
		double a=64;
		double b=4;
		System.out.println(isPowerOf(a, b));
	}

	private static boolean isPowerOf(double a,double b) {
		if ((a == 0)||(b==0)) {
			return false;
		}
		double base = log(a) / log(b);
		if (ceil(base) == floor(base)) 
			return true;
		
		base = log(b) / log(a);
		return ceil(base) == floor(base);
	}	
} 