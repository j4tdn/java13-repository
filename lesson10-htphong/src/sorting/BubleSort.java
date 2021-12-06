package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class BubleSort {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 5, 1, 9, 67, 55, 89, 25, 99};
		System.out.println("Ascending: " + Arrays.toString(bubleSortAscending(numbers)));
		System.out.println("Descending: " + Arrays.toString(bubleSortDescending(numbers)));
	}
	private static int[] bubleSortAscending (int[] numbers) {
		int[] a = numbers;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					ArrayUtils.swap(a, j+1, j);
				}
			}
		}
		return a;
	}
	private static int[] bubleSortDescending (int[] numbers) {
		int[] a = numbers;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length-i-1; j++) {
				if(a[j]<a[j+1]) {
					ArrayUtils.swap(a, j+1, j);
				}
			}
		}
		return a;
	}
}
