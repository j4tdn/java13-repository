package ex03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

/**
 * Khi chạy chương trình mảng sẽ sắp xếp như sau Special => số âm => số dương =>
 * tăng dần các chuỗi còn lại trong mảng. Ngược lại khi sắp xếp giảm dần sẽ được
 * kết quả sau Giảm dần các chuỗi trong mảng => số dương => số âm => Special
 *
 */
public class Main {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1 == null && o2 != null) {
					return 1;
				} else if (o2 == null || "Special".equals(o1)) {
					return -1;
				} else if (isDigit(o1) && isDigit(o2)) {
					return Integer.parseInt(o1) - Integer.parseInt(o2);
				}
				return o1.compareTo(o2);
			}

		};

		Arrays.sort(strings, comparator);
		System.out.print("Sorting: " + Arrays.toString(strings));
	}

	private static boolean isDigit(String s) {
		try {
			Integer.parseInt(s);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
}
