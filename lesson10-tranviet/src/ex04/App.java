package ex04;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.Random;

public class App {
	public static void main(String[] args) {
		int[] primitiveData = getPrimitiveData();
		printData("ARR", primitiveData);

		bubbleSort(primitiveData, (a, b) -> a > b);
		printData("Bubble Sort", primitiveData);

		selectionSort(primitiveData, (a, b) -> a < b);
		printData("Selection Sort", primitiveData);

		insertionSort(primitiveData, (a, b) -> a > b);
		printData("Insertion Sort", primitiveData);

		shellSort(primitiveData, (a, b) -> a < b);
		printData("Shell Sort", primitiveData);
		
		quickSort(primitiveData, Sort.ASC);
		printData("Quick Sort", primitiveData);

		System.out.println("\n\n==================\\\\\\=======================\n\n");

		Student[] objectData = getObjectData();
		printData("Students", objectData);

		quickSort(objectData);
		printData("Quick sort", objectData);
	}

	private static void quickSort(Student[] objectData) {
		Arrays.sort(objectData, comparing(Student::getName).thenComparing(Student::getAge, reverseOrder()));
	}

	private static void printData(String name, Student[] objectData) {
		System.out.println(name + ":  " + Arrays.toString(objectData));
	}

	private static Student[] getObjectData() {
		return new Student[] { new Student(2, "Pham Thanh Nguyen", 21), new Student(3, "Ho Hoang Thien", 20),
				new Student(1, "Dinh Gia Bao", 22), new Student(4, "Tran Cong Viet", 21), };
	}

	public static void reversed(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}
	}

	private static void quickSort(int[] primitiveData, Sort type) {
		Arrays.sort(primitiveData);
		if (type == Sort.DESC) {
			reversed(primitiveData);
		}
	}

	private static void shellSort(int[] data, Strategy strategy) {
		int n = data.length;
		int interval, i, j, temp;
		for (interval = n / 2; interval > 0; interval /= 2) {
			for (i = interval; i < n; i++) {
				temp = data[i];
				for (j = i; j >= interval && strategy.check(data[j - interval], temp); j -= interval) {
					data[j] = data[j - interval];
				}
				data[j] = temp;
			}
		}
	}

	private static void insertionSort(int[] data, Strategy strategy) {
		for (int i = 1; i < data.length; i++) {
			for (int j = 0; j < i; j++) {
				if (strategy.check(data[j], data[i])) {
					swap(data, j, i);
				}
			}
		}
	}

	private static void selectionSort(int[] data, Strategy strategy) {
		for (int i = data.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (strategy.check(data[j], data[i])) {
					swap(data, j, i);
				}
			}
		}
	}

	private static void bubbleSort(int[] data, Strategy strategy) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (strategy.check(data[j], data[j + 1])) {
					swap(data, j, j + 1);
				}
			}
		}
	}

	private static void printData(String name, int[] arr) {
		System.out.println(name + ": " + Arrays.toString(arr));
	}

	private static int[] getPrimitiveData() {
		Random rd = new Random();
		int[] rs = new int[10];
		for (int i = 0; i < rs.length; i++) {
			rs[i] = 1 + rd.nextInt(100);
		}
		return rs;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
