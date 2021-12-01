package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

/*
 * 1. Bubble sort with int primitive array
 * 
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] origins = {1, 5, 11, 9, 4, 6};
		
		sort(origins, (a, b) -> a > b);
		
		System.out.println("Bubble sort - ASC: " + Arrays.toString(origins));
	}
	
	private static void sort(int[] origins, Strategy strategy) {
		for(int round = 0; round < origins.length; round++) {
			for(int index = 0; index < origins.length - round - 1; index++) {
				if(strategy.check(origins[index], origins[index+1])) {
					ArrayUtils.swap(origins, index, index+1);
				}
			}
		}
	}
	
	
}
