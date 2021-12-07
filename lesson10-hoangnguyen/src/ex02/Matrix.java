package ex02;

import java.util.Arrays;

public class Matrix {
	
	public static void main(String[] args) {
		int[][] arr = new int[][]{{1, 2, 3, 4},
								  {5, 6, 8, 7},
								  {1, 9, 0, 9},
								  {2, 9, 6, 5},
								  {1, 2, 4, 5}
		};
		
		convert(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	private static void convert(int[][] arr) {
		boolean[] row = new boolean[arr.length];
		boolean[] col = new boolean[arr[0].length];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(row[i] == true || col[j] == true) {
					arr[i][j] = 0;
				}
			}
		}
	}
}
