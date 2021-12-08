package ex04;

import java.util.Arrays;

public class Sort {
	
	public static void swap(int[] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		for (int i = 0 ;i < n - 1; i++) 
		for (int j = 0 ;j < n - 1 - i;j++) 
			if (arr[j] > arr[j+1])
				swap(arr,j,j+1);
	}
	public static void selectionSort(int[] arr) {
		int n=arr.length;
		int min;
		for (int i = 0; i < n ; i++) {
			min=arr[i];
			for (int j = i; j < n ; j++) {
				if (arr[j] < min) min = arr[j];
			}
			for (int j = i; j < n ; j++) {
				if (arr[j] == min)
					swap(arr,i,j);
			}
		}	
	}
	public static void insertionSort(int[] arr) {
		int n=arr.length;
		for (int i =0 ; i< n-1;i++) {
			if (arr[i] > arr[i + 1])
				for (int j = i + 1; j > 0; j--) {
					if (arr[j] < arr[j - 1])
						swap(arr, j , j - 1);
				}
		}
	}
	public static int[] mergeSort(int[] arr,int start,int end) {
		int n=end-start+1;
		int middle=n/2;
		if (n == 1) 
			return Arrays.copyOfRange(arr, start, end+1);
		else if (n == 2) {
			if (arr[start] > arr[end])
				swap(arr,start,end);
			return Arrays.copyOfRange(arr, start, end+1);
		}
		else{
			int[] leftArr=mergeSort(arr,start,middle);
			int[] rightArr=mergeSort(arr,middle+1,end);
			int[] result = new int[n];
			System.arraycopy(leftArr, 0, result, 0,middle-start+1);  
			System.arraycopy(rightArr, 0, result, middle-start+1, end-middle);  
			return result;

		}
		
	}
}
