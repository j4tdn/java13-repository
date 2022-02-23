package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class JavaPredicateDemo {
	public static void main(String[] args) {
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() > 8;
			}
		};
		
		boolean isValid = predicate.test("hello");
		System.out.println("isvalid: " + isValid);
		
		//C3:
		List<String> result = filter(Arrays.asList("aa","bbbbb", "Dcxddsvdffv"), text -> text.length() > 3);
		for(String element:result) {
			System.out.println(element);
		}
	}
	
	private static List<String> filter(List<String> elements, Predicate<String> predicate){
		List<String> result = new ArrayList<String>();
		for(String element: elements) {
			if(predicate.test(element)) {
				result.add(element);
			}
		}
		return result;
	}
}
