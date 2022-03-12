package ex04;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import utils.FileUtils;

public class App {
	private static final String path = "readme.txt";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input rows: ");
		int rows = sc.nextInt();
		System.out.print("Input cols: ");
		int cols = sc.nextInt();

		int[][] arr = createTwoDimensionsArray(rows, cols);
//		log(arr, rows, cols);

		System.out.println("===================================");
		List<String> strings = convertToListString(arr, rows, cols);
		strings.add(0, "rows:" + rows + " || cols:" + cols);
		
		File readme = FileUtils.createFile(path);
		FileUtils.writeToFile(readme, strings);
		
		FileUtils.outputData(readme);
		sc.close();

	}

	private static int[][] createTwoDimensionsArray(int rows, int cols) {
		int[][] arr = new int[rows][cols];
		Random rd = new Random();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = rd.nextInt(10);
			}
		}
		return arr;
	}

	private static List<String> convertToListString(int [][] arr, int rows, int cols){
		List<String> strings = new ArrayList<>();
		for (int i = 0; i < rows; i++) {
			String str = "";
			for (int j = 0; j < cols; j++) {
				str += arr[i][j] + " ";
			}
			strings.add(str);
		}
		return strings;
	}

//	private static void log(int[][] arr, int rows, int cols) {
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
}
