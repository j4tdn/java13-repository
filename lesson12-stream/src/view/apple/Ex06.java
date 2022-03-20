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

public class Ex06 {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		// Lambda: (data_type parameters) -> {body}
		// (data_type parameters)
		// REQUIRE: amount of parameters must same as amount in abstract method
		// IGNORE data type --> (parameters)
		// IGNORE () if only ONE parameter --> parameters
		// IGNORE {} and 'return' and ';' if body only has ONE line of code
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
