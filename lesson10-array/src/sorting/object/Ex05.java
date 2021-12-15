package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.function.Function;

public class Ex05 {
	public static void main(String[] args) {
			String[] student = {
					"Jonh Smith",
					"Susan Dann",
					"Annchile, Scoth",
					"Alexander Pavot"
			};
//			Comparator<String> comparator =(s1, s2) -> s1.compareTo(s2);	
			Function<String , String> keyExtractor = new Function<String, String>() {
				public String apply(String string) {
					return string;
				}
			};
			Comparator<String> comparator = comparing(keyExtractor,reverseOrder());
			Arrays.sort(student,comparator);	
			System.out.println("Arrays sorting: " + Arrays.toString(student));
			
	}
}
