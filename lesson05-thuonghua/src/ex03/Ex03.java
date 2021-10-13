package ex03;

/**
 * Nhớ format code
 * 18đ
 */
public class Ex03 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 6, 12, 7 };
		System.out.println("Bội chung nhỏ nhất của mảng là: " + getLeastCommonMultiple(a));
	}

	// KHÔNG được đặt tên hàm tiếng việt
	private static int UCLN(int a, int b) {
		if (a == b)
			return a;
		if (a > b)
			return UCLN(a - b, b);
		else
			return UCLN(a, b - a);
	}

	// KHÔNG được đặt tên hàm tiếng việt
	private static int BCNN(int a, int b) {
		return (a * b / UCLN(a, b));
	}

	// good
	private static int getLeastCommonMultiple(int a[]) {
		// Nên check a.length >= 2 trước khi sử dụng a[0,1]
		// Tránh ArrayIndexOutOfBoundException
		int temp = BCNN(a[0], a[1]);
		for (int i = 2; i < a.length; i++) {
			temp = BCNN(temp, a[i]);
		}
		return temp;
	}
}
