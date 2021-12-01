package sorting;



import java.util.Arrays;

import utils.ArrayUtils;



/**
 * 1. Bubble Sort with integer primitive array
 * >> ASC  : ASCENDING
 * >> DESC : DESCENDING
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] origin = {1, 5, 11, 9, 4, 6};
		sort(origin, (int a, int b) -> a - b); // giảm dần b - a 
		System.out.println("Bubble Sort - Desc:" + Arrays.toString(origin));
	}
	private static void sort(int[] origin, Strategy strategy) {
		for(int i = 0; i < origin.length; i++) {
			for(int j = 0; j < origin.length - 1 - i; j++) {
				if(strategy.compare(origin[j], origin[j+1]) > 0) {
					ArrayUtils.swap(origin, j, j+1);
				}
			}
		}
	}
	
}
