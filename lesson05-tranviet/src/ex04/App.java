package ex04;

import java.util.Arrays;

// 18đ
public class App {
	public static void main(String[] args) {
		// convention
		// Đặt [] phía trước tên biến e nha
		// Có 2 cách nhưng convention trong Java. Làm như vậy
		int[] A = { 3, 15, 21, 0, 15, 17, 21, 30, 18 };
		int[] uniqueArray = getUniqueNumbers(A);
		System.out.println("Arrays after getting unique number and sorted: ");
		for (int i = 0; i < uniqueArray.length; i++) {
			System.out.print(uniqueArray[i] + " ");
		}
	}

	public static int[] getUniqueNumbers(int A[]) {
		int[] temp = new int[A.length];
		int numberOfTemp = 0;
		for (int i = 0; i < A.length; i++) {
			int count = 0;
			// Cách làm tương tự bài 2 về complexity O(n2)
			// Chưa tốt: VD giá trị 21
			// Em đã kiểm tra giá trị 21 trước đó duplicate 1 lần
			// Sau em lại kiểm tra thêm 1 lần nữa, hơi thừa
			for (int j = 0; j < A.length; j++) {
				// Idea tốt rồi. A chỉ chỉnh lại cho ngắn hơn 1 xíu
				if (i != j && A[j] == A[i]) {
					count++;
				}
			}
			if (count == 0) {
				temp[numberOfTemp++] = A[i];
			}
		}
		
		// good
		int newArray[] = Arrays.copyOf(temp, numberOfTemp);
		sort(newArray);
		return newArray;
	}

	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
