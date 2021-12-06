package ex04;

import java.util.Arrays;

/**
 *Cho mảng số nguyên integer gồm 10 phần tử ngẫu nhiều từ 1-100
 *Đối với Object Sort tạo mảng các Student: {id, name, age}. Sắp xếp tăng dần, giảm dần theo name, age
 *Tạo package sorting => code các thuật toán sau, mỗi thuật toán một hàm. 
 */

public class BubleSort {
	public static void main(String[] args) {

		// 1. Sắp xếp Nổi bọt – Buble Sort
		int[] origin = { 1, 15, 11, 9, 24, 46 };

		bubleSort(origin, (int o1, int o2) -> {
			return o1 - o2;
		});

		System.out.println("Bubble Sort: " + Arrays.toString(origin));

	}

	private static void bubleSort(int[] origin, Strategy strategy) {
		for (int round = 0; round < origin.length; round++) {
			for (int i = 0; i < origin.length - round - 1; i++) {
				if (strategy.compare(origin[i], origin[i + 1]) > 0) {
					swap(origin, i, i + 1);
				}
			}
		}
	}

	private static void swap(int[] origin, int before, int after) {
		int tmp = origin[before];
		origin[before] = origin[after];
		origin[after] = tmp;
	}

}