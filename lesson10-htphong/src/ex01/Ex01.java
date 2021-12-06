package ex01;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01 {
	/**
	 * Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
	 * So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
	 * Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng
	   nhau VD: {7 8 8 8 6 2 5 1} Kết quả: 6
	 */
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 3, 1};
		System.out.println("AfterDelete: " + Arrays.toString(delete(numbers)));
		String result = (compare(numbers)==true)?"trước lớn hơn sau":"sau lớn hơn trước";
		System.out.println("Average Value : " + result);
		int[] numberss = {7, 8, 8, 8, 6, 2, 5, 1};
		System.out.println("3th numbers: " + number3th(numberss));
	}
	private static int[] delete(int[] numbers) {
		int[] a = numbers;
		int[] b = new int[a.length];
		int k = 0;
		for(int i = 0; i < a.length; i++) {
			int count = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
			if(count == 1) {
				b[k] = a[i];
				k++;
			}
		}
		return Arrays.copyOfRange(b, 0, k);
	}
	private static boolean compare(int[] numbers) {
		int sum1 = 0;
		int sum2 = 0;
		int k = numbers.length/2;
		for(int i = 0; i < numbers.length; i++) {
			if(i < k) {
				sum1 += numbers[i];
			}
			else {
				sum2 += numbers[i];
			}
		}
		
		return sum1>sum2;
	}
	private static int number3th(int[] numbers) {
		int[] a = numbers;
		int[] b = new int[a.length];
		int k = 0;
		// Loại bỏ số dư thừa
		for(int i = 0; i < a.length; i++) {
			if(!contains(b, a[i])) {
				b[k]=a[i];
				k++;
			}
		}
		int[] c = Arrays.copyOfRange(b, 0, k);
		// Sắp xếp mảng giảm dần
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c.length - i - 1; j++) {
				if(a[j] < a[j+1]) {
					ArrayUtils.swap(c, j, j+1);
				}
			}
		}
		return c[2];
	}
	private static boolean contains(int[] numbers, int value) {
		for(int i = 0; i<numbers.length;i++) {
			if(numbers[i] == value) return true;
		}
		return false;
	}
}
