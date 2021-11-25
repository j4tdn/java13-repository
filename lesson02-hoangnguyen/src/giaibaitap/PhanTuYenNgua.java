package giaibaitap;

import java.util.Random;
import java.util.Scanner;

public class PhanTuYenNgua {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 5, 6, 0, 6 ,7 ,8};
		check(arr);
	}
	
	public static void check(int[] a) {
		int n = a.length;
		
		for(int i = 0; i < n; i++) {
			if(a[i] == 0) {
				for(int j = n - 2; j >= i + 1; j--) {
					a[j + 1] = a[j];
				}
				
				if(i + 1 < n) {
					a[i + 1] = 0;
					i++;
				}
			}
			
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + ", ");
		}
	}
}
