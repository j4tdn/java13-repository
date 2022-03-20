package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Apple;
import model.DataModel;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> data = DataModel.getApples();
		Stream <Apple> stream = data.stream();
		
		// traversable only once
		// ==> should not store data in stream after operating
		stream.forEach(System.out::println);
		
		System.out.println("==================");
		
		// failed
		// stream.forEach(System.out::println);
	}
}
