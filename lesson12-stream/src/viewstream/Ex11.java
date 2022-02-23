package viewstream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.sun.jdi.Value;

public class Ex11 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,6,3,5,7,9,2,4,12);
		
		boolean existDivisibkeBy10 = numbers.stream()
 										   .anyMatch(number -> number % 10 == 0);
		System.out.println(existDivisibkeBy10);
		
		Optional<Integer> opt = numbers.stream()
			  .filter(number -> number % 4 ==0)
			  .findFirst();
		//System.out.println(opt.get());
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		opt.ifPresent(value ->System.out.println(value));
		System.out.println(opt.orElse(Integer.MAX_VALUE));
		
		Optional<Integer> optDiv5 = numbers.stream()
				  .filter(number -> number % 4 ==0)
				  .findAny();
		System.out.println(optDiv5.orElse(999));
		
		boolean nhohon100 = numbers.stream()
				   .allMatch(number -> number < 100 );
		System.out.println(nhohon100);

		boolean lonhon100 = numbers.stream()
				   .anyMatch(number -> number < 100 );
		System.out.println(lonhon100);
		
	}
}
