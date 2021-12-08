package ex01;
import java.util.Random;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[5];
		rndArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(removeDuplicates(arr)));
		if (findAvg(arr,0,10) > findAvg(arr,10,19))
			System.out.println("The first half on average is greater than the second half on average");
		else if (findAvg(arr,10,19) > findAvg(arr,0,10))
			System.out.println("The second half on average is greater than the first half on average");
		else
			System.out.println("The frist half is equal to the second half on average ");
		
		int a = thirdLargest(arr);
		if (a == -1) 
			System.out.println("There is no third largest number");
		else
			System.out.println(a+" is the third largest number in array");
		
	}
	private static void rndArray(int[] arr) {
		Random rd = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10);
		}
	
	}
	private static double findAvg(int[] arr,int start,int end) {
		int total=0;
		for (int i = start; i <= end; i++) {
			total+=arr[i];
		}
		return  ((double) total)/(end-start+1);
	}
	private static int[] removeDuplicates (int[] arr) {
		int count = 0, n = arr.length;
		int repeat;
		int[] arr2 = new int[arr.length];
		for (int i =0; i < n;i++) {
			repeat=0;
			for (int j = 0;j < n; j++) {
				if (arr[j] == arr[i])
					repeat++;
			}
			if (repeat <= 1) 
				arr2[count++] = arr[i];
			
		}
		return Arrays.copyOf(arr2,count);
	}
	private static int thirdLargest(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int max1= arr[n-1];
		int max2;
		for (int i = n-1; i>=0; i--) {
			if (arr[i]<max1) {
				max2=arr[i];
				for (int j = i; j>=0; j--) {
					if (arr[j]<max2)
						return arr[j];
				}
			}
		}
		return -1;
	}
}
