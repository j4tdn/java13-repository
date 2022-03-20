package view.apple;

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
import model.DataModel;
import utils.Printable;

public class Ex03 {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		System.out.println("1st: find all green apples in his inventory");
		List<Apple> greenApples = findApples(inventory, new GreenApplePredicate());
		Printable.printf(greenApples);
		
		System.out.println("==================================");
		System.out.println("2st: find all red apples in his inventory");
		List<Apple> redApples = findApples(inventory, new RedApplePredicate());
		Printable.printf(redApples);
		
		System.out.println("==================================");
		System.out.println("3st: find all apples heavier than 150g");
		List<Apple> heavyApples = findApples(inventory, new HeavyWeightApplePredicate());
		Printable.printf(heavyApples);
		
		System.out.println("==================================");
		System.out.println("4st: find all apples lighter than 200g");
		List<Apple> lighterApples = findApples(inventory, new LightWeightApplePredicate());
		Printable.printf(lighterApples);
		
		System.out.println("==================================");
		System.out.println("5st: find all apples that are green and heavier than 400g");
		List<Apple> ApplesMatchedColorAndWeight = findApples(inventory, new WeightAndColorApplePredicate());
		Printable.printf(ApplesMatchedColorAndWeight);
		
	}
	
	/**
	 * predicate could be "green apples", "red apples", "heavy, light apples"
	 * 3 ways to pass ApplePredicate
	 * >> Pass content(require) of test method in ApplePredicate
	 * + Implementation class
	 * + Anonymous class
	 * + Anonymous function
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
