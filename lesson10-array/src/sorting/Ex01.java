package sorting;

import java.util.Arrays;

/**
 * 1. Bubble Sort with integer primitive array
 * >> ASC 	: ASCENDING
 * >> DESC 	: DESCENDING	
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] origin = {1, 5, 11, 9, 4, 6};
		
		Strategy strategy =  (a, b) -> a - b;
		
		sort(origin, strategy);
		
		System.out.println("Bubble Sort - DESC: " + Arrays.toString(origin));
	}
		
	
	private static void sort(int[] origin, Strategy strategy) {
		for (int round = 0; round < origin.length; round++) {
			for (int i = 0; i < origin.length - round - 1; i++) {
				// positive if a > b
				// negative if a < b
				// zero 	if a = b
				if (strategy.compare(origin[i], origin[i+1]) > 0) {
					swap(origin, i, i+1);
				}
			}
		}
	}

	private static void swap(int[] origin, int before, int after) {
		int tmp = origin[before];
		origin[before] = origin[after];
		origin[after] = tmp;
	}
}
