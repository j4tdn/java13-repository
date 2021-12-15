package sorting.primitive;

import java.util.Arrays;

/**
 * 1. Bubble Sort with integer primitive array
 * >> ASC  : ASCENDING
 * >> DESC : DESCENDING
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] origin = { 1, 5, 9, 11, 9, 4, 6 };
		
		sort(origin, (int o1, int o2) -> {
			// if (o1 < o2) return 1;
			// if (o1 == o2) return 0;
			// return -1;
			return o2 - o1;
		});
		
		System.out.println("Bubble Sort: " + Arrays.toString(origin));
	}
	
	// Interface
	// boolean execute(int a, int b)
	
	private static void sort(int[] origin, Strategy strategy) {
		for (int round = 0; round < origin.length; round++) {
			for (int i = 0; i < origin.length - round - 1; i++) {
				// positive if a > b 
				// negative if a < b 
				// zero     if a = b
				if (strategy.compare(origin[i], origin[i+1]) > 0) {
					swap(origin, i, i+1);
				}
			}
		}
	}
	
	@SuppressWarnings("unused")
	private static void sortAsc(int[] origin) {
		for (int round = 0; round < origin.length; round++) {
			for (int i = 0; i < origin.length - round - 1; i++) {
				if (origin[i] > origin[i+1]) {
					swap(origin, i, i+1);
				}
			}
		}
	}
	
	@SuppressWarnings("unused")
	private static void sortDesc(int[] origin) {
		for (int round = 0; round < origin.length; round++) {
			for (int i = 0; i < origin.length - round - 1; i++) {
				if (origin[i] < origin[i+1]) {
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
