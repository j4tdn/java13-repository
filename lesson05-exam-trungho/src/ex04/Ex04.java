package ex04;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		int[] arrayA = {3, 15, 21, 0, 15, 17, 21};
		getUniqueNumbers(arrayA);
	}
	
	public static ArrayList<Integer> getUniqueNumbers(int[] arrayA) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		for(int i = 0; i < arrayA.length; i++) {
			int count = 0;
			for(int j = 0; j < arrayA.length; j++) {
				if (arrayA[i] == arrayA[j]) {
					count++;
				}
			}
			if (count == 1) {
				result.add(arrayA[i]);
			}
		}
		System.out.println(result);
		return result;
	}
}
