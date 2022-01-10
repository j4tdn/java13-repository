package sorting.primitive;

import java.util.Arrays;


/**
 * 1. Bubble Sort with integer primitive array
 * >> ASC : ascending
 * >> DESC: descending
 */

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1,5,11,9,4,6};
		
		sort(numbers, (int o1,int o2) -> {
			return o2 -o1;
		});
		System.out.println("Bubble sort: " +Arrays.toString(numbers));
	}	
	private static void sort(int[] numbers, Strategy strategy) {	
		for(int round = 0; round < numbers.length;round ++) {
			for(int i= 0; i < numbers.length - round -1 ; i++) {
				if(strategy.compare( numbers[i] , numbers[i+1]) > 0) {
					swap(numbers,i,i+1);
				}
			}
		}
		
	}
	private static void swap(int[] origin, int before,int after) {
		int tmp = origin[before];
		origin[before]= origin[after];
		origin[after] = tmp;
	}

}
