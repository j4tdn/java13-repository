package ex02;

import java.util.Random;
import java.util.ArrayList;

/**
 * Code ko format chi hết
 * Đặt tên biến dễ hiểu nữa là ok
 * 13đ
 */
public class MissingNumber {
	private static Random rd = new Random();

	public static void main(String[] args) {

		int n = rd.nextInt(20) + 1;

		// step này tốt nhưng không cần thiết
		// e có thể cho sẵn 1 mảng n - 1 phần tử và missing 1 phần tử
		// Nhưng cũng ok - accepted
		ArrayList<Integer> arr = new ArrayList<>();
		rndArray(arr, n);

		int x = getMissingNumber(arr, n);
		printArray(arr);
		System.out.println("Missing number:" + x);
	}

	public static void rndArray(ArrayList<Integer> arr, int n) {
		int x;
		for (int i = 0; i < n - 1; i++) {
			do {
				x = rd.nextInt(n) + 1;
			} while (arr.contains(x));
			arr.add(x);
		}
	}

	public static void printArray(ArrayList<Integer> arr) {
		System.out.print("[");
		for (int i = 0; i < arr.size() - 1; i++) {
			System.out.print(arr.get(i) + ",");
		}
		System.out.println(arr.get(arr.size() - 1) + "]");
	}

	// accepted. Nhưng e có thể thinking cách này nhanh hơn. Với n = 6
	// Em có thể lấy n*(n+1)/2 - sum(a[...])
	// result = 6*7/2 - (1+5+6+2+4) = 3
	public static int getMissingNumber(ArrayList<Integer> arr, int n) {
		for (int i = 1; i <= n; i++) {
			if (!arr.contains(i))
				return i;
		}
		
		return -1;
	}
}
