package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		int[] origin = {1, 5, 11, 9, 4, 6};
		sort(origin);
		System.out.println("Selection Sort: " + Arrays.toString(origin));
		
	}
	private static void sort (int[] origin) {
		for(int i = origin.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(origin[j] > origin[i]) {
					ArrayUtils.swap(origin, j, i);
				}
			}
		}
	}
}
