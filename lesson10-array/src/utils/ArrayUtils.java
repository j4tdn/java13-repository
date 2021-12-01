package utils;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	public static void swap(int[] origins, int before, int after) {
		int tmp = origins[before];
		origins[before] = origins[after];
		origins[after] = tmp;
	}
}
