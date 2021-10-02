package ex04;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int A[] = { 3, 15, 21, 0, 15, 17, 21, 30, 18 };
		int uniqueArray[] = getUniqueNumbers(A);
		System.out.println("Arrays after getting unique number and sorted: ");
		for (int i = 0; i < uniqueArray.length; i++) {
			System.out.print(uniqueArray[i] + " ");
		}
	}

	public static int[] getUniqueNumbers(int A[]) {
		int temp[] = new int[A.length];
		int numberOfTemp = 0;
		for (int i = 0; i < A.length; i++) {
			int count = 0;
			for (int j = 0; j < A.length; j++) {
				if (i == j) {
					continue;
				}
				if (A[j] == A[i]) {
					count++;
				}
			}
			if (count == 0) {
				temp[numberOfTemp++] = A[i];
			}
		}
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
