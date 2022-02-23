package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Apple;
import model.DataModel;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> data = DataModel.getApples();
		Stream<Apple> stream = data.stream();
		
		stream.forEach(System.out::println);
		
		System.out.println("=============================");
		
		stream.forEach(System.out::println);
		
		
		//List<Apple> greenApples = data.stream().filter(apple -> apple.getColor().equals("green")).toList();
		//greenApples.forEach(System.out::println);
	}
}
