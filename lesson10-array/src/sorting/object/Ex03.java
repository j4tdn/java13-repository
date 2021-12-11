package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex03 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susan Dann",
				"Rivalho",
				"Alexander Pato"
		};
		
		//anonymous
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		};
		// Compile Time >> Need pass instance of Comparator interface
		// Loop elements
		//    Loop elements
		//       if(comparator.compare(a[i],a[j]>0)){
		//     		swap(a[i],a[j]);
		//       }
		Arrays.sort(students, comparator);
		// Required: sorting DESC without using reverse method >> Ex03
		ArrayUtils.print("Array Sorting", students);
	}
	
}
