package ex03;

/**
 * Cho mảng A gồm n phần tử (2 < n < 20). Ak = [1, 10]
   Tìm bội chung nhỏ nhất của các phần tử trong mảng
	 VD1: Ak = [2, 3]    >> BCNN = 6
     VD2: Ak = [2, 3, 4] >> BCNN = 12
 */
public class App {
	public static void main(String[] args) {
		int[] numbers = { 20, 6, 40 };
		int lcm = lcm(numbers);
		System.out.println("lcm: " + lcm);
	}
	
	private static int lcm(int[] numbers) {
		int length = numbers.length;
		if (length == 0) return Integer.MIN_VALUE;
		if (length == 1) return numbers[0];
		int lcm = lcm(numbers[0], numbers[1]);
		for (int i = 2; i < length; i++) {
			lcm = lcm(lcm, numbers[i]);
		}
		return lcm;
	}
	
	// >> BCNN(a, b) = a*b/UCLN(a,b)
	// BCNN: LEAST COMMON MULTIPLE
	// UCLN: GREATEST COMMON MULTIPLE
	private static int lcm(int a, int b) {
		return a * b / gcm(a, b);
	}
	
	// a6 b8
	// a6 b2
	// a4 b2
	// a2 b2
	private static int gcm(int a, int b) {
		while(a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a; 
			}
		}
		return a;
	}
	
	// 2 = 2
	// 6 = 2 * 3
	// 8 = 2^3

	// 20 = 2^2 * 5
	// 6 = 2 * 3
	// 40 = 2^3 * 5
	// >> 120
}
