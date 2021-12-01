package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

/*
 * selection sort
 */
public class Ex02 {
	public static void main(String[] args) {
		int[] origins = {1, 5, 11, 9, 4, 6};
		sort(origins);
		System.out.println("Selection sort: " + Arrays.toString(origins));
	}
	
	private static void sort(int[] origin) {
		for(int round = origin.length - 1; round > 0; round--) {
			for(int i = 0; i < round; i++) {
				if(origin[i] > origin[round]) {
					ArrayUtils.swap(origin, i, round);
				}
			}
		}
	}
	
}
