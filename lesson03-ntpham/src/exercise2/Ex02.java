package exercise2;

import java.util.Random;
import java.util.Scanner;

/*
  	Cho bảng A kích thước MxN. Các phần tử của mảng là các số ngẫu nhiên [1-99]. 
  	Phần tử Aij được gọi là phần tử yên ngựa nếu nó là phần tử nhỏ nhất trong 
  	hàng của nó đồng thời là phần  tử lớn nhất trong cột của nó.  
		47 47 36 
		23 43 31 
		46 7 29 
	Theo ví dụ trong bảng số sau đây thì phần tử A02 chính là phần tử yên ngựa. 
	Bạn hãy lập chương trình nhập từ bàn phím một bảng số kích thước MxN và kiểm 
	tra xem nó có  phần tử yên ngựa hay không?

 */
public class Ex02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter row : ");
		int M = input.nextInt();
		System.out.println("Enter column : ");
		int N = input.nextInt();
		
		int[][] A = new int[M][N];
		init2DArray(A, M, N);
		print2DArray(A, M, N);
		if(checkHorseSaddleElement(A, M, N)) System.out.println("2D Array have horse saddle element");
		else System.out.println("2D Array have no horse saddle element");
	}
	
	public static void init2DArray(int[][] A, int M, int N) {
		Random rd = new Random();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = rd.nextInt(99);
			}
		}
	}
	
	public static void print2DArray(int[][] A, int M, int N) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%-4d",A[i][j]);
			}
			System.out.printf("\n");
		}
	}
	
	public static int indexMinElementInRow(int A[][], int M, int N) {
		int indexMin = 0;
		for (int i = 1; i < N; i++) {
			if(A[M][i] < A[M][indexMin]) indexMin = i;
		}
		return indexMin;
	}
	
	public static int indexMaxElementInColumn(int A[][], int M, int N) {
		int indexMax = 0;
		for (int i = 1; i < M; i++) {
			if(A[i][N] > A[indexMax][N]) indexMax = i;
		}
		return indexMax;
	}
	
	public static boolean checkHorseSaddleElement(int A[][], int M, int N) {
		for (int i = 0; i < M; i++) {
			int column = indexMinElementInRow(A,i,N);
			if (i == indexMaxElementInColumn(A, M, column))
				return true;
		}
		return false;
	}
}
