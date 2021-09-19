package view;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int[][] digits = new int[10][10];
		import2DArray(digits, 3, 3);
		System.out.println();
		print2DArray(digits, 3, 3);
		System.out.println("\nPhần tử yên ngựa: ");
		saddle(digits, 3, 3);
	}
	
	public static void import2DArray(int digits[][], int rows, int columns) {
		Scanner ip = new Scanner(System.in);
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				System.out.print("digits[" + i + "]" + "[" + j + "] = ");
				digits[i][j] = ip.nextInt();			
			}
		}
	}
	
	public static void random2DArray(int digits[][], int rows, int columns){
		Random rd = new Random();
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				digits[i][j] = rd.nextInt(100);			
			}
		}	
	}
	
	public static void print2DArray(int M[][], int rows, int columns){
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				System.out.print(M[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void saddle(int digits[][], int rows, int columns) {
		int row;
		int col;
	    int max;
	    int min;
	 
	    for (int i = 0; i < rows; i++) {
	        min = digits[i][0];
	        col = 0;
	        for (int j = 1; j < columns; j++) {
	            if (min > digits[i][j]) {
	                min = digits[i][j];
	                col = j;
	            }
	        }
	 
	        max = digits[0][col];
	        row = 0;
	        for (int k = 1; k < rows; k++) {
	            if (max < digits[k][col]) {
	                max = digits[k][col];
	                row = k;
	            }
	        }
	 
	        if (max == min){
	            System.out.println("digits[" + row + "]" + "[" + col + "] = " + digits[row][col]);
	        }
	    }
	}
}
