package sorting.primitive;

import java.util.Arrays;

import common.SortOrder;
import utils.ArrayUtils;

public class Ex04 {
	public static void main(String[] args) {
		int[] origin = { 6, 5, 3, 1, 8, 7, 2, 4 };
		ArrayUtils.sort(origin,SortOrder.DESC);
		ArrayUtils.print("sort", origin);
	}
}
