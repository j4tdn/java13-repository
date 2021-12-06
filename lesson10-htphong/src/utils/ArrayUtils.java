package utils;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	public static void swap (int[] origin, int i, int j) {
		int temp = origin[i];
		origin[i] = origin[j];
		origin[j] = temp;
	}
	public static void swap (Object[] origin, int i, int j) {
		Object temp = origin[i];
		origin[i] = origin[j];
		origin[j] = temp;
	}
}
