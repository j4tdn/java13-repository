package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import Utils.ArrayUtils;

/**
 * Sorting with String [] Array
 * DESC || ASC
 * Using Java sorting method
 *
 */
public class Ex03 {
	public static void main(String[] args) {
		String [] students = {
				"John Smith",
				"Susan Dann",
				"Rivalho",
				"Alexander Pato"
		};
		//Required : Each element implement
		// anonymus class
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//s1 : previous element
				//s2: next element
				//pre > next ==> positive (swap) ==> ASC
				//pre < next ==> positive (swap) ==> DESC
				return  s1.compareTo(s2);
			}
		};
		
		//Compile Time >> Need pass instance of comparator interface
		//Loop elements
		//	Loop elements
		//		if(comparator.compare(a[i], a[j])>0){;
		//			swap(a[i], a[j]);
		//   	}
		Arrays.sort(students, comparator);
		ArrayUtils.show("Array Sorting", students);
	}
	
}
