package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		// Create 2 ways array
		int[][] array = create2waysArray(4, 5);

		// Print the array created
		System.out.println("The random 2 ways array just created:");
		print2waysArray(array);

		// Write data from 2 ways array into file "readme.txt"
		File file = new File("readme.txt");
		writeDataFrom2waysArrayIntoFile(array, file);
		System.out.println("\nThe data from 2 ways array are written into file readme.txt\n");

		// Read data from file "readme.txt"
		System.out.println("Below are data read from file readme.txt:");
		readDataFromFile(file);
	}

	private static int[][] create2waysArray(int row, int column) {
		int[][] result = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				result[i][j] = new Random().nextInt(10);
			}
		}
		return result;
	}

	private static void print2waysArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void writeDataFrom2waysArrayIntoFile(int[][] array, File file) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			bw.write("rows:" + array.length + "||" + "cols:" + array[0].length + "\n");

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					bw.write(String.valueOf(array[i][j]) + "\t");
				}
				bw.write("\n");
			}

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readDataFromFile(File file) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String dataRow = "", result = "";
			while ((dataRow = br.readLine()) != null) {
				result = result + dataRow + "\n";
			}
			System.out.println(result);
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
