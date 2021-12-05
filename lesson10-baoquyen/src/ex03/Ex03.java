package ex03;

import java.util.Arrays;

/**
 * Cho mảng string có n phần tử (2 < n < 100).
 *  Mảng cho phép chứa các phần tử là số âm, số dương, chuỗi “special” và các chuỗi kí tự khác.
 *  Viết chương trình sắp xếp mảng string.Biết rằng. Khi chạy chương trình mảng sẽ sắp xếp như sau
 *  Special => số âm => số dương => tăng dần các chuỗi còn lại trong mảng.
 *  Ngược lại khi sắp xếp giảm dần sẽ được kết quả sau
 *  Giảm dần các chuỗi trong mảng => số dương => số âm => Special
 *  VD: String[] strings = {“-2”, “-6”, “10”, null, “4”, “8”, null, “Special”, “a”, “c”, “b”, “xx”} 
 *  Tăng dần: Special, -6, -2, 4, 8, 10, a, b, c, xx, null, null 
 *  Giảm dần: null, null, xx, c, b, a, 10, 8, 4, -2, -6, Special
 * @author PC
 *
 */

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = {"2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		sort(strings, (int a, int b) -> a - b);
		System.out.println("ESC: " + Arrays.toString(strings));
		
		System.out.println("========================");
		sort(strings, (int a, int b) -> b - a);
		System.out.println("DSC: " + Arrays.toString(strings));
		
	}
	
	public static void sort(String[] s, Strategy strategy) {
		for(int i = 0; i < s.length - 1; i++) {
			for(int j = i + 1; j < s.length; j++ ) {
				int a = priority(s[i]);
				int b = priority(s[j]);
				if(strategy.execute(a, b) > 0) {
					swap(s, i, j);
				}else if(strategy.execute(a, b) == 0) {					
						if (strategy.execute(compareStr(s[i], s[j]), 0) > 0)
							swap(s, i, j);								
				}
			}				
		}
	}
	
	private static int compareStr(String s1, String s2) {
		if (priority(s1) == 1 || priority(s1) == 5) return 0;
		if (priority(s1) == 2 || priority(s1) == 3) {
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			return n1 - n2; 
		}
		return s1.compareTo(s2);
	}
	
	public static int priority(String s) {
		if (s == null) return 5;
		if ("Special".equals(s)) return 1;
		if (isNumber(s)) {
			Double number = Double.parseDouble(s);
			return number < 0 ? 2 : 3;		
		}
		return 4;
	}
	
	private static boolean isNumber(String s) {
		try {
			Double.parseDouble(s);
		} catch(RuntimeException e) {
			return false;
		}
		return true;
	}
	
	public static void swap(String [] arr , int before, int after) {
		String temp = arr[before];
		arr[before] = arr[after];
		arr[after] = temp;
	}
}
