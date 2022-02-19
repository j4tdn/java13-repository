package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Apple;
import model.DataModel;

public class Ex01 {
	
	public static void main(String[] args) {
		List<Apple> list = DataModel.getApples();
		Stream<Apple> stream = list.stream();
		
		// Traversable only once
		// May not store data in stream after operating
		stream.forEach(System.out::println);
		
		System.out.println("===================");
		
		// FAIL
		// stream.forEach(System.out::println);
	}
}
