package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int [] numbers = new int[n];
		
		for(int i = 0; i < n; i++) {
			numbers[i] = new Random().nextInt(7) + 1;
		}
		System.out.println("Mảng hiện tại: " + Arrays.toString(numbers));
		
		ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!arr.contains(numbers[i])) {
                arr.add(numbers[i]);
            }
        }
        n = 0;
        for (int i = 0; i < arr.size(); i++) {
            numbers[n++] = arr.get(i);
        }
        System.out.println("Mảng sau khi xóa phần tử trùng nhau : ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + "\t");
        }
       int[] firstArr = firstArr(numbers);
       System.out.println("\nMảng đầu tiên: " + Arrays.toString(firstArr));
       
       int []secondArr = secondArr(numbers);
       System.out.println("\nMảng nửa cuối: " + Arrays.toString(secondArr));
       
       int resultFirst = averageNumber(firstArr);
       System.out.println("Trung bình mảng 1: " + resultFirst/firstArr.length);
       int resultSecond = averageNumber(secondArr);
       System.out.println("Trung bình mảng 2: " + resultSecond/secondArr.length);
       
       System.out.println(resultFirst > resultSecond);
       
       print3largest(numbers);
	}
	private static int[] firstArr(int[] origin) {
		 int [] firstArr = new int[origin.length];
		 int f =0;
		 for(int i = 0; i < origin.length/2;i++) {
	        	firstArr[f]= origin[i];
	        	f++;
	        }
		 return Arrays.copyOfRange(origin, 0, f);
	}
	private static int[] secondArr(int[] origin) {
		 int [] secondArr = new int[origin.length];
		 int s =0;
		 for(int i = origin.length/2 ; i < origin.length ;i++) {
			 secondArr[s]= origin[i];
	        	s++;
	        }
		 return Arrays.copyOfRange(origin, s, origin.length);
	}
	private static int averageNumber(int [] arr) {
		int sumArr = 0;
		for(int i = 0; i < arr.length;i++) {
			sumArr += arr[i];
		}
		return sumArr;
	}
	private static void print3largest(int [] arr) {
        int i, first, second,third = 0;
        if (arr.length < 3) {
            System.out.print(" không hợp lệ ");
            return;
        }
        first = second = third = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = third;
                first = arr[i];
            }
            if (arr[i] < first && arr[i] < second && arr[i] > third) {
                third = arr[i];
            }
        }
        if (third == Integer.MIN_VALUE)
            System.out.print("không tồn tại ");
        else
            System.out.print("phần tử lơn thứ 3: " + third);
    }
}
