package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Apple;
import model.DataModel;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> list = DataModel.getApples();
		Stream<Apple> stream = list.stream();
		
		// traversable only once
		// ==> should not store data in stream after operating
		stream.forEach(System.out::print);
		
		System.out.println("\n====================");
		// fail
		// stream.forEach(System.out::print);
		
	}
}
