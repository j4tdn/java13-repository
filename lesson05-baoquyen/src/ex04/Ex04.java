package ex04;

import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		int [] a = {3, 15, 21, 0, 15, 17, 21};
		int [] result;
		
		result = getUniqueNumbers(a);
		show(result);
	}
	
	
	private static int[] getUniqueNumbers(int [] a) {
		int t = 0, k = 0;
		int [] result = new int [a.length];
		for(int i =0; i< a.length; i++) {
			t = 0;
			for(int j = 0; j < a.length ; j++ ) {
				if(a[i] == a[j]) {
					t++;
				}
			}
			if (t == 1) {
				result[k] = a[i];
				k++;
			}
		}
	int [] finalResult = new int [k];
	for(int i = 0; i< finalResult.length; i++) {
		finalResult[i] = result[i];
	}
	return finalResult;
	}
	private static void show(int [] a) {
		for(int i = 0; i< a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
	}
}
