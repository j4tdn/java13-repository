package ex03;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Input n: ");
			n = Integer.parseInt(sc.nextLine());
			
		} while(n < 2 || n > 20);
		
		System.out.println("Bội chung nhỏ nhất: " + getLeastCommonMultiple(n));;
	}
	
	public static int getLeastCommonMultiple(int n) {
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(10) + 1;
			System.out.print(arr[i] + ", ");
		}
		
		int temp = BCNN(arr[0], arr[1]);
		for(int i = 2; i < n; i++) {
			temp = BCNN(temp, arr[i]);
		}
		
		return temp;
		
	}
	
	public static int BCNN(int a, int b) {
		return (a * b / UCLN(a, b));
	}
	
	public static int UCLN(int a, int b) {
		if(a == b) return a;
		if(a > b) {
			return UCLN(a - b, b);
		} else {
			return UCLN(a, b - a);
		}
	}
}
