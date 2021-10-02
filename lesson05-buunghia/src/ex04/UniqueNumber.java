package ex04;
import java.util.Random;
import java.util.Arrays;
public class UniqueNumber {
	private static Random rd=new Random();
	public static void main(String[] args) {
		int n=rd.nextInt(19) +2;
		int[] arr= new int[n];
		System.out.println("Original array:");
		ex03.CommonMultiple.rndArray(arr);
		ex03.CommonMultiple.printArray(arr);
		int[] arr2=getUniqueNumber(arr);
		Arrays.sort(arr2);
		System.out.println("Unique number:");
		System.out.print("[");
		for (int i=0;i<arr2.length-1;i++) {
			if (arr2[i]!=0) System.out.print(arr2[i]+",");
		}
		System.out.println(arr2[arr2.length-1]+"]");
	}
	public static boolean isUnique(int[] arr,int u) {
		int count=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==u) count++;
		}
		if (count==1) return true;
			     else return false;
	}
	public static int[] getUniqueNumber(int[] arr) {
		int[] arr2=new int[arr.length];
		int j=0;
		for (int i=0;i<arr.length;i++) {
			if (isUnique(arr,arr[i])) {
				arr2[j]=arr[i];
				j++;
			}
		}
		
		return arr2;
	}
	
}
