package ex04;

import java.util.ArrayList;

/**
 * 18đ
 * @author qphan
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] arrayA = {3, 15, 21, 0, 15, 17, 21};
		getUniqueNumbers(arrayA);
	}
	
	public static ArrayList<Integer> getUniqueNumbers(int[] arrayA) {
		ArrayList<Integer> result = new ArrayList<>();

		for(int i = 0; i < arrayA.length; i++) {
			int count = 0;
			// Tương tự bài 2
			// Cách làm này là cứ 1 phần tử a cứ đi compare với hết tất cả phần tử
			// Xong nếu nó count = 1 chứng tỏ trùng vs chính nó >> xuất hiện 1 lần
			// Nếu n=100 thì sẽ duyệt thành 100*100
			// Complexity: O(n2)
			// Có thể tìm cách làm tốt hơn để giảm số vòng lặp
			for(int j = 0; j < arrayA.length; j++) {
				if (arrayA[i] == arrayA[j]) {
					count++;
				}
			}
			if (count == 1) {
				result.add(arrayA[i]);
			}
		}
		System.out.println(result);
		return result;
	}
}
