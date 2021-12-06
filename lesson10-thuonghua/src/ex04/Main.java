package ex04;

import java.util.Arrays;
import java.util.Random;

import utils.Utils;

public class Main {
	public static void main(String[] args) {
		Random rd = new Random();
		int digit[] = new int[10];
		for (int i = 0; i < 10; i++) {
			int numbers = 1 + rd.nextInt(100);
			digit[i] = numbers;
		}
		
		System.out.println(Arrays.toString(bubleSort(digit)));
		System.out.println(Arrays.toString(selectionSort(digit)));
	}

	private static int[] bubleSort(int[] digit) {
		for (int i = 0; i < digit.length - 1; i++) {
			for (int j = 0; j < digit.length - 1; j++) {
				if (digit[j] > digit[j + 1]) {
					Utils.swap(digit, j, j + 1);
				}
			}
		}
		return digit;
	}

	private static int[] selectionSort(int[] digit) {
		for (int i = 0; i < digit.length - 1; i++) {
			int temp = i;
			for (int j = i + 1; j < digit.length; j++) {
				if (digit[j] < digit[temp])
					temp = j;
			}
			Utils.swap(digit, temp, i);
		}
		return digit;
	}
}
