package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 3, 1};
		System.out.println(Arrays.toString(deleteDuplicate(input)));
		
		compare(input);
		
		int[] input2 = {7, 8, 8, 8, 6, 2, 5, 1};
		int result = rank3(input2);
		System.out.println(result);
	}
	
	
	public static int[] deleteDuplicate(int[] input) {
		int count = 0;
		int[] result = new int[input.length];
		for(int i = 0; i <input.length; i++) {
			if(isCheckDuplicate(i, input)) {
				break;
			} else {
				result[count++] = input[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	public static boolean isCheckDuplicate(int i, int[] input) {
		for (int j = 0; j < input.length; j++) {
			if (i != j && input[i] == input[j]) {
				return true;
			}
		}
		return false;
	}
	
	private static void compare(int[] input) {
		int firstHalf = 0;
		int secondHalf = 0;
		for (int i = 0; i < input.length/2; i++) {
			firstHalf += input[i];
		}
		for (int i = input.length/2; i < input.length; i++) {
			secondHalf += input[i];
		}
		if (firstHalf < secondHalf) {
			System.out.println("nửa đầu bé hơn nửa sau");
		} else if (firstHalf == secondHalf) {
			System.out.println("nửa đầu bằng nửa sau");
		} else {
			System.out.println("nửa đầu lớn hơn nửa sau");
		}
	}
	
	private static int rank3(int[] input) {
		int[] resultNoDup = new int[input.length];
		int count = 0;
		for(int i = 0; i < input.length; i++) {
			if (!isCheckDuplicate(i, input)) {
				resultNoDup[count++] = input[i];
			}
		}
		
		int[] a = Arrays.copyOfRange(resultNoDup, 0, count);
		int[] result = sortDESC(a);
		return result[1];
	}
	
	public static int[] sortDESC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
