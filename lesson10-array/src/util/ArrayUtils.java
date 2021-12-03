package util;

public class ArrayUtils {
private ArrayUtils() {}
public static void swap(int[] origin,int before,int after) {
	int tmp = origin[before];
	origin[before]=origin[after];
	origin[after]=tmp;
}
}
