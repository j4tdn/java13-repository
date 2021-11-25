package giaibaitap;

import java.util.Scanner;

public class Pascal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = Integer.parseInt(sc.nextLine());
		int[][] arr = new int[n][n];
		printPascal(arr);
	}
	
	public static void printPascal(int[][] a) {
		
		for(int i = 0; i < a.length; i++) {
			a[i][0] = 1;
			for(int j = 1; j <= i; j++) {
				a[i][j] = a[i - 1][j - 1] + a[i -1][j];
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
