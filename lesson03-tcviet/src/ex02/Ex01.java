package ex02;
/**
 * 	Cho bảng A kích thước MxN. Các phần tử của mảng là các số ngẫu nhiên [1-99]. Phần tử Aij
	được gọi là phần tử yên ngựa nếu nó là phần tử nhỏ nhất trong hàng của nó đồng thời là phần
	tử lớn nhất trong cột của nó.
	Bạn hãy lập chương trình nhập từ bàn phím một bảng số kích thước MxN và kiểm tra xem nó có
	phần tử yên ngựa hay không?
 */
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("Input M: ");
		int M = sc.nextInt(); // ROW
		System.out.print("Input N: ");
		int N = sc.nextInt(); // COL
		int[][] A = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = 1 + rd.nextInt(99);
			}
		}
		
//		TEST 
//		for (int i = 0; i < M; i++) {
//			for (int j = 0; j < N; j++) {
//				A[i][j] = sc.nextInt();
//			}
//		}
		
		System.out.println("Two Dimensions Array Created: ");
		print2DArray(A, M, N);
		int count = 0;
		System.out.println("Saddle Elements: ");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (checkIfSaddleElement(i, j, A, M, N)) {
					System.out.println("A[" + (i+1) + "][" + (j+1) + "]" + " ");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("There is no saddle element in array!");
		} 
		
		sc.close();
	}

	public static boolean checkIfSaddleElement(int i, int j, int[][] A, int M, int N) {
		return checkIfMaxInCol(i, j, A, M) && checkIfMinInRow(i, j, A, N);
	}

	public static boolean checkIfMaxInCol(int i, int j, int[][] A, int M) {
		int max = Integer.MIN_VALUE;
		for (int k = 0; k < M; k++) {
			if (max < A[k][j])
				max = A[k][j];
		}

		return max == A[i][j];
	}

	public static boolean checkIfMinInRow(int i, int j, int[][] A, int N) {
		int min = Integer.MAX_VALUE;
		for (int k = 0; k < N; k++) {
			if (min > A[i][k])
				min = A[i][k];
		}

		return min == A[i][j];
	}

	public static void print2DArray(int[][] A, int M, int N) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%-4d", A[i][j]);
			}
			System.out.println();
		}
	}

	public static void print1DArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf(A[i] + " ");
		}
		System.out.println();
	}
}
