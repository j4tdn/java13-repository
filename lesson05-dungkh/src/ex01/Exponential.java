package ex01;

/**
 * Nhớ format code -1
 * 50% >> 9đ
 */
public class Exponential {
	public static void main(String[] args) {
		System.out.println("(8,2) " + isPowerOf(8, 2));
		System.out.println("(2,8) " + isPowerOf(2, 8)); // wrong result
		System.out.println("(20,4) " + isPowerOf(20, 4));
		System.out.println("(64,4) " + isPowerOf(64, 4));
		System.out.println("(1,2) " + isPowerOf(1, 2));
	}

	// fixing
	private static boolean isPowerOf(double a, double b) {
		if (a == 0) {
			return false;
		}
		if (a == 1) {
			return true;
		}
		return a > b ? isPower(a, b) : isPower(b, a);
	}

	// Em mới làm được 1 case là kiểm tra a có phải là bội của b
	// Ngược lại chưa được
	private static boolean isPower(double a, double b) {
		while (a != 1) {
			if (a % b != 0) {
				return false;
			}
			a = a / b;
		}
		return true;
	}

}
