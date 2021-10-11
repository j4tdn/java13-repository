package ex04;

import java.util.Random;
import java.util.Arrays;

/**
 * Nghĩa code tốt. A đọc logic hiểu NHƯNG nhìn vào tổng quan code cứ thấy nhớp
 * nhớp sao á N
 * 
 * Cố gắng tập code clean. Khi báo biến phải rõ ràng
 * 15đ
 */
public class UniqueNumber {
	private static Random rd = new Random();

	public static void main(String[] args) {
		int n = rd.nextInt(5) + 2;
		int[] arr = new int[n];
		System.out.println("Original array:");
		
		// Em nên tạo 1 util class
		ex03.CommonMultiple.rndArray(arr);
		ex03.CommonMultiple.printArray(arr);
		
		// arr1, arr2 là cái gì =))
		// Hôm sau a còn thấy đặt tên biết như này a cho nộp phạt nghe
		int[] arr2 = getUniqueNumber(arr);
		Arrays.sort(arr2);
		System.out.println("Unique number:");
		System.out.print("[");
		for (int i = 0; i < arr2.length - 1; i++) {
			if (arr2[i] != 0)
				System.out.print(arr2[i] + ",");
		}
		System.out.println(arr2[arr2.length - 1] + "]");
	}

	public static boolean isUnique(int[] arr, int u) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == u)
				count++;
		}
		
		// short version
		return count == 1;
	}

	public static int[] getUniqueNumber(int[] arr) {
		int[] arr2 = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			// Cách này đúng chưa tốt lắm
			// VD mảng có n phần tử thì cứ 1 phần tử e lại compare với n ptu
			// Complexity sẽ là O(n2). Có thể tìm cách reduce complexity 1 xíu
			if (isUnique(arr, arr[i])) {
				arr2[j] = arr[i];
				j++;
			}
		}

		// Chưa hoàn thành
		// VD: arr[] = {1,2,2,3};
		// KQ: arr2[] = {1,3,0,0}
		// Cái a muốn phải là {1,3}. Cần xử lý thêm
		return arr2;
	}

}
