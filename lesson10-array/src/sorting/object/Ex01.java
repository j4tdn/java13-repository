package sorting.object;
/*
 * Sorting with String[] Array
 * DESC || ASC
 * >> using insertion sort
 */
import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susam Dan",
				"Lionel Messi",
				"Cristiano Ronaldo",
		};
		
		insertionSort(students);
		ArrayUtils.print("Student Sorting: ", students);
	}
	
	private static void insertionSort(String[] sequence) {
		for(int i = 1; i < sequence.length; i++) {
			String key = sequence[i];
			for(int j = 0; j < i; j++) {
				if(key.compareTo(sequence[j]) < 0) {
					ArrayUtils.swap(sequence, i, j);
				}
			}
		}
	}
}
