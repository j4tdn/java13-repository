package ex03;

import java.util.Scanner;

public class Pascaltriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter n element: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int[][] arr = new int[n][n];
		
		for(int row = 0; row < n; row++) {
			arr[row][0] = 1;
			for(int col = 1; col <= row; col++) {
				arr[row][col] = arr[row - 1][col - 1] + arr[row - 1][col];
			}
		}
		
		for(int row = 0; row < n; row++) {
			for(int col = 0; col <= row; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}
	}

}
