package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.ApplePredicate;
import model.AppleData;
import utils.Printable;

public class Ex05 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();
		
		// Opt3: Anonymous function = Lambda expression
		// >>> Lambda expression syntax (parameters) -> {body}
		// >>> Lambda expression: create an instance(object) of Function Interface
		// >>> (parameters) -> {body} >> code to override abstract method in Function Interface

		System.out.println("1st : find all green apples in his inventory");
		List<Apple> greenApples = findApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor());
		});
		Printable.print(greenApples);

		System.out.println("============================");
		System.out.println("2nd : find all red apples in his inventory");
		List<Apple> redApples = findApples(inventory, (Apple apple) -> {
			return "red".equals(apple.getColor());
		});
		Printable.print(redApples);

		System.out.println("============================");
		System.out.println("3rd: find all apples heavier than 300 g");
		List<Apple> heavyApples = findApples(inventory, (Apple apple) -> {
			return apple.getWeight() > 300;
		});
		Printable.print(heavyApples);

		System.out.println("============================");
		System.out.println("4th: find all apples lighter than 200g");
		List<Apple> lightApples = findApples(inventory, (Apple apple) -> {
			return apple.getWeight() < 200;
		});
		Printable.print(lightApples);

		System.out.println("============================");
		System.out.println("5th: find all apples that are red and heavier than 400 g");
		List<Apple> applesMatchedColorAndWeight = findApples(inventory, (Apple apple) -> {
			return "red".equals(apple.getColor()) && apple.getWeight() > 400;
		});
		Printable.print(applesMatchedColorAndWeight);
	}

	/**
	 * predicate could be "green apples", "red apples", "heavy, weight apples"
	 * 3 ways to pass applePredicate 
	 * >>> Pass content(require) of test method in ApplePredicate 
	 * Opt1: Implementation class 
	 * >>> ApplePredicate predicate = new GreenApplePredicate() 
	 * Opt2: Anonymous class 
	 * >> ApplePredicate predicate = new ApplePredicate() {
	        @Override 
	        public boolean test(Apple apple) { 
	  		    return "green".equals(apple.getColor()); 
	        } 
	     } 
	  * Opt3: Anonymous function = Lambda expression
	  * >>> Lambda expression syntax (parameters) -> {body}
	  * >>> Lambda expression: create an instance(object) of Function Interface
	  * >>> (parameters) -> {body} >> code to override abstract method in Function Interface
	  * ApplePredicate predicate = (Apple apple) -> {
			return "green".equals(apple.getColor());
		}
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