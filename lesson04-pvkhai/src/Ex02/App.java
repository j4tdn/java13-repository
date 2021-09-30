package Ex02;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int[] a = inputArr();
		showArr(a);
		a = move(a);
		System.out.println("\n==================");
		showArr(a);
	}
	public static int[]  inputArr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của dãy: ");
		int n = Integer.parseInt(sc.nextLine());
		int[] a = new int [n];
		for(int i = 0 ;i<n;i++) {
			System.out.print("a["+i+"]: ");
			a[i] = Integer.parseInt(sc.nextLine());
		}
		return a;
	}
	public static void showArr(int[] a) {
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	public static int[] move(int[] a) {
		int start = 0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%7==0 && a[i]%5!=0) {
				int tmp1 = a[start];
				a[start] = a[i];
				a[i] = tmp1;
				start++;
			}
		}
		
		int end = a.length-1;
		for(int j=a.length-1;j>=0;j--) {
			if(a[j]%5==0 && a[j]%7!=0) {
				int tmp2 = a[end];
				a[end] = a[j];
				a[j] = tmp2;
				end--;
			}
		}
		
		return a;
	}

}
