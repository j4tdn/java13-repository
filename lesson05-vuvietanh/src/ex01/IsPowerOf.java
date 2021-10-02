package ex01;

public class IsPowerOf {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 4));
	}
	private static boolean isPowerOf(int a, int b) {
		if (a == 0 || a == 1 ) {
			return false;
		}
		if (a < 1) {
			a = 1 / a;
		}
		if (b == 0 || b == 1) {
			return false;
		}
		while(a != b) {
			if (a % b != 0 ) {
				return false;
			}
			a /= b;
		}
		return true;
	}
}
