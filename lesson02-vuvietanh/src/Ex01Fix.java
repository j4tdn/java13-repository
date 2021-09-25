import java.awt.image.RescaleOp;

public class Ex01Fix {
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 17, 64, 53, 14, 20, 32 };
		for (int number : numbers) {
			boolean result = isPowerof2(number);
			System.out.println(number + " : " + result);
			
		}
	}

	private static boolean isPowerof2(int n ) {
		if (n == 0) {
			return false;
		}
		double base = Math.log(n) / Math.log(2);
		return Math.ceil(base) == Math.floor(base);
	}
}
