package ex02;

public class App {
	public static void main(String[] args) {
		// int A[] = { 3, 2, 1, 6, 5 };
		int A[] = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println("Số còn thiếu trong mảng A là: " + getMissingNumber(A));
	}

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
