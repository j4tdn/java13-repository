package sorting.object;
import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static java.util.function.Function.identity;

/*
 * Sorting with String[] Array
 * DESC || ASC
 * >> using sort method of Java
 * >> handle null value
 */
import java.util.Arrays;

import utils.ArrayUtils;
public class Ex06 {
	public static void main(String[] args) {
		String[] students = {
				
				"John Smith",
				"Adam Dan",
				
				"Lionel Messi",
				"Cristiano Ronaldo",
		};
	
		//Function<String, String> keyExtractor = string -> string;
		//Function<String , String> keyExtractor = Function.identity();
 		
		//Comparator<String> anotherComparator = Comparator.comparing(keyExtractor, Comparator.reverseOrder());
		
		
		//Required: Sorting DESC 
		Arrays.sort(students, comparing(identity(), reverseOrder()));
		ArrayUtils.print("Student Sorting: ", students);
		
		
	}
	
	
}
