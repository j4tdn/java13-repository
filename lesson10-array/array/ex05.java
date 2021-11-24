package array;


import java.util.Random;
import java.util.Scanner;

/*Viết chương trình nhập mảng n số nguyên với các giá trị ngẫu nhiên. 
 * Xuất tổng, tìm giá trị nhỏ nhất và sắp xếp mảng.
 * 
 */
public class ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int [] arr = new int [n];
		for (int i = 0; i < n;i++) {
			arr[i] = new Random().nextInt(99) + 1;
			System.out.print(arr[i] + "\t");
		}
		int result = sumArr(arr);
		System.out.println("\nTổng của mảng: " + result);
		
		sortArr(arr);
		
		int minArr = minArr(arr);
		System.out.println("\nSố nhỏ nhất của mảng: " + minArr);
		
	}
		private static int sumArr(int [] arr) {
			int sum = 0;
			for(int i = 0;i < arr.length;i++) {
				sum += arr[i];
			}
			return sum;
		}
		private static int minArr(int [] arr) {
			int min = Integer.MAX_VALUE;
			for(int i = 0;i < arr.length;i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}return min;
		}
		private static void sortArr(int [] arr) {
			for(int i = 0; i < arr.length - 1;i++) {
				for (int j = i + 1;j <= arr.length -1;j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("\nMảng sắp xếp lại từ nhỏ đến lớn: ");
			for(int i = 0; i < arr.length;i++) {
				System.out.print(arr[i] + "\t");
			}
		
		}
	
}
