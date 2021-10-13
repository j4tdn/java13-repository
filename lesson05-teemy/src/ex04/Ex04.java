package ex04;

/**
 * 15đ
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] a = { 3, 15, 21, 0, 15, 17, 21 };
		int[] b = getUniqueNumbers(a, a.length);
		System.out.print(b[0] + "  ");
		for (int i = 1; i < b.length; i++) {
			if (b[i] == 0)
				break;
			System.out.print(b[i] + "  ");
		}
	}

	// KQ đúng như cách làm chưa pass
	private static int[] getUniqueNumbers(int[] a, int n) {
		// Vì sao mảng b lại có length bằng 101 ???
		int[] b = new int[101];
		int max = a[0];
		for (int i = 0; i < 101; i++) {
			b[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			// Có thể e quen với idea code thế này. 
			// Nhưng cách code này hơi rối và a thấy chưa hay lắm
			// b[value] >> với value là chỉ số của phần tử trong b
			// E lại đưa b[ value của a[i]]
			b[a[i]]++;
			if (max < a[i]) {
				max = a[i];
			}
		}
		int[] c = new int[n];
		int j = 0;
		for (int i = 0; i <= max; i++) {
			if (b[i] == 1) {
				c[j] = i;
				j++;
			}
		}
		return c;
	}
}
