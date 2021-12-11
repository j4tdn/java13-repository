package sorting;

import java.util.Arrays;

import common.SortOrder;
import static utils.ArrayUtils.*;
/**
 * Quick Sort Algorithm
 * Dual Pivot Quick Sort available in JAVA
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] origin = {6, 5, 3, 1, 8, 7, 2, 4};
		sort(origin, SortOrder.DESC);
		print("Quick Sort", origin);
	}
}
