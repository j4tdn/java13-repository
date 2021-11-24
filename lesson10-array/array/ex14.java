package array;

import java.util.Random;
import java.util.Scanner;

/**
 * Xuất giá trị các phần tử của mảng. Sắp xếp mảng tăng dần. Tìm phần tử có giá
 * trị lớn nhất, nhỏ nhất. Đếm số phần tử là số chẵn.
 */
public class ex14 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int []arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Random().nextInt(99) + 1;
			System.out.print(arr[i] + "\t");
		}
		softArr(arr);
		System.out.println("\nSố lớn nhất trong mảng: " + maxArr(arr));
		System.out.println("\nSố nhỏ nhất trong mảng: " + minArr(arr));
		chiaTow(arr);
		
	}
	private static void softArr(int [] arr) {
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = i +1;j <= arr.length - 1;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nMảng sắp xếp lại: ");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	private static int maxArr(int []arr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	private static int minArr(int []arr) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length;i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	
	}
	private static void chiaTow(int [] arr) {
		int count = 0;
		for (int i = 0; i < arr.length;i++) {
			if(arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("\n Số chia hết cho 2 trong mảng: ");
		System.out.print(count + "\t");
	}
}
