package sorting.primitive;

import common.SortOrder;
import static utils.Utils.*;

/**
 * Quick Sort Algorithm Dual-Pivot Quick Sort available in Java
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] origin = { 6, 5, 4, 1, 8, 7, 2, 4 };
		sort(origin, SortOrder.ASC);
		print("Quick sort ASC: ", origin);
		System.out.println("\n========\\\\=========\n");
		sort(origin, SortOrder.DESC);
		print("Quick Sort DESC: ", origin);

	}
}
