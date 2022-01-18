package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.Printable;

/**
 * Java Available Functional Interface 
 * +) Function
 *
 */
public class JavaConverterDemo {
	public static void main(String[] args) {
		//to get length of each element in List of String
		List<String> demo = Arrays.asList("hello", "trancongviet", "helloworld", "viet");
		System.out.println("LENGTH");
		List<Integer> lengths = filter(demo, str->str.length());
		Printable.printALL(lengths);
		System.out.println("CHARACTER AT 0");
		List<Character> starts = filter(demo, str->str.charAt(0));
		Printable.printALL(starts);
	}
	private static <R> List<R> filter(List<String> elements, Converter<R> converter){
		List<R> result = new ArrayList<>();
		for(String element: elements) {
			result.add(converter.execute(element));
		}
		return result;
	}
}
 