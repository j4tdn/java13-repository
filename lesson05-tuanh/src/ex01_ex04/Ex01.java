package ex01_ex04;
import static java.lang.Math.*;
/**
 * Bài 1: Viết hàm kiểm tra một số có phải là lũy thừa của một số khác không?
 */
public class Ex01 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}
	
	private static boolean isPowerOf(int a, int b) {
		if(a == 0)
			return false;
		if(a == 1 || a == b)
			return true;
		double base = log(a)/log(b);
		return ceil(base) == floor(base);
	}
}
