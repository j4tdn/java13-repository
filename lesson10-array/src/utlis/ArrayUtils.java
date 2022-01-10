package utlis;

import java.util.Arrays;

import bean.Item;
import common.SortOrder;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	private static void sort(int[] origin, SortOrder order) {
		Arrays.sort(origin);
		//if(order==SortOrder.DESC) {
		//	reverse(origin);
	//	}
		
	}
	private static void reverse(int[] origin) {
		
	}
	
	public static void swap(int[] origin, int i,int j) {
		int tmp = origin[i];
		origin[i]= origin[j];
		origin[j] = tmp;
	}
	public static void swap(String[] origin, int i,int j) {
		String tmp = origin[i];
		origin[i]= origin[j];
		origin[j] = tmp;
	}
	public static void print(String text , String[] origin) {
		System.out.println(text + "," + Arrays.toString(origin));
	}
	public static void print(String text , Item[] origin) {
		System.out.println(text + "," + Arrays.toString(origin));
	}

}
