package Ex02;

/*
 * Bài 2: Cho một dãy số nguyên ngẫu nhiên gồm n chữ số, viết chương trình:
 * Gom tất cả các số chia hết cho 7 về đầu dãy và tất cả các số chia hết cho 5 về cuối dãy. Các số
 * vừa chia hết cho 5 vừa chia hết cho 7 và các số còn lại đưa ra giữa.
 * Input: 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18
 * Output: 21, 49, 14 , 12, 19, 32, 35, 33, 18, 25, 10
 */
import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int [] arr ;
		int n ;
		do {
			System.out.print("Nhap so phan tu cua mang: ");
			n = ip.nextInt();
		}while(n<=0);
//		tao mang
		arr = createArr(n);
//		in mang
		for(int i = 0; i < n; i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		sap xep
		int left = 0, right = arr.length-1;
		for(int i = arr.length - 1; i >= 0; i--) {
			if(divisibleBy5(arr[i]) && !divisibleBy7(arr[i])) {
				int temp = arr[right];
				arr[right] = arr[i];
				arr[i] = temp;
				right--;
			}
		}
		for(int i = 0; i < arr.length; i++ ) {
			if(divisibleBy7(arr[i]) && !divisibleBy5(arr[i])) {
				int temp = arr[left];
				arr[left] = arr[i];
				arr[i] = temp;
				left++;
			}
		}
//		in mang sau khi sap xep
		for(int i = 0; i < n; i++ ) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int [] createArr(int n) {
		Random rd = new Random();
		int [] a = new int [n];
		for(int i = 0; i < n; i++) {
			a[i] = rd.nextInt(100);
		}
		return a;
	}
	
	public static boolean divisibleBy7(int n) {
		return n % 7 == 0;
	}
	
	public static boolean divisibleBy5(int n) {
		return n % 5 == 0;
	}
}
