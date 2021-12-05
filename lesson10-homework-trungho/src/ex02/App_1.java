package ex02;

public class App_1 {
	public static void main(String[] args) {
		// Declare array and Initialize value
		int[][] twoDimensionArr = { { 1, 2, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };

		// Print the Input array
		System.out.println("Input array: ");
		for (int row = 0; row < twoDimensionArr.length; row++) {
			for (int column = 0; column < twoDimensionArr[0].length; column++) {
				System.out.printf("%3d", twoDimensionArr[row][column]);
			}
			System.out.println();
		}

		// Get index of zero value in the array
		int result[] = getindexOfZeroValue(twoDimensionArr);
		System.out.println();

		// Set value = 0
		for (int row = 0; row < twoDimensionArr.length; row++) {
			for (int column = 0; column < twoDimensionArr[0].length; column++) {
				if (column == result[1]) {
					twoDimensionArr[row][column] = 0;
				}

				if (row == result[0]) {
					twoDimensionArr[row][column] = 0;
				}
			}
		}

		// Print the Output array
		System.out.println("Output array: ");
		for (int row = 0; row < twoDimensionArr.length; row++) {
			for (int column = 0; column < twoDimensionArr[0].length; column++) {
				System.out.printf("%3d", twoDimensionArr[row][column]);
			}
			System.out.println();
		}
	}

	private static int[] getindexOfZeroValue(int[][] twoDimensionArr) {
		int[] result = new int[2];

		for (int row = 0; row < twoDimensionArr.length; row++) {
			for (int column = 0; column < twoDimensionArr[0].length; column++) {
				if (twoDimensionArr[row][column] == 0) {
					result[0] = row;
					result[1] = column;
				}
			}
		}
		return result;
	}
}
