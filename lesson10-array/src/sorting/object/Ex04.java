package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
	public static void main(String[] args) {
			String[] student = {
					"Jonh Smith",
					"Susan Dann", null,
					"Annchile, Scoth",
					"Alexander Pavot"
			};
			Comparator<String> comparator = new Comparator<String>() {	
					@Override
					public int compare(String s1, String s2) {
						// TODO Auto-generated method stub
						//s1 previous element
						//s2: next element
						// pre > next ==> positive swap ==> ASC
						// pre < next ==> positive swap ==> DESC
						if ( s1 == null) {
							return -1;
						}
						else if( s2 == null) {
							return 1;
						}
						return s2.compareTo(s1);
					}
			};			
			Arrays.sort(student,comparator);	
			System.out.println("Arrays sorting: " + Arrays.toString(student));
				
	}
}
