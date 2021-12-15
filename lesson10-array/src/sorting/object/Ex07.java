package sorting.object;

import java.util.Arrays;

import static java.util.function.Function.*;
import static java.util.Comparator.*;

import utils.ArrayUtils;

public class Ex07 {
	public static void main(String[] args) {
		String[] students = { "John Smith", null, "Susan Dann", "Rivalho", null, "Alexander Pato" };

		Arrays.sort(students, nullsLast(comparing(identity(), reverseOrder())));

		ArrayUtils.print("Array Sorting", students);
	}

}
