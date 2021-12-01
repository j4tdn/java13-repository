package operation;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int [] input = {1,2,3,4,5,6,7,8,11,15};
		reverse(input);
		System.out.println(Arrays.toString(input));
		sortArr(input);
		System.out.println(Arrays.toString(input));
	}
	private static void reverse(int [] origin) {
		for(int i = 0;i < origin.length/2;i++) {
			int tmp = origin[i];
			origin[i] = origin[origin.length-i -1];
			origin[origin.length-1 -i] = tmp;
		}
	}
	private static void sortArr(int [] arr) {
		for(int i = 0; i < arr.length ;i++) {
			for (int j = i + 1;j <= arr.length -1;j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

