package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		
		arr.forEach(n -> System.out.print(n + " "));
		System.out.println();

		System.out.println("============================");
		System.out.println("phần tử xuất hiện nhiều lần: ");
		List<Integer> moreTimeNum = moreTime(arr).stream().distinct().collect(Collectors.toList());
		moreTimeNum.forEach(x -> System.out.print(x + " "));
		System.out.println();

		System.out.println("============================");
		System.out.println("phần tử xuất hiện một lần: ");
		List<Integer> oneTimeNum = oneTime(arr);
		oneTimeNum.forEach(x -> System.out.print(x + " "));
		System.out.println();
	}
	
	// code logic tốt
	// nhưng sao Chánh không áp dụng mấy cách mới a có hướng dẫn để làm
	private static List<Integer> oneTime(List<Integer> arr) {
		
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {
				// Từ dòng 36 đến 45 em có thể tách ra 1 method mới thì code sẽ gọn hơn
				int k = 0;
				for (int j = 0; j < arr.size(); j++) {
					
					if (arr.get(i) == arr.get(j)) {
							k++;
					}
				}
				if (k==1) {
					result.add(arr.get(i));
				}
		}
		return result;
	}

	private static List<Integer> moreTime(List<Integer> arr) {
		List<Integer> result = new ArrayList<Integer>(arr);
		// Kết quả chính xác như cách làm này chưa hợp lý
		// Nó phụ thuộc vào hàm oneTime
		// Như vào test bằng code hàm moreTime e phải code thêm oneTime thì hơi mất công và chưa tốt
		if (result.removeAll(oneTime(arr))) {
			return result;
		}
		return null;
	}

}