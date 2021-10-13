package ex03;

/**
 * 17đ
 */
public class Ex03 {
	public static void main(String[] args) {
		int arr1[] = { 2, 3 };
		int arr2[] = { 2, 3, 4 };

		System.out.println(lcm(arr1));
		System.out.println(lcm(arr2));
	}

	public static int lcm(int arr[]) {
		// Nên check arr.length >= 2
		// Tránh ArrayIndexOutOfBoundException
		int leastCommon = lcm(arr[0], arr[1]);

		for (int i = 2; i < arr.length; i++) {
			leastCommon = lcm(leastCommon, arr[i]);
		}
		return leastCommon;
	}

	public static int lcm(int a, int b) {
		int temp1 = a;
		int temp2 = b;

		// Có thể tách ra 1 hàm tìm UCLN
		// greatest common multiple - gcm
		while (a != b) {
			if (a >= b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return temp1 * temp2 / a;
	}

}
