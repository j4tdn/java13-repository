package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

import static java.util.function.Function.*;

import Utils.ArrayUtils;

public class Ex06 {
	public static void main(String[] args) {
		String [] students = {
				"John Smith",
				"Susan Dann",
				"Rivalho",
				"Alexander Pato"
	
		};
		//Function<String, String> keyExtractor = s -> s;
		//Function<String, String> keyExtractor = Function.identity();
	
		//Comparator<String> comparator = comparing(identity(),reverseOrder());
		
		Arrays.sort(students, comparing(identity(),reverseOrder()));
		ArrayUtils.show("Array Sorting", students);
	}
	
}
