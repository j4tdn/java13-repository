package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.ApplePredicate;
import model.AppleData;
import utils.Printable;

public class Ex06 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();
		
		System.out.println("1st : find all green apples in his inventory");
		List<Apple> greenApples = findApples(inventory, apple -> "green".equals(apple.getColor()));
		Printable.print(greenApples);

		System.out.println("============================");
		System.out.println("2nd : find all red apples in his inventory");
		List<Apple> redApples = findApples(inventory, apple -> "red".equals(apple.getColor()));
		Printable.print(redApples);

		System.out.println("============================");
		System.out.println("3rd: find all apples heavier than 200 g");
		List<Apple> heavyApples = findApples(inventory, apple -> apple.getWeight() > 200);
		Printable.print(heavyApples);

		System.out.println("============================");
		System.out.println("4th: find all apples lighter than 200g");
		List<Apple> lightApples = findApples(inventory, apple -> apple.getWeight() < 200);
		Printable.print(lightApples);

		System.out.println("============================");
		System.out.println("5th: find all apples that are red and heavier than 400 g");
		List<Apple> applesMatchedColorAndWeight = findApples(inventory, apple -> "red".equals(apple.getColor()) && apple.getWeight() > 400);
		Printable.print(applesMatchedColorAndWeight);
	}

	private static List<Apple> findApples(List<Apple> inventory, ApplePredicate predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	// Explaination
	// Lambda: (data_type parameters) -> {body}
	// (data_type parameters)
	// REQUIRE: amount of parameters must same as amount in abstract method
	// IGNORE data type --> (parameters)
	// IGNORE () if only ONE parameter --> parameter
	// IGNORE {} and 'return' and ';' if body only has ONE line of code
}
