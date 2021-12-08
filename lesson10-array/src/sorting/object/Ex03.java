package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

/**
 * 
 * Sorting with String[] Array
 * DESC || ASC
 *
 * >> Using Java sorting method
 */
public class Ex03 {
	
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susan Dann",
				null,
				"Lionel Messi",
				"Cristiano Ronaldo"
		};
		
		// Anonymous class
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// o1: previous element
				// o2: next element
				// previous > next ==> positive(swap) ==> ASC
				// previous < next ==> positive(swap) ==> DESC
				return s1.compareTo(s2);
				
			}
		};
		
		// Compile Time >> Need pass instance of Comparator interface
		// Loop elements ... a[i] = previous elements
		//   Loop elements ... a[j] = next elements
		//     if(comparator.compare(a[i], a[j]) > 0 >> swap(a[i], a[j])
		Arrays.sort(students, comparator);
		System.out.println(Arrays.toString(students));
	}

	
}
