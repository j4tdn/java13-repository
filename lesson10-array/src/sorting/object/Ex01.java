package sorting.object;

import java.util.Arrays;

import utlis.ArrayUtils;

/*
 * Sorting with String[ Array
 */
public class Ex01 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susan Dann",
				"Rivalho",
				"Alexander Pato"
		};
		
		// Required : Ascending
		insertsort(students);
		ArrayUtils.print("sort",students);
	}
	private static void insertsort(String [] origin) {
		for(int i = 1; i<origin.length;i++) {
			for(int j = 0;i<j;j++){
				if(origin[i].compareTo(origin[j]) < 0) {
					ArrayUtils.swap(origin,i,j);
				}
			}
		}
	}

}
