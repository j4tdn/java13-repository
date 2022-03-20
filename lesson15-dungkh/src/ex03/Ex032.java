package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex032 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Welcomeec");
				Map<Character, Long> charFrequency = words.stream() //Stream<String>
		        .flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

				 List<Integer> output = new ArrayList<Integer>();
				for (Map.Entry<Character, Long> entry : charFrequency.entrySet()) {
			         System.out.println(entry.getKey() + " " + entry.getValue());
			         
				
			        	
				}  
	         

	}
	public static <E>  void printf(Collection<E> elements){
        for (E element : elements) {
            System.out.println(element);
        }
    }
	
}
