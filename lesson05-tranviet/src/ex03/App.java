package ex03;

public class App {
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 5, 6, 8, 9 };
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

	public static int BCNN(int arr[]) {
		int bcnn = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			bcnn = getLeastCommonMultiple(arr[i], arr[i + 1]);
			arr[i + 1] = bcnn;
		}
		return bcnn;
	}
}
