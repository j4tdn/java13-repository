package ex02;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4},
				{5, 6, 8, 7},
				{1, 9, 0, 9},
				{2, 9, 6, 5},
				{1, 2, 4, 5}
		};
		changMatrix(matrix, 5, 4);
		show(matrix, 5);
		
	}
	
	private static int[][] changMatrix(int[][] matrix, int m, int n) {
		int a = 0, b = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(matrix[i][j] == 0) {
					a = i;
					b = j;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			matrix[a][i] = 0;
		}
		for(int i = 0; i < m; i++) {
			matrix[i][b] = 0;
		}
		return matrix;
	}
	private static void show(int[][]matrix, int m) {
		for(int i = 0; i < m; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
