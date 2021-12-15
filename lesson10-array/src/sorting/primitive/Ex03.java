package sorting.primitive;

import java.util.Arrays;

import Utils.ArrayUtils;

/**
 * 
 * Insertion sort
 *
 */
public class Ex03 {
	public static void main(String[] args) {
		int[] origin = { 4, 3, 2, 10, 12, 1, 5, 6 };
		sort(origin);
		System.out.println("Insertion Sort: " + Arrays.toString(origin));
	}
	private static void sort(int [] origin) {
		for(int i = 1; i < origin.length;i++) {
			int key = origin[i];
			for(int j = 0; j < i;j++ ) {
				if(key > origin[j]) {
					ArrayUtils.swap(origin, i, j);
				}
			}
		}
	}
}
