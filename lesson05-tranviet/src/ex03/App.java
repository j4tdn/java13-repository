package ex03;

// 17đ
public class App {
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 12, 8};
		System.out.println("Bội chung nhỏ nhất của mảng A là: " + BCNN(A));
	}

	public static int getCommomDivisor(int a, int b) {
		if (a == 0 || b == 0) {
			return a + b;
		}
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	public static int getLeastCommonMultiple(int a, int b) {
		return a * b / getCommomDivisor(a, b);
	}

	// KHÔNG được đặt tên hàm, biến bằng tiếng việt
	// Em đặt getLeastCommonMultiple cũng được
	public static int BCNN(int arr[]) {
		// Nên kiểm tra length >= 2 trước rồi gán initial value = lcm(a[0], a[1])
		int lcm = getLeastCommonMultiple(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			// short version
			lcm = getLeastCommonMultiple(lcm, arr[i]);
		}
		return lcm;
	}
}
