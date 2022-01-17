package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Utils.Printable;
import bean.Apple;
import bean.WeightType;
import funtional.ApplePredicate;
import model.AppleData;

public class Ex03 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();

		System.out.println("1st : find all green apples in his inventory");
		List<Apple> greenApples = findApples(inventory, apple -> "green".equals(apple.getColor()));
		Printable.print(greenApples);

		System.out.println("============================");
		System.out.println("2nd : find all red apples in his inventory");
		List<Apple> redApples = findApples(inventory, apple -> "green".equals(apple.getColor()));
		Printable.print(redApples);

		System.out.println("============================");
		System.out.println("3rd: find all apples heavier than 150 g");
		List<Apple> heavyApples = findApples(inventory, apple -> apple.getWeight() > 150);
		Printable.print(heavyApples);

		System.out.println("============================");
		System.out.println("4th: find all apples lighter than 200g");
		List<Apple> lightApples = findApples(inventory,  apple -> apple.getWeight() < 200);
		Printable.print(lightApples);

		System.out.println("============================");
		System.out.println("5th: find all apples that are green and heavier than 400 g");
		List<Apple> applesMatchedColorAndWeight = findApples(inventory, apple -> "red".equals(apple.getColor()) && apple.getWeight() > 400);
		Printable.print(applesMatchedColorAndWeight);
	}
	
	private static List<Apple> findApples(List<Apple> inventory, ApplePredicate predicate){
		
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
		
	}

	

}
