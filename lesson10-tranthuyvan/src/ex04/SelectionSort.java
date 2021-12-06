package ex04;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] origin = { 1, 15, 11, 9, 24, 46 };
		sort(origin);
		System.out.println("Selection Sort: " + Arrays.toString(origin));
	}

	private static void sort(int[] origin) {
		for (int round = origin.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (origin[i] > origin[round]) {
					Utils.swap(origin, i, round);

				}
			}
		}
	}
}


