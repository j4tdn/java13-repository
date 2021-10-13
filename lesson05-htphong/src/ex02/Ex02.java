package ex02;

/**
 * 12đ
 */
public class Ex02 {
	public static void main(String[] args) {
		int n = 6;
		int[] a = { 3, 2, 1, 6, 5 };
		System.out.println(getMissingNumber(a, n));
	}

	public static int getMissingNumber(int[] a, int n) {
		int k = 1;
		int count = 0;
		// E đang cho duyệt k từ 1 đến n
		// Nếu phần từ thứ k không thuộc trong mảng a >> missing number
		// Good way. Nhưng complexity chưa tốt
		// Em thử áp dụng công thức tìm missing number = (n)*(n+1)/sum(array)
		while (k <= n) {
			for (int i = 0; i < a.length; i++) {
				if (k == a[i])
					count++;
			}
			if (count == 0) {
				return k;
			}
			k++;
			count = 0;
		}
		return 0;
	}

}
