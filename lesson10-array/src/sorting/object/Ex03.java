package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArraysUtils;

public class Ex03 {
	public static void main(String[] args) {
		String[] student = {
				"Jonh Smith",
				"Susan Dann",
				"Annchile, Scoth",
				"Alexander Pavot"
		};
		
//	sort(student);
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				//s1 previous element
				//s2: next element
				// pre > next ==> positive swap ==> ASC
				// pre < next ==> positive swap ==> DESC
				
				return (-1)*s1.compareTo(s2);
			}
		};
		
		
		Arrays.sort(student,comparator);	
		System.out.println("Arrays sorting: " + Arrays.toString(student));
		
	}
	
}
