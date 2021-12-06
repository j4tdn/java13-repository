package sorting;

import java.util.Arrays;
import java.util.Random;

public class App {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] origin = new int[10];
		for(int i = 0; i < origin.length; i++) {
			origin[i] = rd.nextInt(99);
		}
		System.out.println("origin array: " + Arrays.toString(origin));
		
		insertionSort(origin);
		System.out.println("insertion sort result: " + Arrays.toString(origin));
	}
	
	private static void insertionSort(int[] origin) {
		for(int i = 1; i < origin.length; i++) {
			int key = origin[i];
			int j = i - 1;
			
			while(j >= 0 && origin[j] > key) {
				origin[j + 1] = origin[j];
				j--;
			}
			origin[j + 1] = key;
		}
	}
	
	//private static 
	
}
