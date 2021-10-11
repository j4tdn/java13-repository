package ex03;
import java.util.Random;
import java.util.ArrayList;

/**
 * Giống bài a BN
 * Hôm sau nhớ làm riêng lẻ giúp a nha :P
 * same point 16đ
 */
public class CommonMultiple {
	private static Random rd= new Random();
	public static void main(String[] args) {
		int x = 1;
		int n=rd.nextInt(19) +2;
		int[] arr = new int[n];
		rndArray(arr);
		printArray(arr);
		
		for (int i=0;i<n;i++) {
			if (i==0||i==1) x=getLeastCommonMultiple(arr[0],arr[1]);
			else {
				x=getLeastCommonMultiple(x,arr[i]);
			}
		}
		
		System.out.println("BCNN:"+x);
		
 	}
	public static void rndArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=rd.nextInt(10)+1;
		}
	}
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[arr.length-1]+"]");
	}
	public static int getLeastCommonMultiple(int a,int b) {
		int n=1;
		while(n%a!=0||n%b!=0) n++;
		return n;
	}
}
