package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

import static java.util.function.Function.*;

import Utils.ArrayUtils;

public class Ex07 {
	public static void main(String[] args) {
		String [] students = {null,
				"John Smith",
				"Susan Dann",
				null,
				"Rivalho",
				"Alexander Pato"
	
		};
		Arrays.sort(students, nullsLast(comparing(identity(),reverseOrder())));
		ArrayUtils.show("Array Sorting", students);
	}
	
}
