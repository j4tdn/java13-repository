package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Cho dãy N (0 <= N < 100) phần tử. Mỗi phần tử N[i] (1 <= N[i] <= 20) là một số nguyên
 * Yêu cầu: Mỗi câu không được quá 10 dòng code
 * Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
 * Example: input: 1 2 3 4 5 6 5 5 3 1
 * output: 2 4 6
 * Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N
 * Example: input: 5 7 9 10 20 9 7 11
 * output: 7 9
 *
 */
public class Ex01 {
	public static void main(String[] args) {
			List<Integer> digits = getList(100);
			System.out.println(digits);
			List<Integer> uniqueDigits =  digits.stream()
					.filter(number -> {
						   int count = 0;
						   for (Integer digit : digits) {
							   if(number == digit) {
								   count++;
							   }
						}
						   return count == 1;
					   })
					   .distinct()
					   .toList(); 
			System.out.println("================");
			System.out.println(uniqueDigits);
			//xuất hiện nhiều hơn 1 lần trong dãy
			List<Integer> unUniqueDigits = digits.stream()
							   .filter(number -> {
								   int count = 0;
								   for (Integer digit : digits) {
									   if(number == digit) {
										   count++;
									   }
								}
								   return count > 1;
							   })
							   .distinct()
							   .toList();
			System.out.println("================");
			System.out.println(unUniqueDigits);
	}
	public static List<Integer> getList(int number){
		ArrayList<Integer> list = new ArrayList<>();
		Random rd = new Random();
		for(int i = 1; i <= number; i++) {
			list.add(rd.nextInt(20) + 1);
		}
		return list;
	}
}
