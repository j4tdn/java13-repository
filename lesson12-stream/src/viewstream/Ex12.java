package viewstream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ex12 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,5,7,4);
		Integer sum = numbers.stream()
				.filter(Objects::nonNull)
				.reduce(0, new BinaryOperator<Integer>() {
				@Override
				public Integer apply(Integer t, Integer u) {
					// TODO Auto-generated method stub
					return t+u;
				}
				});
		System.out.println("sum: "+sum);
		
		//Integer::sum = (a+b) ->a+b
		Optional otp = numbers.stream()
				.filter(Objects::nonNull)
			   .reduce(Integer::sum);
		otp.ifPresent(value -> System.out.println("sum2: "+value));
		
		Integer max = numbers.stream()
			   .reduce(Integer.MIN_VALUE,(initialMax,element)-> {
				   return element<initialMax ?element:initialMax;
			   });
		System.out.println("max: "+ max);
	}
}
