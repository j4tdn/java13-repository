package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows: ");
		int rows = Integer.parseInt(sc.nextLine());
		System.out.print("Number of columns: ");
		int cols = Integer.parseInt(sc.nextLine());

		int[][] array = inputArray(rows, cols);
		System.out.println("Inputted Array: ");
		log(array, rows, cols);

		int[][] newArray = convertedArray(array, rows, cols);
		System.out.println("Converted Array: ");
		log(newArray, rows, cols);
		
		sc.close();
	}

	private static int[][] convertedArray(int[][] array, int rows, int cols) {
		List<Element> elements = new ArrayList<Element>();
		int[][] copiedArray = array;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (array[i][j] == 0) {
					elements.add(new Element(i, j));
				}
			}
		}
		for (Element e : elements) {
			for (int i = 0; i < rows; i++) {
				copiedArray[i][e.getCol()] = 0;
			}
			for (int i = 0; i < cols; i++) {
				copiedArray[e.getRow()][i] = 0;
			}
		}
		return copiedArray;
	}

	private static int[][] inputArray(int rows, int cols) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("arr[" + i + "][" + j + "] = ");
				array[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		sc.close();
		return array;
	}

	private static void log(int[][] array, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
