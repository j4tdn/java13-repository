package utils;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	public static void swap (int[] origin, int i, int j) {
		int temp = origin[i];
		origin[i] = origin[j];
		origin[j] = temp;
	}
}
