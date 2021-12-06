package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		System.out.println("Original matrix: ");
		printMatrix(arr);
		transformationMatrix(arr);
		System.out.println("Transformation matrix:");
		printMatrix(arr);
	}

	private static void transformationMatrix(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == 0) {
					for (int rowi = 0; rowi < arr.length; rowi++) {
						arr[rowi][col] = 0;
					}
					for (int coli = 0; coli < arr[row].length; coli++) {
						arr[row][coli] = 0;
					}
					return;
				}
			}
		}
	}

	private static void printMatrix(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}


}
