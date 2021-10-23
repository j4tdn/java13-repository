package ex02;

/**
 * Nhớ format code
 * 15đ
 */
public class GetMissingNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 2, 8, 6, 9, 10, 7 };
		int n = getMissingNumber(arr, 10);
		System.out.println("Số còn thiếu: " + n);
	}

	private static int getMissingNumber(int[] arr, int n) {
		// Cách làm tốt. E chỉ edit tên biến
		int total = 0;
		for (int j : arr) {
			total = total + j;
		}
		return (n * (n + 1) / 2) - total;
	}
}
