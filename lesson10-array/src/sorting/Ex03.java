package sorting;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex03 {
	public static void main(String[] args) {
		int[] origin = {4, 3, 2, 10, 1, 5, 6};
		sort(origin);
		System.out.println("Insert sort: " + Arrays.toString(origin));
	}
	public static void sort(int[] origin) {
		for(int i = 1; i < origin.length; i++) {
			int key = origin[i];
			for(int j = 0; j < i; j++) {
				if(key < origin[j]) {
					ArraysUtils.swap(origin, i, j);
				}
			}
		}
	}
}
 

