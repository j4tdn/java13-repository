package sorting.primitive;

import java.util.Arrays;

import utlis.ArrayUtils;

public class Ex03 {
	public static void main(String[] args) {
		int[] origin = {1,5,11,9,4,6};
		sort(origin);
		System.out.println("Insertion sort: " + Arrays.toString(origin));
	}
	private static void sort(int [] origin) {
		for(int i = 1; i<origin.length;i++) {
			for(int j = 0;i<j;j++){
				if(origin[i]> origin[j]) {
					ArrayUtils.swap(origin,i,j);
				}
			}
		}
	}

}
