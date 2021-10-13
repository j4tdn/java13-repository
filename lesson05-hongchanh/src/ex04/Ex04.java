package ex04;

/**
 * Có idea 7đ
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 5, 4, 6, 6, 7 };
		sortASC(a);
		
		// Có lẽ em hiểu sai đề
		// Tìm phần tử xuất hiện 1 lần duy nhất trong mảng
		// KQ nên là 1 3 4 5 7
		check(a);
	}

	private static void check(int[] a) {
		for (int i = 0; i < a.length; i++) {
			boolean k = false;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					k = true;
				}
			}
			if (k == false) {
				System.out.print(a[i] + " ");
				if (i == a.length - 1) {
					System.out.println();
				}
			}
		}
	}

	public static void sortASC(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

}
