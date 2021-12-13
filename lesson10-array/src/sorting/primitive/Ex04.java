package sorting.primitive;

import common.SortOrder;
import utils.ArrayUtils;

/*
 * Quick Sort Algorithm, Dual-Pivot Quick Sort available in Java
 */
public class Ex04 {
	public static void main(String[] args) {
		// Sort Array with each element is primitive type
		// Only support for ASC by default
		
		int[] origin = {6, 5, 3, 1, 8, 7, 2, 4};
		ArrayUtils.sort(origin, SortOrder.DESC);
		ArrayUtils.print("Quick Sort: ", origin);
	}
}
