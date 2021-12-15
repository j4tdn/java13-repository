package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;
import static java.util.function.Function.*;

public class Ex07 {
	public static void main(String[] args) {
			String[] student = {"Jonh Smith",null,"Susan Dann", "Annchile, Scoth", "Alexander Pavot"};
			Arrays.sort(student,nullsFirst(comparing(identity(),reverseOrder())));	
			System.out.println("Arrays sorting: " + Arrays.toString(student));
			
	}
}
