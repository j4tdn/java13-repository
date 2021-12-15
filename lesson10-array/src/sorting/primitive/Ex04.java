package sorting.primitive;

import Utils.ArrayUtils;
import common.SortOrder;
/**
 * Quick Sort Algorithm
 * Dual-Pivot Quick sort available in JAVA
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] origin = { 6, 5, 3, 1, 8, 7, 2, 4 };
		ArrayUtils.sort(origin, SortOrder.DESC);
		ArrayUtils.show("Quick Sort", origin);
		
		
	}
}
