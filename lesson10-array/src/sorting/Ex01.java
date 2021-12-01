package sorting;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {2, 5, 7, 3 , 11, 8, 34, 22};
		bubbleSort(numbers,(int a, int b) -> a - b );
		System.out.println("bubble sortESC: " + Arrays.toString(numbers));
		bubbleSort(numbers,(int a, int b) -> b - a );
		System.out.println("bubble sort DESC: " + Arrays.toString(numbers));
	}
	
	// 1. Bubble sort with integer primitive array
	private static void bubbleSort(int[] arr, Strategy strategy) {
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j < arr.length - i -1; j++) {
				if(strategy.Execute(arr[j], arr[j+1]) > 0) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	private static void swap(int [] arr , int before, int after) {
		int temp = arr[before];
		arr[before] = arr[after];
		arr[after] = temp;
	}
	
}
