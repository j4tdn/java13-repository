package ex01_ex04;
import static java.lang.Math.*;
/**
 * Bài 1: Viết hàm kiểm tra một số có phải là lũy thừa của một số khác không?
 * 8đ
 */
public class Ex01 {
	// Em đọc đề bị thiếu
	// Cho 2 số a,b kiểm tra a có phải là lũy thừa của b không 
	// và ngược lại b có phải là lũy thừa của a ko
	
	// VD có thể sửa lại như sau, hoặc viết thêm 1 hàm tùy em
	// System.out.println("isPower: " + (a > b ? isPowerOf(a, b) : isPowerOf(b, a)));
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}
	
	private static boolean isPowerOf(int a, int b) {
		if(a == 0) return false;
		if(a == 1 || a == b) return true;
		double base = log(a)/log(b);
		return ceil(base) == floor(base);
	}
}
