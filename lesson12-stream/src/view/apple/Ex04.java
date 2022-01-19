package view.apple;

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
import model.DataModel;
import utils.AppleUtils;

public class Ex04 {

	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		System.out.println("Find all green apples in his inventory: ");
		AppleUtils.print(findApples(inventory, new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return "green".equalsIgnoreCase(apple.getColor());
			}
		}));

		System.out.println("Find all red apples in his inventory: ");
		AppleUtils.print(findApples(inventory, new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return "red".equalsIgnoreCase(apple.getColor());
			}
		}));

		System.out.println("Find all apples heavier than 150g: ");
		AppleUtils.print(findApples(inventory, new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return apple.getWeight() > 150;
			}
		}));

		System.out.println("Find all apples lighter than 200g: ");
		AppleUtils.print(findApples(inventory,new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return apple.getWeight() < 200;
			}
		}));

		System.out.println("Find all apples that are green and heavier than 400g: ");
		AppleUtils.print(findApples(inventory, new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return "red".equalsIgnoreCase(apple.getColor()) && apple.getWeight() > 400;
			}
		}));
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
	 * Opt 3: Anonymous function
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

	// 1st: find all green apples in his inventory
	// 2st: find all red apples in his inventory
	// 3rd: find all apples heavier than 150g
	// 4th: Find all apples lighter than 200g
	// 5th: find all apples that are green and heavier than 400g

}
