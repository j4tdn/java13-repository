package ex02;

/**
 * Có idea: 5đ
 */
public class Ex02 {
	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 6, 5 };
		System.out.println(getMissingNumber(6, arr));
	}

	public static int getMissingNumber(int n, int arr[]) {
		// Sao ko bỏ i vào trong vòng for
		// wrong result
		int i = 0;
		for (; i < n; i++) {
			boolean check = false;
			for (int j = 0; j < n - 1; j++) {
				if (i == arr[j]) {
					check = true;
				}
			}
			if (!check) {
				return i;
			}
		}
		return -1;
	}
}
