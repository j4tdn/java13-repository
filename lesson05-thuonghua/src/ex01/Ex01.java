package ex01;

public class Ex01 {
	public static void main(String[] args) {
		if (isPowerOf(4, 3)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean isPowerOf(int a, int b) {
		
		double log = Math.log(a) / Math.log(b);
		double log1 = Math.log(b) / Math.log(a);
		
		int logi = (int) (Math.floor(log));
		int logi1 = (int) (Math.floor(log1));
		
		if (log - logi == 0 || log1 - logi1 == 0) {
			return true;
		} else {
			return false;
		}
	}

}