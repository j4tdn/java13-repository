package sorting;

import java.util.Arrays;

/**
 * 1. Bubble Sort with integer primitive array
 * >> ASC: Ascending
 * >> DESC: Descending
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] origin = { 1, 5, 11, 9, 4, 6 };
		sort(origin, (int o1, int o2) -> {
			if(o1 > o2) return 1;
			if(o1 == o2) return 0;
			return -1;
		});
		System.out.println("Bubble Sort: " + Arrays.toString(origin));
	}

	private static void Swap(int[] origin, int before, int after) {
		int tmp = origin[before];
		origin[before] = origin[after];
		origin[after] = tmp;
	}
	
	private static void sort(int[] origin, Strategy strategy) {
		for(int round = 0; round < origin.length; round++) {
			for(int i = 0; i < origin.length - round - 1; i++) {
				if(strategy.compare(origin[i], origin[i+1]) > 0) {
					Swap(origin, i, i+1);
				}
			}
		}
	}
}
