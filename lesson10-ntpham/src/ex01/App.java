package ex01;

import java.util.Arrays;

/**
 * a) Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4} 
 * b) So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng 
 * c) Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng nhau
 * 	  VD: {7 8 8 8 6 2 5 1} Kết quả: 6
 */

public class App {

	private static int[] numbers = { 1, 2, 3, 4, 3, 1 };

	public static void main(String[] args) {
		System.out.println("Origin array: " + Arrays.toString(numbers));

		System.out.println("///////////////========///////////////");

		// a) Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
		System.out.println("Array after remove duplicate numbers: " + Arrays.toString(removeDuplicateNumbers(numbers)));
		
		System.out.println("///////////////========///////////////");

		// b) So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng 
		
		int sum1 = sum(numbers, (number -> number < numbers.length/2));
		int sum2 = sum(numbers, (number -> number >= numbers.length/2));

		System.out.println("Sum before half of numbers: " + sum1);
		System.out.println("Sum after half of numbers: " + sum2);
		
		String compare = "";
		
		if (sum1 == sum2) compare = "equal";
		else {
			compare = sum1 > sum2 ? "bigger" : "smaller";
		}
		
		System.out.println("Sum before half of numbers " + compare + " sum after half of numbers");
		
		System.out.println("///////////////========///////////////");
		
		// c) Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng nhau
		//    VD: {7 8 8 8 6 2 5 1} Kết quả: 6
		System.out.println("Third Largest Number: " + thrirdLargestNumber(numbers));
		
	}

	private static int[] removeDuplicateNumbers(int[] origin) {

		int[] result = Arrays.copyOfRange(origin, 0, origin.length);

		boolean[] flags = new boolean[origin.length];
		int count = 0;

		for (int i = 0; i < origin.length; i++) {
			if (!flags[i] && !isDuplicateElement(flags, origin, i))
				result[count++] = origin[i];
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static boolean isDuplicateElement(boolean[] flags, int[] origin, int index) {
		int count = 0;
		for (int i = index + 1; i < origin.length; i++) {
			if (origin[i] == origin[index]) {
				flags[i] = true;
				count++;
			}
		}
		return count > 0;
	}
	
	private static int sum(int[] origin, Strategy strategy) {
		int sum = 0;
		for (int i = 0; i < origin.length; i++) {
			if (strategy.execute(i))
				sum += origin[i];
		}
		return sum;
	}
	
	private static int thrirdLargestNumber(int[] origin) {
		int max1 = Integer.MIN_VALUE; 
		int max2 = Integer.MIN_VALUE; 
		int max3 = Integer.MIN_VALUE; 
		for (int i = 0; i < origin.length; i++) {
			if (origin[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = origin[i];
			}
			else if (origin[i] < max1 && origin[i] > max2) {
				max3 = max2;
				max2 = origin[i];
			}
			else if (origin[i] < max2 && origin[i] > max3) max3 = origin[i];
		}
		return max3;
	}	
}
