package sorting.object;

import java.util.Arrays;
import static java.util.Comparator.*;
import static java.util.function.Function.*;
/**
 * 
 * Sorting with String[] Array DESC || ASC
 *
 * >> Using Java sorting method
 */
public class Ex06 {

	public static void main(String[] args) {
		String[] students = {null, "John Smith", "Susan Dann", null, "Lionel Messi", "Cristiano Ronaldo" };
		

		Arrays.sort(students, nullsFirst(comparing(identity(), reverseOrder())));
		System.out.println(Arrays.toString(students));
	}

}
