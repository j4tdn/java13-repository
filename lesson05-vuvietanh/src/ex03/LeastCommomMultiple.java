package ex03;

import java.util.Random;
import java.util.Scanner;

/**
 * 17đ
 */
public class LeastCommomMultiple {
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập n: ");
			n = Integer.parseInt(ip.nextLine());
		} while(n < 2 || n > 20);
		
		System.out.println("\nBội chung nhỏ nhất: " + getLeastCommonMultiple(n));;
	}
	
	public static int getLeastCommonMultiple(int n) {
		int[] arr = new int[n];
		
		// Đoạn này a nên đưa ra khỏi hàm
		// Nó giống như input, còn hàm này dùng để xử lý
		for(int i = 0; i < arr.length; i++) {
			// Mình new Random() nhiều lần tốn memory mà ko giúp mình thêm gì cả
			// Nên tạo 1 biến static đầu class
			arr[i] = rd.nextInt(10) + 1;
			System.out.print(arr[i] + ", ");
		}
		
		// Nên kiểm tra độ dài mảng arr >= 2 trước khi truy cập phần tử thứ 0, 1
		// Tránh ArrayIndexOutOfBoundException
		int temp = BCNN(arr[0], arr[1]);
		for(int i = 2; i < n; i++) {
			temp = BCNN(temp, arr[i]);
		}
		
		return temp;
		
	}
	
	// KHÔNG nên đặt tên hàm, biến bằng tiếng việt
	public static int BCNN(int a, int b) {
		return (a * b / UCLN(a, b));
	}
	
	// KHÔNG nên đặt tên hàm, biến bằng tiếng việt
	public static int UCLN(int a, int b) {
		if(a == b) return a;
		if(a > b) {
			return UCLN(a - b, b);
		} else {
			return UCLN(a, b - a);
		}
	}
}
