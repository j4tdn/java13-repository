package sorting.object;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susan Dann",
				"Rivalho",
				"Alexander Pato"
		};
		insertionSort(students);
		ArrayUtils.print("Array Sorting", students);
	}
	private static void insertionSort(String[] sequences) {
		for(int i = 1; i<sequences.length;i++) {
			for(int j = 0; j<i;j++) {
				if(sequences[i].compareTo(sequences[j]) < 0) {
					ArrayUtils.swap(sequences, i, j);
				}
			}
		}
	}
}
