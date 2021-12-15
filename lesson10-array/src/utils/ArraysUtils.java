package utils;

import java.util.Arrays;

import bean.Item;
import common.SortOrder;

public class ArraysUtils {
	
	public static void sort(int[] origin, SortOrder order) {
		Arrays.sort(origin);
		if(order == SortOrder.DESC) {
			reverse(origin);
		}		
	}
	
	public static void reverse(int[] origin) {
		for(int i = 0; i <= origin.length/2; i++) {
			int temp = origin[i];
			origin[i]= origin[origin.length - i - 1];
			origin[origin.length - i - 1] = temp;
		}
	}
	
	 public static void swap(int [] arr , int before, int after) {
		int temp = arr[before];
		arr[before] = arr[after];
		arr[after] = temp;
	}
	 
	public static void print(String text, int[] origin) {
		System.out.println(text + ": " + Arrays.toString(origin));
	}
	
	public static void print(String text, Item[] origin) {
		System.out.println(text + ": " + Arrays.toString(origin));
	}
	
	public static void swap(String [] Sequences , int before, int after) {
		String temp = Sequences[before];
		Sequences[before] = Sequences[after];
		Sequences[after] = temp;
	}
	
	
}
