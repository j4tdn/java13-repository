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

public class Ex05 {
	public static void main(String[] args) {
		String[] students = {
				
				"John Smith",
				"Adam Dan",
				
				"Lionel Messi",
				"Cristiano Ronaldo",
		};
		Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
		
		//Replace comparator
		Function<String, String> keyExtractor = new Function<String, String>() {
			//input: element in array
			//output: element's value type want to compare
			@Override
			public String apply(String string) {
				return string;
			}
		};
		Comparator<String> anotherComparator = Comparator.comparing(keyExtractor, Comparator.reverseOrder());
		
		
		//Required: Sorting DESC 
		Arrays.sort(students, anotherComparator);
		ArrayUtils.print("Student Sorting: ", students);
		
		
	}
	
	
}
