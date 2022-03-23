// Tên package convention thường sẽ viết thường 100%
// Tên class theo camel case và chữ đầu tiên viết hoa
package Ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList( 2, 4, 3, 5, 7, 12, 2, 3, 5, 9 );
		// A VA hiểu sai đề câu 1. Xuất hiện 1 lần khác với distinct nha
		// VD: 1 1 2 3
		// distinct: 1 2 3
		// one-time: 2 3
		List<Integer> result = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
		System.out.println("====================");
		
		// good solution
		// câu trên a chỉ cần làm như này và điều kiện chỗ filter == 1 là xong
		List<Integer> uniqueElements = numbers.stream()
				   .collect(Collectors.groupingBy(number -> number, Collectors.counting()))
				   .entrySet()
				   .stream()
				   .filter(entry -> entry.getValue() > 1)
				   .map(entry -> entry.getKey()) 
				   .collect(Collectors.toList()); 
			
			System.out.println(uniqueElements);
		 
}
}
