package ex03;

/**
 * 15đ
 */
public class Ex03 {
	public static void main(String[] args) {
		int n = 3;
		int[] a = { 2, 3, 4 };
		System.out.println(getLeastCommonMultiple(a, n));
	}

	// good
	private static int getLeastCommonMultiple(int[] a, int n) {
		// Nên kiểm tra xem a.length >= 1 trước khi sử dụng a[0]
		// Tốt nhất là nên gán tam = getLeastCommon(a[0], a[1])
		// check length >= 2 trước
		// Tên biến KHÔNG được đặt tiếng việt
		int tam = a[0];
		for (int i = 1; i < n; i++) {
			tam = getLeastCommon(tam, a[i]);
		}
		return tam;
	}

	private static int getLeastCommon(int x, int y) {
		int m = x;
		int n = y;

		// Có thể tách ra thành hàm tìm ước chung lớn nhất
		// greatest common multiple
		while (m != n) {
			if (m > n) {
				m = m - n;
			} else
				n = n - m;
		}
		return (x * y) / m;
	}

}
