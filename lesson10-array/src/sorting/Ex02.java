package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * 
 * Section sort
 *
 */
public class Ex02 {
	
	public static void main(String[] args) {
		int[] origin = { 1, 5, 11, 11, 9, 4, 6 };
		sort(origin);
		
		System.out.println("Selection sort: " + Arrays.toString(origin));
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
