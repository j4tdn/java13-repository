package lesson02;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			do {
				arr[i] = 20 + rd.nextInt(11);
			} while (isExist(i, arr));
		}
		for(int e: arr) {
			System.out.print(e + " ");
		}
	}

	private static boolean isExist(int n, int arr[]) {
		if (n == 0) {
			return false;
		} else {
			for (int i = n-1; i >= 0; i--) {
				if (arr[n] == arr[i]) {
					return true;
				}
			}
		}
		return false;
	}
}