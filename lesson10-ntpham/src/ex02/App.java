package ex02;

import java.util.Arrays;

/* Bài 2: 
 * 	Thực hiện bài toán chuyển đổi ma trận sau đây : Ma trận có duy nhất một
 *	phần tử có giá trị bằng 0. Chuyển tất cả các hàng và cột của nó về giá trị bằng 0
 */
public class App {
	
	private static int[][] matrix1 = {
			{1, 2, 3, 4},
			{5, 6, 8, 7},
			{1, 9, 0, 9},
			{2, 9, 6, 5},
			{1, 2, 4, 5}
	};
	
	private static int[][] matrix2 = {
			{1, 2, 3, 4},
			{5, 0, 8, 7},
			{1, 9, 0, 9},
			{2, 0, 6, 5},
			{1, 2, 4, 5}
	};
	
	public static void main(String[] args) {
		transformMatrix(matrix1, 5, 4);
		transformMatrix(matrix2, 5, 4);
		
		System.out.println("Matrix 1: ");
		show2DMatrix(matrix1, 5);
		
		System.out.println("///////////////========///////////////");
		
		System.out.println("Matrix 2: ");
		show2DMatrix(matrix2, 5);
	}
	
	private static void transformMatrix(int[][] matrix, int n, int m) {
		Element[] zeroElements = getZeroElements(matrix, n, m);
		for (Element e : zeroElements) {
			handle(matrix, e.getRow(), e.getCol(), n, m);
		}
	}
	
	private static Element[] getZeroElements(int[][] matrix, int n, int m) {
		Element[] zeroElements = new Element[n*m];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 0) zeroElements[count++] = new Element(i, j);
			}
		}
		return Arrays.copyOfRange(zeroElements, 0, count);
	}
	
	private static void handle(int matrix[][], int row, int col, int n, int m) {
		for (int i = 0; i < n; i++) {
			matrix[i][col] = 0;
		}
		for (int j = 0; j < m; j++) {
			matrix[row][j] = 0;
		}
	}
	
	private static void show2DMatrix(int[][] matrix, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
