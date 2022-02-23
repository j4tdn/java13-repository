package view.apple;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.ApplePredicate;
import functional.GreenApplePredicate;
import functional.LightPredicate;
import functional.RedApplePredicate;
import functional.WeightAndColorPredicate;
import functional.WeightPredicate;
import model.AppleModel;
import utils.Printable;

public class Ex04 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleModel.getAll();
		System.out.println("1st: find all green apples in his inventory");
		List<Apple> greenApple = new ArrayList<Apple>();
		greenApple = findApple(inventory, new GreenApplePredicate());
		Printable.print(greenApple);
		
		System.out.println("\n========================\n");
		System.out.println("1st: find all red apples in his inventory");
		List<Apple> redApple = new ArrayList<Apple>();
		greenApple = findApple(inventory, new RedApplePredicate());
		Printable.print(redApple);
		
		System.out.println("==================================");
		System.out.println("3st: find all apples heavier than 400g");
		List<Apple> heavyApples = findApple(inventory, new WeightPredicate());
		Printable.print(heavyApples);
		
		System.out.println("==================================");
		System.out.println("4st: find all apples lighter than 150g");
		List<Apple> lighterApples = findApple(inventory, new LightPredicate());
		Printable.print(lighterApples);
		
		System.out.println("==================================");
		System.out.println("5st: find all apples that are green and heavier than 150");
		List<Apple> ApplesMatchedColorAndWeight = findApple(inventory, new WeightAndColorPredicate());
		Printable.print(ApplesMatchedColorAndWeight);
	}
	
	private static List<Apple> findApple(List<Apple> inventory, ApplePredicate predicate){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
