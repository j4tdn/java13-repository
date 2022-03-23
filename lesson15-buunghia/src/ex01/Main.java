package ex01;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 7, 2);
		 List<Integer> bt1= numbers.stream().distinct().collect(Collectors.toList());
		 
		 // distinct khác với xuất hiện 1 lần Nghĩa nha
		 // VD: input: 1 1 2
		 // distinct: 1 2
		 // one-time: 2
	}
}
