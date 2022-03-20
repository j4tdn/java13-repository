package ex01;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,2,4,6,4,8,3,5,7,5,7,9,11);
	    List<Integer> uniqueNbrs = numbers.stream()
	                        .filter(nbr -> Collections.frequency(numbers, nbr)==1  )
	                  // Stream<Integer>
	                  .collect(Collectors.toList());

	    printf(uniqueNbrs);
	    System.out.println("---------Cau 2:-----------");
	    
	    List<Integer> Nbrs = numbers.stream()
	            .filter(nbr -> Collections.frequency(numbers,nbr) == 2 )
	            .distinct()
	            // Stream<Integer>
	            .collect(Collectors.toList());
	    printf(Nbrs);

	}
	public static <E>  void printf(Collection<E> elements){
        for (E element : elements) {
            System.out.println(element);
        }
    }
	
    
}
