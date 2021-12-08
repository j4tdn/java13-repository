package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = {1,2,3,4,3,1};
		
		System.out.println( Arrays.toString(getNum(digits)) );
		
		
		
	}
	
	private static int[] getNum(int[] digits) {
		int[] r = new int[digits.length];
		
		int n =0;
		
		for (int i =0; i< digits.length; i++) {
			
			int k =0;
			
			for (int t =0; t< digits.length; t++) {
				if (digits[i] == digits[t]) {
					k++;
				}
				if (k==2) {
					break;
				}
			}

			if(k==1) {
				r[n] = digits[i];
				n++;
			}
		}
		
		int[] result = new int[n];
		for (int i=0; i<n; i++) {
			result[i] = r[i];
		}
		
		return result;
	}
}
