package ex01;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 3, 1, 3};
		System.out.println(Arrays.toString(removeDupElement(number)));
		compare(number);
		
		int[] numbers = {7, 7, 8, 8, 6, 2, 5, 1};
		System.out.println(findThirdMaxElement(numbers));
	}

	private static int[] removeDupElement(int[] origin) {
		int count = 0;
		int number = 0;
		int index = 0;
		int[] result = new int[origin.length];


		for(int i = 0; i < origin.length; i++) {
			number = origin[i];
			count = 0;
			for(int j = 0; j < origin.length; j++) {
				if(number == origin[j]) {
					count++;
				}
			}
			if(count == 1) {
				result[index++] = number;
			}
		}

		return Arrays.copyOfRange(result, 0, index);
	}

	private static void compare(int[] number) {
		int n = number.length;
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < n / 2; i++) {
			sum1 += number[i];
		}
		if(n % 2 == 0) {
			for(int i = n / 2; i < n; i++) {
				sum2 += number[i];
			}
		}
		else {
			for(int i = n / 2 + 1 ; i < n; i++ ) {
				sum2 += number[i];
			}
		}
		if(sum1 > sum2) {
			System.out.println("Giá trị n/2 phần tử đầu tiên lớn hơn giá trị n/2 phần tử sau");
		}
		else if(sum1 < sum2) {
			System.out.println("Giá trị n/2 phần tử đầu nhỏ hơn giá trị n/2 phần tử sau");
		}
		else {
			System.out.println("Giá trị n/2 phần tử đầu bằng giá trị n/2 phần tử sau");
		}
	}
	
	private static int findThirdMaxElement(int[] number) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		for(int i = 0; i < number.length; i++) {
			if(number[i] > max1) {
				max1 = number[i];
			}
		}
		for(int i = 0; i < number.length; i++) {
			if(number[i] > max2 && number[i] != max1) {
				max2 = number[i];
			}
		}
		for(int i = 0; i < number.length; i++) {
			if(number[i] > max3 && number[i] != max1 && number[i] != max2) {
				max3 = number[i];
			}
		}
		return max3;
	}
}
