package array;

import java.util.Scanner;

/*Viết chương trình thực hiện các công việc:

Nhập liệu cho mảng một chiều có n phần tử nguyên (n > 0) từ bàn phím.
Kiểm tra mảng một chiều vừa nhập có đối xứng hay không?
 * 
 */
public class ex07 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int [] arr = new int[n];
		for(int i = 0; i < n;i++) {
			System.out.print("Arr[" + i + "]: ");
			arr[i] = Integer.parseInt(ip.nextLine());
		}
		System.out.println("\nMảng nhập vào: ");
		for(int i =0;i < n;i++) {
			System.out.print(arr[i] + "\t");
		}
		boolean result = symmetryArr(arr);
		System.out.println("\nMảng nhập vào là mảng đối xứng : " + result);
		
	}
		private static boolean symmetryArr(int [] arr) {
			int [] result = {};
			for (int i = 0; i < arr.length/2;i++) {
				if (arr[i] == arr[arr.length - 1 - i]) {
					result = arr;
				}
			}return result == arr;
		}
	}

