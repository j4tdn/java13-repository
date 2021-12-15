package Utils;

import java.util.Arrays;

import bean.Item;
import common.SortOrder;



public class ArrayUtils {
	private ArrayUtils() {

	}
	public static void sort(int [] origin,SortOrder order) {
		//Dual-Pivot Quicksort with default is ASC
		Arrays.sort(origin);
		if(order == SortOrder.DESC) {
			reverse(origin);
		}
	}
	public static void reverse(int [] origin) {
		for(int i = 0;i < origin.length/2;i++) {
			int tmp = origin[i];
			origin[i] = origin[origin.length-i -1];
			origin[origin.length-1 -i] = tmp;
		}
	}
	
	public static void swap( int[]origin, int i, int j) {
		int tmp = origin[i];
		origin[i] = origin[j];
		 origin[j] = tmp;
	}
	public static void swap( String[]origin, int i, int j) {
		String tmp = origin[i];
		origin[i] = origin[j];
		 origin[j] = tmp;
	}
	public static void show(String text, int [] origin) {
		System.out.println(text + " : " + Arrays.toString(origin));
	}
	public static void show(String text, String [] origin) {
		System.out.println(text + " : " + Arrays.toString(origin));
	}
	public static void show(String text, Item [] origin) {
		System.out.println(text + " : " + Arrays.toString(origin));
	}
}
