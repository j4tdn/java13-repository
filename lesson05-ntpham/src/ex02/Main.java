package ex02;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		int n = 6;
		int[] arr = {3, 2, 1 ,6 , 5};
		System.out.println("Missing number is: " + getMissingNumber(arr, n));
	}
	
	private static int getMissingNumber(int[] arr, int n) {

	    int acctualnumber =0;
	    int expectednumber = (n*(n+1)/2);

	    for (int j : arr) {
	        acctualnumber = acctualnumber+j;

	    }
	    return expectednumber-acctualnumber;

	}
}
