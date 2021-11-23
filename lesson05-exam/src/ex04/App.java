package ex04;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int A[] = { 3, 15, 21, 0, 15, 17, 21 };
		int uniqueArray[] = getUniqueNumbers(A);
		System.out.print("Arrays after getting unique number and sorted: ");
		printArray(uniqueArray);
		System.out.println("\n==========================================");
		int repeatArray[] = getRepeatNumbers(A);
		System.out.print("Arrays after getting repeat number and sorted: ");
		printArray(repeatArray);
	}

	public static void printArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
	private static boolean isDuplicated(int[] A, boolean[] flag, int i) {
		int count = 0;
		for (int j = i + 1; j < A.length; j++) {
			if (A[j] == A[i]) {
				count++;
				flag[j] = true;
			}
		}
		return count > 0;
	}
	
	public static int[] getUniqueNumbers(int[] A) {
		int temp[] = new int[A.length];
		boolean flag[] = new boolean[A.length];
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (!flag[i] && !isDuplicated(A, flag, i)) {
				temp[count++] = A[i];
			}
		}
		int newArray[] = Arrays.copyOf(temp, count);
		sortArray(newArray);
		return newArray;
	}

	private static int[] getRepeatNumbers(int[] A) {
		int temp[] = new int[A.length];
		boolean flag[] = new boolean[A.length];
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (!flag[i] && isDuplicated(A, flag, i)) {
				temp[count++] = A[i];
			}
		}
		int newArray[] = Arrays.copyOf(temp, count);
		sortArray(newArray);
		return newArray;
	}

	private static void sortArray(int arr[]) {
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