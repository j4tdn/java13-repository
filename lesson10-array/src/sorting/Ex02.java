package sorting;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = {2, 5, 7, 3 , 11, 8, 34, 22};
		selectionSort(numbers);
		System.out.println("bubble sort ESC: " + Arrays.toString(numbers));
	}
	
	private static void selectionSort(int[] arr) {
		for(int i = arr.length - 1 ; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[i]) {
					ArraysUtils.swap(arr, i, j);
				}
			}
		}
	}
}
