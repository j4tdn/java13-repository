package ex02;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of string array:");
		int n = Integer.parseInt(sc.nextLine());
		int[] numberArray = new int[n];
		for (int i = 0 ; i < n; i++) {
			System.out.print("String["+i+"]:");
			numberArray[i]=getLargestNumber(sc.nextLine());
		}
		sortArray(numberArray);
		System.out.println("Result:");
		for (int i =0 ;i < n; i++) {
			System.out.print(numberArray[i]+" ");
			
		}
		sc.close();
		
	}
	public static int getLargestNumber(String str){
		String[] strArray = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		int max = 0;
		for (int i = 0 ; i < strArray.length; i++) {
			try {
				int a = Integer.parseInt(strArray[i]);
				if (a > max) max = a;
			}catch(Exception ignored) {
				
			}
		}
		return max;
	}
	public static void sortArray(int[] arr) {
		int n= arr.length;
		for (int i = 0 ;i < n - 1 ;i++) {
			if (arr[i] > arr[i + 1]) {
				for (int j=i+1;j>0;j--) {
					if (arr[j] < arr[j - 1])
						swap(arr,j,j-1);
					else
						break;
				}
			}
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
