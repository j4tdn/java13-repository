package ex03;

import java.util.Arrays;
import static ex03.StringUtils.*;

/*
 * Bài 3: Cho mảng string có n phần tử (2 < n < 100). Mảng cho phép chứa các phần tử là
	số âm, số dương, chuỗi “special” và các chuỗi kí tự khác. Viết chương trình sắp xếp	
	mảng string.
	Biết rằng. Khi chạy chương trình mảng sẽ sắp xếp như sau
	Special => số âm => số dương => tăng dần các chuỗi còn lại trong mảng.
	Ngược lại khi sắp xếp giảm dần sẽ được kết quả sau
	Giảm dần các chuỗi trong mảng => số dương => số âm => Special
 */
public class App {
	private static String[] strings = 
		{ "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

	public static void main(String[] args) {
		System.out.println("Origin: ");
		System.out.println(Arrays.toString(strings));
		
		System.out.println("///////////////========///////////////");
		
		// TH1 : ascending
		sort(strings, (a, b) -> a > b);
		System.out.println("Ascending: ");
		System.out.println(Arrays.toString(strings));
		
		System.out.println("///////////////========///////////////");
		
		// TH2 : descending 
		sort(strings, (a, b) -> a < b);
		System.out.println("Descending: ");
		System.out.println(Arrays.toString(strings));
	}
	
	private static void sort(String[] s, Strategy strategy) {
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (strategy.execute(priority(s[i]), priority(s[j]))) {
					StringUtils.swap(s, i, j);
				}
				else if (StringUtils.priority(s[i]) == priority(s[j])) {
					if (strategy.execute(compareStr(s[i], s[j]), 0))
						StringUtils.swap(s, i, j);						
				}
			}
		}
	}
	
	private static int compareStr(String s1, String s2) {
		if (StringUtils.priority(s1) == 1 || StringUtils.priority(s1) == 5) return 0;
		if (StringUtils.priority(s1) == 2 || StringUtils.priority(s1) == 3) {
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			return n1 - n2; 
		}
		return s1.compareTo(s2);
	}
}
