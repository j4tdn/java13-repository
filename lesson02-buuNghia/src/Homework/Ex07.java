package Homework;
import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd=new Random();
		int[] arr = new int[5];
		int n;
		for (int i=0;i<5;i++) {
			do {
				n=20+rd.nextInt(11);
			}while(isInArray(arr,n));
			arr[i]=n;
		}
		for (int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	private static boolean isInArray(int[] arr,int n) {
		for (int i=0;i<5;i++) {
			if (arr[i]==n) return true;
		}
		return false;
	}
}
