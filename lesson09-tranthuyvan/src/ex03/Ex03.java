package ex03;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex03 {
	
	public static void main(String[] args) {
		String input = "  Welcome    to JAVA10     class     ";
		
		String output = Arrays.asList(input.split(" "))
	                		  .stream()
	                          .map(s -> new StringBuilder(s).reverse())
	                          .collect(Collectors.joining(" "))
	                          .trim().replaceAll("[\\s]+", " ");

		System.out.println(output);
		
	}
		
	    

}
