package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Functional Interface available in JAVA
 * + Function
 */
public class JavaFunctionDemo {
	public static void main(String[] args) {
		// TO get length of each element in list of string
		List<String> elements = Arrays.asList("aaa", "bb", "cccc", "ddd");
		
	}
	private List<Integer> toLength(List<String> elements){
		List<Integer> result = new ArrayList<>();
		for(String element : elements) {
			result.add(element.length());
		}
		return result;
	}
	private List<Character> toAvatarText(List<String> elements){
		List<Character> result = new ArrayList<>();
		for(String element : elements) {
			result.add(element.charAt(0));
		}
		return result;
	}
}
