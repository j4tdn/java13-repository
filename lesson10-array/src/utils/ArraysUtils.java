package utils;

public class ArraysUtils {
	 public static void swap(int [] arr , int before, int after) {
		int temp = arr[before];
		arr[before] = arr[after];
		arr[after] = temp;
	}
}
