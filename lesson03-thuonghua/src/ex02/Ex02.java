package ex02;

import java.util.Random;
import java.util.Scanner;


/*Cho bảng A kích thước MxN. Các phần tử của mảng là các số ngẫu nhiên [1-99]. Phần tử Aij
được gọi là phần tử yên ngựa nếu nó là phần tử nhỏ nhất trong hàng của nó đồng thời là phần
tử lớn nhất trong cột của nó.
Bạn hãy lập chương trình nhập từ bàn phím một bảng số kích thước MxN và kiểm tra xem nó có
phần tử yên ngựa hay không?*/

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập hàng: ");
		int M = input.nextInt();
		System.out.println("Nhập cột: ");
		int N = input.nextInt();
		int[][] A = new int[M][N];
		Random rd = new Random();

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = rd.nextInt(99);
				System.out.printf("%-4d", A[i][j]);
			}
			System.out.printf("\n");
		}

		if (checkHorse(A, M, N))
			System.out.println("Mảng là phần tử yên ngựa");
		else
			System.out.println("Mảng không phải là phần tử yên ngựa");
	}

	public static int findMin(int A[][], int M, int N) {
		int indexMin = 0;
		for (int i = 1; i < N; i++) {
			if (A[M][i] < A[M][indexMin])
				indexMin = i;
		}
		return indexMin;
	}

	public static int findMax(int A[][], int M, int N) {
		int indexMax = 0;
		for (int i = 1; i < M; i++) {
			if (A[i][N] > A[indexMax][N])
				indexMax = i;
		}
		return indexMax;
	}

	public static boolean checkHorse(int A[][], int M, int N) {
		for (int i = 0; i < M; i++) {
			int column = findMin(A, i, N);
			if (i == findMax(A, M, column))
				return true;
		}
		return false;
	}
}
