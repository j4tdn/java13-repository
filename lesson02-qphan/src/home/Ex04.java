package home;

/**
 * Viết chương trình nhập vào một dãy các số nguyên từ bàn phím. 
 * Tìm số lẻ lớn nhất trong dãy số và in ra.
 * Gợi ý : 5 1 9 11 20 19 17 21 30 => Kết quả : 21
 */
public class Ex04 {
	public static void main(String[] args) {
		System.out.println("max odd: " + maxOdd(100, 6, -19, 15, 22, -33, 44, 52, -15));
		System.out.println("max odd: " + maxOdd(2, 4, 6, 8));
		System.out.println("max odd: " + maxOdd());
		System.out.println("max odd: " + maxOdd(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}
	
	private static int maxOdd(int... digits) {
		// precondition
		// get all the odd elements in array >> return oddArray
		// use oddArray for the code below
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] % 2 != 0 &&  digits[i] > max) {
				max = digits[i];
			}
		}
		if (max == Integer.MIN_VALUE) {
			// depends on requirement
			System.out.println("Log[Array has no odd number]");
			return 1;
		}
		return max;
	}
}
