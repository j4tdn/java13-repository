package sorting.primitive;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] origin = {1, 4, 2, 12, 5, 9};
		
		for (int round = 0; round < origin.length; round++) {
			for (int i = 0; i < origin.length - round - 1; i++) {
				if (origin[i] > origin[i+1]) {
					swap(origin, i, i+1);
				}
			}
		}
		
		System.out.println("Bubble Sort - ASC: " + Arrays.toString(origin));
	}
	
	private static void swap(int[] origin, int before, int after) {
		int tmp = origin[before];
		origin[before] = origin[after];
		origin[after] = tmp;
	}
}
