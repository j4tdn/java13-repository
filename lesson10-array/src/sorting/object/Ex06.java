package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;
import static java.util.function.Function.*;

public class Ex06 {
	public static void main(String[] args) {
			String[] student = {
					"Jonh Smith",
					"Susan Dann",
					"Annchile, Scoth",
					"Alexander Pavot"
			};
//			Function<String , String> keyExtractor = string -> string;
//			Function<String , String> keyExtractor = Function.identity();
			
			Comparator<String> comparator = comparing(identity(),reverseOrder());
			Arrays.sort(student,comparator);	
			System.out.println("Arrays sorting: " + Arrays.toString(student));
			
	}
}
