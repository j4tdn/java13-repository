package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
			//  A hiểu cách làm - Cách làm và logic tốt
			// Nhưng a nghĩ có thể enhance chỗ này
			// E cho từng phần tử đi so sánh với tất cả các phần tử trong mảng
			// Nếu count = 1 là bằng chính nó và chỉ xuất hiện 1 lần.
			// Kết quả đúng rồi như như vậy nó sẽ dẫn đến số lần duyệt bị lặp lại
			// VD: 1 2 1 1 thì 2 thằng 1 1 cuối cùng phải duyệt y chang thằng 1 ở index = 0
			// E có thể tạo mảng boolean[] flags. VD lần đầu e duyệt 1(index=0) trùng vs 1(index=2,3) thì e cho flag chỗ đó true là đã trùng
			// qua những lần sau trước khi kiểm tra thằng 1(index=2,3) thì xem cái flag đang true thì k cần duyệt
			// Hoặc dùng cách stream như những bạn khác làm collect(Collectors)
			for(Integer s : numbers) {
				if (a == s) {
					count++;
				}
			}
			return count == 1;
		}).collect(Collectors.toList()); // Phong quên code à em - Phải là stream.collect(Collectors.toList())
		// Idea đúng mà quên hàm nên a vẫn cho điểm ok nhé
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
		}).distinct().collect(Collectors.toList());
	}
}
