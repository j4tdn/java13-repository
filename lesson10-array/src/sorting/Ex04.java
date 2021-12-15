package sorting;

import common.SortOrder;
import static utils.ArraysUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		int[] origin = {4, 3, 2, 10, 1, 5, 6};
		sort(origin, SortOrder.DESC);
		print("Dual - pivot quick sort:", origin);
	}
}
