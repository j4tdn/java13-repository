package package01;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01App {
	public static void main(String[] args) {
		int[] numbers = {1,1,2,2,2,3,4,5};
		// Liet ke cac phan tu chi xuat hien mot lan duy nhat trong day N
		Map<Integer, Long> numbersStatic = 
			  Arrays.stream(numbers) // InStream
			  .boxed()
			  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		// Liet ke cac phan tu chi xuat hien mot lan duy nhat trong day N
		System.out.println("Print out unique numbers...");
		numbersStatic.forEach((number, count) -> {
			if(count == 1) System.out.println(number + " ");
		}
		);
		System.out.println("\n==========================================\n");
		System.out.println("Print out unique numbers...");
		numbersStatic.forEach((number, count) -> {
			if(count > 1) System.out.println(number + " ");
		}
		);
		// Liet ke cac phan tu xuat hien nhieu hon mot lan trong day N
	}
}
