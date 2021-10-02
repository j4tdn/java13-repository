
import java.util.Random;
import java.util.ArrayList;


public class Ex03 {
	private static Random rd= new Random();
	public static void main(String[] args) {
		int x = 1;
		int n=rd.nextInt(3) +2;
		int[] arr = new int[n];
		randomArray(arr);
		showArray(arr);
		
		for (int i=0;i<n;i++) {
			if (i==0||i==1) x=getLCM(arr[0],arr[1]);
			else {
				x=getLCM(x,arr[i]);
			}
		}
		
		System.out.println("LCM:"+x);
		
 	}
	public static void randomArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=rd.nextInt(10)+1;
		}
	}
	public static void showArray(int[] arr) {
		System.out.print("[");
		for (int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[arr.length-1]+"]");
	}
	public static int getLCM(int a,int b) {
		int n=1;
		while(n%a!=0||n%b!=0) n++;
		return n;
	}
}
