package ex02;
import java.util.Random;
public class Main {
	private static Random rd=new Random();
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		rndMatrix(matrix);
		int i=rd.nextInt(4);
		int j=rd.nextInt(4);
		matrix[i][j]=0;
		System.out.println("Original matrix");
		printMatrix(matrix);
		System.out.println("Matrix after converting");
		convertMatrix(matrix);
		
		printMatrix(matrix);
	}
	private static void rndMatrix(int[][] matrix) {
		
		int height = matrix.length;
		int width = matrix[0].length;
		for (int i = 0; i < height; i++)
			for (int j =0 ;j < width; j++)
				matrix[i][j] = 1+ rd.nextInt(20);
	}
	private static void printMatrix(int[][] matrix) {
		int height = matrix.length;
		int width = matrix[0].length;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(String.format("%-5d", matrix[i][j]));
			}
			System.out.println();
		}
	}
	private static boolean convertMatrix(int[][] matrix) {
		int height = matrix.length;
		int width = matrix[0].length;
		for (int i = 0; i < height; i++)
			for (int j =0 ;j < width;j++) {
				if (matrix[i][j] == 0) {
					for (int m = 0 ; m < height ; m++)
						matrix[m][j] = 0;
					for (int n = 0 ; n < width ; n++)
						matrix[i][n] = 0;
					return true;
				}
			}
		return false;
	}
}
