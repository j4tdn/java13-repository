package ex01;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức:
 * Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
 * So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
 * Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng nhau 
 * VD: {7 8 8 8 6 2 5 1} Kết quả: 6
 *
 */

public class Ex01 {
	public static void main(String[] args) {
		int[] arr;
		arr = getArr(5);
		System.out.println(Arrays.toString(arr));
		int[] removeArr;
		removeArr = remove(arr);
		System.out.println(Arrays.toString(removeArr));
		
		if(compareAVG(arr) > 0) {
			System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên LỚN HƠN n/2 phần tử cuối cùng");
		} else if (compareAVG(arr) == 0){
			System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên BẰNG n/2 phần tử cuối cùng");
		}else {
			System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên NHỎ HƠN n/2 phần tử cuối cùng");
		}
		
		int[] findMaxArr = {7, 8, 8, 8, 6, 2, 5, 1};
		System.out.println("The thirst maximium value in array is: " + thirstMax(findMaxArr));
	}
	public static int[] getArr(int length) {
		Random rd = new Random();
		int [] arr = new int[length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
		}
		return arr;
	}
	
	public static int[] remove(int[] arr) {
		int[] temp = new int[arr.length];
		boolean flag;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			flag = false;
			for(int j = 0; j < arr.length - 1; j++) {
				if(temp[j] == arr[i]) {
					flag = true;
				break;
				}
			}
			if(!flag) {
				temp[count++]=arr[i];

			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public static int compareAVG(int[] arr) {
		int m = arr.length / 2;
		int sumL = 0, sumR = 0;
		int i = 0;
		while(i < m) {
			sumL += arr[i];
			sumR += arr[arr.length - 1 - i];
			i++;
		}
		return (sumL - sumR) / m;
		
	}
	
	public static int thirstMax(int[] arr) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		if(arr.length < 3) System.out.println("Array's length must be better than 2 ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max1) max1 = arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max2 && arr[i] != max1) max2 = arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max3 && arr[i] != max1 && arr[i] != max2) max3 = arr[i];
		}		
		return max3;
	}
	
	
}
