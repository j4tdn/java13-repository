package ex01;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("1. Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N");
		System.out.println("Once time: " + onceTime(Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1)));
		System.out.println("==============================================");
		System.out.println("2. Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N");
		System.out.println("More one time: " + moreOneTime(Arrays.asList(5, 7, 9, 4, 10, 20, 9, 7, 11)));
	}
	private static List<Integer> onceTime(List<Integer> numbers){
		return numbers.stream().filter( a -> {
			int count = 0;
			for(Integer s : numbers) {
				if (a == s) {
					count++;
				}
			}
			return count == 1;
		}).toList();
	}
	
	private static List<Integer> moreOneTime(List<Integer> numbers){
		return numbers.stream().filter( a -> {
			int count = 0;
			for(Integer s : numbers) {
				if (a == s) {
					count++;
				}
			}
			return count > 1;
		}).distinct().toList();
	}
}
