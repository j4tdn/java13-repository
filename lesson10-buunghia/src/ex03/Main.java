package ex03;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] array = {"2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		sortArray(array);
		System.out.println(Arrays.toString(array));
	}
	public static int compareValueOf(String a) {
		if (a == null) return 4;
		if (a.equalsIgnoreCase("Special")) return 0;
		if (Pattern.matches("^-\\d*", a)) return 1;
		if (Pattern.matches("\\d*", a)) return 2; 
		return 3;
	}
	public static int compare(String a, String b) {
		int x=compareValueOf(a);
		int y=compareValueOf(b);
		if (x != y) return x-y;
		else {
			if (x == 0 || x== 3 || x==4) return 0;
			if (x == 1 || x == 2) {
				x=Integer.parseInt(a);
				y=Integer.parseInt(b);
				return x-y;
			}
		}
		return -1;
	}
	public static void swap(String[] arr, int i, int j) {
		String temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void sortArray(String[] arr) {
		int n=arr.length;
		for (int i = 0 ;i < n -1; i++) {
			for (int j =0 ; j < n - 1 - i; j++)
				if (compare(arr[j],arr[j+1]) > 0)
					swap(arr,j,j+1);
		}
	}
}
