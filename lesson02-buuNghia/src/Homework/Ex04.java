package Homework;
import java.util.Scanner;

public class Ex04 {
	public  static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input array size:");
		int n=sc.nextInt(),max=0;
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			System.out.print("arr["+i+"]=");
			arr[i] =sc.nextInt();
			if (arr[i]%2==1&&arr[i]>max) max=arr[i];
		}
		if (max==0) System.out.print("There are no odd number.");
		else System.out.print(max+" is the largest odd number");
	}
}
