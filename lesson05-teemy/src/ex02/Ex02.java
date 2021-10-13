package ex02;

/**
 * 12đ
 */
public class Ex02 {
	public static void main(String[] args) {
		int n = 9;
		int[] a = { 3, 8, 9, 2, 1, 6, 5, 4 };
		System.out.println(getMissingNumber(a, n));

	}

	private static int getMissingNumber(int[] a, int n) {
		// mặc định các phần b[i] đã = 0 rồi
		int[] b = new int[n + 1];
		// những đoạn for hay if else nhớ thêm {} e nha
		// good way. A hiểu cách làm
		// Nhưng e có thể thinking cách này nhanh hơn. Với n = 6
		// Em có thể lấy n*(n+1)/2 - sum(a[...])
		// result = 6*7/2 - (1+5+6+2+4) = 3
		for (int i = 0; i < n - 1; i++) {
			b[a[i]]++;
		}
		for (int i = 1; i < n + 1; i++)
			if (b[i] == 0) {
				return i;
			}
		return -1;

	}
}
