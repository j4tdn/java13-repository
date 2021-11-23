package ex03;

public class App {
	public static void main(String[] args) throws Exception {
		int A[] = { 40, 6, 60 };
		try {
			System.out.println("Bội chung nhỏ nhất của mảng A là: " + lcm(A));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// BCNN: LeastCommonMultiple
	public static int lcm(int A[]) throws Exception {
		if (A.length < 2) {
			throw new Exception("array must have at least two elements!");
		}
		int lcm = lcm(A[0], A[1]);
		for (int i = 2; i < A.length; i++) {
			lcm = lcm(lcm, A[i]);
		}
		return lcm;

	}

	public static int lcm(int a, int b) {
		return a * b / gcm(a, b);
	}

	// UCLN: GreatestCommonMultiple
	public static int gcm(int a, int b) {
		if (a == b) {
			return a;
		} else {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return gcm(a, b);
	}

}
