package lesson02_hnhvy;

import java.util.Scanner;
import java.lang.Math;
/*
 * Viết chương trình kiểm tra 1 số có phải lũy thừa của 2 hay không
 * Người tạo : hnhvy
 * Ngày tạo : 07/09/21
 * **/
//Input nhập vào 1 số 
/*
 * B1 tạo biến n,log -> in thông báo nhập n
 * B2 : công thức lũy thừa 2^a = n => a = log(n)/log(2)
 * dùng công thức để so sánh và đưa ra vòng lặp để in ra kq 
 * **/
//	Output In ra có hay không là lũy thừa của 2
	public class Ex01 {
		public static void main(String[] args) {
			int n;
			 Scanner input = new Scanner(System.in);
			 System.out.println("Please enter the number of n :");
			 n = input.nextInt();
			 exponential(n);
		}
		private static void exponential(int n) {
			double a = Math.log(n)/Math.log(2);
			if((n != 0) && (n == Math.pow(2,a))) {
				System.out.println( n + " is a power of 2");
			}else
			System.out.println(n + " isn't a power of 2");
		}

	}