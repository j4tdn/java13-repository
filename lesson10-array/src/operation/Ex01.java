package operation;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) throws IllegalAccessException {
		int [] numbers = {1, 9, 5, 36, 12, 33};
		//Tìm phàn tử lẻ trong mảng.
		
		int sumOfOffElms = sum(numbers, number -> number %2 != 0);
		System.out.println("sumOfOffElms : " + sumOfOffElms);
		
		//Tìm max và min trong vòng lặp
		Tuple minMaxTuple = getMaxMin(numbers);
		System.out.println("minMaxTuple : " + minMaxTuple);
		//Thêm 1 phần tử vào 1 mảng
		
		int[] newAddedArray = add(numbers, 3, 18);
		System.out.println("newAddedArray: " + Arrays.toString(newAddedArray));
		
		int [] newdelateArray = remove(numbers, 2);
		System.out.println("newdelateArray: " + Arrays.toString(newdelateArray));
		
		int [] newRemoveArray = remove(numbers, 3);
		System.out.println("newRemovedArray: " + Arrays.toString(newRemoveArray));
		
	}
	private static int[] delete(int [] origin, int k) {
		//B1
		int [] result = Arrays.copyOfRange(origin, 0, origin.length);
		
		for (int i =k; i < result.length;i++) {
			result[i]= origin[i+1];
		}
		return Arrays.copyOfRange(result, 0, result.length-1);
	}
	
	private static int[] remove(int []origin,int k) throws IllegalAccessException {
		if (k <0 || k > origin.length -1) {
			throw new IllegalAccessException(k +  " cannot out of range (0," + (origin.length-1)+")");
		}
		//B1 : tạo 1 mảng mới với size mới bằng size cũ trừ 1
		int [] result = new int [origin.length-1];
		
		//B2 copy origin's elements (from 0 to k -1) to new array.
		for (int i = 0;i < k;i++) {
			result[i]= origin[i];
		}
		//B3: copy origin's elements (from k+1 to length-1) to new array. 
		for(int i = k +1;i< result.length;i++) {
			result[i] = origin[i+1];
		}
		return origin;
	}
	
	private static int sum(int [] numbers, Strategy stratery ) {
		int sum = 0;
		for(int number : numbers) {
			if(stratery.execute(number)) {
				sum += number;
			}
		}
		return sum;
	}
	private static Tuple getMaxMin(int [] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int number : numbers) {
			if(max < number) {
				max = number;
			}
			if (min > number) {
				min = number;
			}
		}
		return new Tuple(max, min);
	}
	private static int [] add(int [] origin,int k, int newElement) {
		//B1 tạo mới 1 mảng
		int [] result = new int [origin.length + 1];
		//B2 copy mảng ban đầu qua mảng mới
		for (int i = 0; i < origin.length;i++) {
			result[i] = origin[i];
			
		}
		//B3 dịch phải 1 đơn vị là duyệt từ phải sang trái
		for( int i = result.length -1; i>k;i--) {
			result[i] = result[i - 1];
			
		}
		result[k] = newElement;
		
		return result;
	}
}
