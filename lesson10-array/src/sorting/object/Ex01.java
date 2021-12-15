package sorting.object;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex01 {
	public static void main(String[] args) {
		String[] student = {
				"Jonh Smith",
				"Susan Dann",
				"Annchile, Scoth",
				"Alexander Pavot"
		};
		
//	sort(student);
	Arrays.sort(student);	
	System.out.println("Arrays sorting: " + Arrays.toString(student));
		
	}
	public static void sort(String[] sequences) {
		for(int i = 1; i < sequences.length; i++) {
			String key = sequences[i];
			for(int j = 0; j < i; j++) {
				if(key.compareTo(sequences[j]) < 0) {
					ArraysUtils.swap(sequences, i, j);
				}
			}
		}
	}
}
