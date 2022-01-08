package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import bean.WeightType;
import functional.ApplePredicate;
import functional.GreenApplePredicate;
import functional.HeavyWeightApplePredicate;
import functional.LightWeightApplePredicate;
import functional.RedApplePredicate;
import functional.WeightAndColorApplePredicate;
import model.AppleData;
import utils.Printable;

public class Ex05 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();
		
		System.out.println("1st: find all green apples in his inventory");
		List<Apple> greenApples = findApples(inventory, apple -> "green".equals(apple.getColor()));
		Printable.printf(greenApples);
		
		System.out.println("==================================");
		System.out.println("2st: find all red apples in his inventory");
		List<Apple> redApples = findApples(inventory, apple -> "red".equals(apple.getColor()));
		Printable.printf(redApples);
		
		System.out.println("==================================");
		System.out.println("3st: find all apples heavier than 150g");
		List<Apple> heavyApples = findApples(inventory, apple -> apple.getWeight()>300);
		Printable.printf(heavyApples);
		
		System.out.println("==================================");
		System.out.println("4st: find all apples lighter than 200g");
		List<Apple> lighterApples = findApples(inventory, apple -> apple.getWeight()<200);
		Printable.printf(lighterApples);
		
		System.out.println("==================================");
		System.out.println("5st: find all apples that are green and heavier than 400g");
		List<Apple> ApplesMatchedColorAndWeight = findApples(inventory, apple -> "green".equals(apple.getColor()) && apple.getWeight() > 400);
		Printable.printf(ApplesMatchedColorAndWeight);
		
	}
	
	/**
	 * predicate could be "green apples", "red apples", "heavy, light apples"
	 * 3 ways to pass ApplePredicate
	 * >> Pass content(require) of test method in ApplePredicate
	 * + Opt1: Implementation class
	 * >> ApplePredicate predicate = new GreenApplePredicate();
	 * + Opt2: Anonymous class
	 * >> ApplePredicate predicate = new ApplePredicate();
	 * 		@Override
			public boolean test(Apple apple) {
				// TODO Auto-generated method stub
				return false;
			}
	 * + Opt3: Anonymous function = Lambda expression
	 * >> Lambda expression syntax (parameters) -> {body}
	 * >> Lambda expression: create an instance of Functional Interface
	 * >> (parameters) -> {body} >> code to override abstract method in Function Interface
	 * ApplePredicate predicate = (Apple apple) -> {
	 * 		return "green".equals(apple.getColor());
	 * }
	 */
	private static List<Apple> findApples (List<Apple> inventory, ApplePredicate predicate){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
