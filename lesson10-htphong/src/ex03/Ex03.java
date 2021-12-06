package ex03;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", 
							"a", "c", "b", "xx"};
		System.out.println("Ascending: " + Arrays.toString(ascending(strings)));
		System.out.println("Descending: " + Arrays.toString(descending(strings)));
	}
	private static String[] ascending(String[] strings) {
		int[] numbers = new int[strings.length];
		String[] result = new String[strings.length];
		int k = 0;
		// Lấy số 
		for(int i = 0; i<strings.length;i++) {
			if(isDigit(strings[i])) {
				numbers[k] = Integer.parseInt(strings[i]);
				k++;
			}
		}
		int[] digits = Arrays.copyOfRange(numbers, 0, k);
		k = 0;
		// Sắp xếp số 
		for(int i = 0; i < digits.length; i++) {
			for(int j = 0; j < digits.length - i - 1; j++) {
				if(digits[j] > digits[j+1]) {
					ArrayUtils.swap(digits, j, j+1);
				}
			}
		}
		String[] string2 = new String[strings.length];
		for(int i = 0; i<strings.length; i++) {
			if(!isDigit(strings[i])&&strings[i]!="Special"&&strings[i]!=null){
				string2[k] = strings[i];
				k++;
			}
		}
		String[] string3 = Arrays.copyOfRange(string2, 0, k);
		for(int i = 0; i<string3.length; i++) {
			for(int j = 0; j<string3.length-i-1;j++) {
				if(string3[j].compareTo(string3[j+1])>0) {
					ArrayUtils.swap(string3, j, j+1);
				}
			}
		}
		result[0] = "Special";
		int count = 1;
		for(int digit: digits) {
			result[count] = Integer.toString(digit);
			count++;
		}
		for(String s : string3) {
			result[count] = s;
			count++;
		}
		return result;
	}
	private static String[] descending(String[] strings) {
		String[] result = strings;
		result = ascending(result);
		for(int i = 0; i<result.length/2; i++) {
			ArrayUtils.swap(result, i, result.length-i-1);
		}
		return result;
	}
	private static boolean isDigit(String s) {
		try {
			Integer.parseInt(s);
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}
}
