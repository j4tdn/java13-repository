package hw;

public class Ex02 {

	public static void main(String[] args) {
		long S = ex02(4) + ex02(7) + ex02(12) + ex02(18);
		System.out.println("S = " + S);
	}
	private static long ex02(int input) {
		long s = 1;
		for (int i = 1; i <= input; i++) {
			s *= i;
		}
		return s;
	}

}
