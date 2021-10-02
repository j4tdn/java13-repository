package ex02;
import java.util.Random;
import java.util.ArrayList;

public class MissingNumber {
	private static Random rd=new Random();
	public static void main(String[] args) {
		
		int n=rd.nextInt(20)+1;
		ArrayList<Integer> arr=new ArrayList<>();
		rndArray(arr,n);
		int x=getMissingNumber(arr,n);
		printArray(arr);
		System.out.println("Missing number:"+x);
	}
	public static void rndArray(ArrayList<Integer> arr,int n) {
		int x;
		for (int i=0;i<n-1;i++) {
			do {
				x=rd.nextInt(n)+1;
			}while(arr.contains(x));
			arr.add(x);
		}
	}
	public static void printArray(ArrayList<Integer> arr) {
		System.out.print("[");
		for (int i=0;i<arr.size()-1;i++) {
			System.out.print(arr.get(i)+",");
		}
		System.out.println(arr.get(arr.size()-1)+"]");
	}
	public static int getMissingNumber(ArrayList<Integer> arr, int n) {
		for (int i=1;i<=n;i++) {
			if (!arr.contains(i)) return i;
		}
		return -1;
	}
}
