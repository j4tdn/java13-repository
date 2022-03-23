package ex01;

/*
 * Bài 1 (30đ): Cho dãy N (0 <= N < 100) phần tử. Mỗi phần tử N[i] (1 <= N[i] <= 20) là
một số nguyên
Yêu cầu: Mỗi câu không được quá 10 dòng code
 Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
Example: input: 1 2 3 4 5 6 5 5 3 1
output: 2 4 6
 Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N
Example: input: 5 7 9 10 20 9 7 11
output: 7 9F
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,5,5,3,1};
		int[] b=new int[21];
		int maxai=a[0];
		for (int i=0;i<a.length;i++) {
			b[a[i]]+=1;
		}
		System.out.println("element only appear one time ");
		for(int i=1;i<=20;i++) {
			if(b[i]==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\nelement appear more than one time");
		for(int i=1;i<=20;i++) {
			if(b[i]>1) {
				System.out.print(i+" ");
			}
		}
		
		
	}
}
