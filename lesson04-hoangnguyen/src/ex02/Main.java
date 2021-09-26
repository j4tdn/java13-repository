package ex02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("Input elements of array: ");
			n = Integer.parseInt(sc.nextLine());
		} while(n == 0);
		int[] arr = new int[n];
		inputArray(arr);
		System.out.println("Original Array: ");
		showArray(arr);
		divisibleBy7(arr);
		divisibleBy5(arr);
		System.out.println("New Array: ");
		showArray(arr);
		
	}
	
	public static void showArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = ", i);
			arr[i] = Integer.parseInt(sc.nextLine());
		}
	}
	
	public static void divisibleBy7(int[] arr) {
		int start = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start++;
			}
		}
	}
	
	public static void divisibleBy5(int[] arr) {
		int start = arr.length - 1;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] % 5 == 0 && arr[i] % 7 != 0) {
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start--;
			}
		}
	}

	
}
