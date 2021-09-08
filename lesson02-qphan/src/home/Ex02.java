package home;

/**
 * Bài 2: Viết chương trình tính tổng S = 4! + 7! + 12! + 18!
 */
public class Ex02 {
	public static void main(String[] args) {
		long result = fact(4, 7, 12, 18);
		System.out.println("result: " + result);
	}
	
	// variables ...
	// 1. array with data type
	// 2. aggregation of parameters >> 0 or n parameters
	private static long fact(int ... numbers) {
		long result = 0;
		for (int number: numbers) {
			result += fact(number);
		}
		return result;
	}

	private static long fact(int n) {
		long fact = 1;
		while (n > 1) {
			fact *= n;
			n--;
		}
		return fact;
	}
}
