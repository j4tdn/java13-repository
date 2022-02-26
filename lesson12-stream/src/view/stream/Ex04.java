package view.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 1, 2, 3, 4);

		//get unique elements from list of numbers >>> 6, 4

		//op1: manually execute
		Map<Integer, Integer> statiNbers = statistic(numbers);
		System.out.println(statiNbers);

		System.out.println("==================");

		//op2: using groupBy method in Stream
		System.out.println("unique element....");
		List<Integer>  uniqueNbers = numbers.stream()
				.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey())
				.collect(Collectors.toList());
		uniqueNbers.forEach(System.out::println);

		List<Dish> dishs = DataModel.getDishes();

		List<Double> calories = dishs.stream()
				.map(Dish::getCalories)
				.collect(Collectors.toList());

		System.out.println("==================");

		Map<Double, Integer> uniqueCalories = statisticDish(calories);
		System.out.println(uniqueCalories);

		System.out.println("==================");

		List<Double>  cal = dishs.stream()
				.collect(Collectors.groupingBy(d -> d.getCalories(), Collectors.counting())) //Map<Dish,Integer>
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey())
				.collect(Collectors.toList());


		cal.forEach(System.out::println);

		//		List<Dish> listDishs = DataModel.getDishes();
		//		listDishs.stream()
		//				 .
	}

	//Entry >> K element, V number of appearance
	private static Map<Integer, Integer> statistic(List<Integer> numbers){
		Map<Integer, Integer> counter = new HashMap<>();
		for(Integer number: numbers) {
			if(! counter.containsKey(number)) {
				counter.put(number, 1);
			}else {
				counter.put(number, counter.get(number) + 1);
			}
		}
		return counter;
	}

	//Select unique dish's calories from menu
	private static Map<Double, Integer> statisticDish(List<Double> numbers){
		Map<Double, Integer> counter = new HashMap<>();
		for(Double number: numbers) {
			if(! counter.containsKey(number)) {
				counter.put(number, 1);
			}else {
				counter.put(number, counter.get(number) + 1);
			}
		}
		return counter;
	}




}
