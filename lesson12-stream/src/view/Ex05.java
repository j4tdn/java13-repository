package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import bean.WeightType;
import functional.ApplePredicate;
import functional.GreenApplePredicate;
import functional.HevyWeightApplePredicate;
import functional.LightWeightApplePredicate2;
import functional.RedApplePredicate;
import functional.WeightAndColorApplePredicate;
import model.AppleData;
import utils.AppleUtils;

public class Ex05 {

	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();
		
		// Lambda: (data_type parameters) -> {body}
		// (data_type parameters)
		// REQUIRE: amount of parameters must same as amount if abstract method (Functional Interface)
		// IGNORE data type --> (parameters)
		// IGNORE () if only ONE parameter
		// IGNORE {} AND 'return' and ';' if body only has ONE line of code
		System.out.println("Find all green apples in his inventory: ");
		AppleUtils.print(findApples(inventory, apple -> "green".equals(apple.getColor())));

		System.out.println("Find all red apples in his inventory: ");
		AppleUtils.print(findApples(inventory, apple -> "red".equals(apple.getColor())));

		System.out.println("Find all apples heavier than 150g: ");
		AppleUtils.print(findApples(inventory, apple -> apple.getWeight() > 150));

		System.out.println("Find all apples lighter than 200g: ");
		AppleUtils.print(findApples(inventory, apple -> apple.getWeight() < 200));

		System.out.println("Find all apples that are green and heavier than 400g: ");
		AppleUtils.print(findApples(inventory, apple -> "red".equals(apple.getColor()) && apple.getWeight() > 400));
	}

	/**
	 * predicate could be "green apples", "red apples", "heavy, light apples" 3 ways
	 * to pass ApplePredicate >> Pass content(condition) of test method in
	 * ApplePredicate 
	 * Opt 1: Implementation class >> ApplePredicate predicate = new GreenApplePredicate() 
	 * Opt 2: Anonymous class
	 *  new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return "green".equalsIgnoreCase(apple.getColor());
			}
		}));
	 * Opt 3: Anonymous function = Lambda expression
	 * >> Lambda expression syntax: (parameters) -> {body}
	 * >> Lambda expression: create an instance(object) of Functional Interface
	 * >> (parameters) -> {body} >> code to override abstract method in Functional Interface
	 * ApplePredicate predicate = (Apple apple) -> {
	 * 		return "green".equals(apple.getColor());
	 * }
	 */
	private static List<Apple> findApples(List<Apple> inventory, ApplePredicate predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}

		return result;
	}


}
