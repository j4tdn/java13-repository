package ex02;

// 14đ
public class App {
	public static void main(String[] args) {
		// int A[] = { 3, 2, 1, 6, 5 };
		int A[] = { 3, 7, 9, 2, 1, 6, 8, 4, 10 };
		System.out.println("Số còn thiếu trong mảng A là: " + getMissingNumber(A));
	}

	// Bài làm tốt - A hiểu các làm
	// Nhưng với n lớn em làm như này complexity sẽ là O(n2) chưa tốt
	// Hoặc e có thể áp dụng công thức tìm missing number
	// Với giá trị từ 1 đến n
	// missing number = n * (n + 1) - sum(array with missing number)
	// VD: n = 5, array = {1,2,4,5}
	// missing = 5 * 6 / 2 - (1 + 2 + 4 + 5) = 3
	
	public static int getMissingNumber(int arr[]) {
		for (int i = 1; i <= arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j])
					count++;
			}
			if (count == 0) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}
}
