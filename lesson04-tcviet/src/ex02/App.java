/**
 * Bài 2: Gom tất cả các số chia hết cho 7 về đầu dãy và tất cả các số chia hết cho 5 về cuối dãy. 
 * Các số vừa chia hết cho 5 vừa chia hết cho 7 và các số còn lại đưa ra giữa.
 */
package ex02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.print("Input n: ");
//		int n = Integer.parseInt(sc.nextLine());
//		int arr[] = getRandomArray(n);
//		System.out.print("Random array created: ");
//		showArray(arr);

		int arr[] = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		int newArr[] = handleArray(arr);
		System.out.println("Array after handled: ");
		showArray(newArr);
		sc.close();

	}

	private static int[] handleArray(int[] arr) {
		moveToStart(arr);
		moveToEnd(arr);
		return arr;
	}

	public static void moveToStart(int arr[]) {
		int index = 0;
		boolean check = true;
		for (int i = 0; i < arr.length; i++) {
			check = arr[i] % 7 == 0 && arr[i] % 5 == 0 || arr[i] % 7 != 0 && arr[i] % 5 != 0;
			if (arr[i] % 7 == 0 && !check) {
				for (int j = i; j > index; j--) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
				index++;
			}
		}
	}

	public static void moveToEnd(int arr[]) {
		int index = arr.length - 1;
		boolean check = true;
		for (int i = arr.length - 1; i >= 0; i--) {
			check = arr[i] % 7 == 0 && arr[i] % 5 == 0 || arr[i] % 7 != 0 && arr[i] % 5 != 0;
			if (arr[i] % 5 == 0 && !check) {
				for (int j = i; j < index; j++) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				index--;
			}
		}
	}

	public static int[] addElement(int[] a, int e) {
		a = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}

	public static int[] getRandomArray(int n) {
		Random rd = new Random();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = 10 + rd.nextInt(90);
		}
		return arr;
	}

	public static void showArray(int[] array) {

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
