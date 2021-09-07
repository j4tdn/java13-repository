package lesson02;

public class Ex02 {
	public static void main(String[] args) {

		System.out.println("Tong 4! + 7! + 12! + 18! la: " + mul(4) + mul(7) + mul(12) + mul(18));

	}

	private static long mul(int n) {
		long b = 1;
		for (int i = 1; i <= n; i++) {
			b *= i;
		}
		
		return b;
		
	}
}
