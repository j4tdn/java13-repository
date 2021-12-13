package sorting.object;
/*
 * Sorting with String[] Array
 * DESC || ASC
 * >> using sort method of Java
 * >> handle null value
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import utils.ArrayUtils;
import static java.util.function.Function.*;
import static java.util.Comparator.*;
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
