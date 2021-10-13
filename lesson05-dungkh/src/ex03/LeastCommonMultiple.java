package ex03;

/**
 * 17đ
 */
public class LeastCommonMultiple {
	public static void main(String[] args) {
		int[] A = { 2, 3 };
		int[] B = { 2, 3, 4 };

		System.out.println("LeastCommonMultiple A: " + getLeastCommonMultiple(A));
		System.out.println("LeastCommonMultiple B: " + getLeastCommonMultiple(B));
	}

	private static int getLeastCommonMultiple(int[] array) {
		// Nên cho biết bcnn = BNCC(array[0], array[1])
		// Tránh sót case mảng vào là các số nhỏ hơn 1
		int bcnn = 1;
		for (int i = 0; i < array.length; i++) {
			bcnn = BCNN(bcnn, array[i]);
		}
		return bcnn;
	}

	// KHÔNG được đặt tên hàm tiếng việt
	// greatest common multiple >> gcd
	private static int UCLN(int a, int b) {
		if (b == 0)
			return a;
		return UCLN(b, a % b);
	}

	// KHÔNG được đặt tên hàm tiếng việt
	// least common multiple lcm
	private static int BCNN(int a, int b) {
		return (a * b) / UCLN(a, b);
	}

}
