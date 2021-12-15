package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

import java.util.function.Function;

import Utils.ArrayUtils;

public class Ex05 {
	public static void main(String[] args) {
		String [] students = {
				"John Smith",
				"Susan Dann",
				"Rivalho",
				"Alexander Pato"
	
		};
		//Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
		//Replace comparator above
		Function<String, String> keyExtractor = new Function<String, String>() {
			
			@Override
			public String apply(String string) {
				return string;
			}
		};
		Comparator<String> comparator = comparing(keyExtractor,reverseOrder());
		
		Arrays.sort(students, comparator);
		ArrayUtils.show("Array Sorting", students);
	}
	
}
