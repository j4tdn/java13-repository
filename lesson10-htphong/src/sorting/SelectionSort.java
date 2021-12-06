package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class SelectionSort {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 5, 1, 9, 67, 55, 89, 25, 99};
		System.out.println("Ascending: " + Arrays.toString(selectSortAscending(numbers)));
		System.out.println("Descending: " + Arrays.toString(selectSortDescending(numbers)));
	}
	private static int[] selectSortAscending(int[] numbers) {
		int[] a = numbers;
		for(int i = a.length-1; i>0; i--) {
			for(int j = 0; j<i; j++) {
				if(a[j] > a[i]) {
					ArrayUtils.swap(a, i, j);
				}
			}
		}
		return a;
	}
	private static int[] selectSortDescending(int[] numbers) {
		int[] a = numbers;
		for(int i = a.length-1; i>0; i--) {
			for(int j = 0; j<i; j++) {
				if(a[j] < a[i]) {
					ArrayUtils.swap(a, i, j);
				}
			}
		}
		return a;
	}
}
