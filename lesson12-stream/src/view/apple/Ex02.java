package view.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Utils.Printable;
import bean.Apple;
import bean.WeightType;
import model.DataModel;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();

		System.out.println("1st : find all green apples in his inventory");
		List<Apple> greenApples = findAppleByColor(inventory, "green");
		Printable.print(greenApples);

		System.out.println("============================");
		System.out.println("2nd : find all red apples in his inventory");
		List<Apple> redApples = findAppleByColor(inventory, "red");
		Printable.print(redApples);

		System.out.println("============================");
		System.out.println("3rd: find all apples heavier than 150 g");
		//List<Apple> heavyApples = findHeavyApples(inventory);
		//Printable.print(heavyApples);

		System.out.println("============================");
		System.out.println("4th: find all apples lighter than 200g");
		//List<Apple> lightApples = findLightApples(inventory);
		//Printable.print(lightApples);

		System.out.println("============================");
		System.out.println("5th: find all apples that are green and heavier than 400 g");
		List<Apple> applesMatchedColorAndWeight = findApplesByColorAndWeight(inventory);
		Printable.print(applesMatchedColorAndWeight);
	}

	// 1st : find all green apples in his inventory
	// 2nd: find all red apples in his inventory
	private static List<Apple> findAppleByColor(List<Apple> inventory, String color) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if (color.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}

//	// 2nd: find all red apples in his inventory
//	private static List<Apple> findRedApples(List<Apple> inventory) {
//		List<Apple> result = new ArrayList<>();
//		for(Apple apple: inventory) {
//			if ("red".equals(apple.getColor())) {
//				result.add(apple);
//			}
//		}
//		return result;
//	}

	// 3rd: find all apples heavier than 150 g
	// 4th: find all apples lighter than 200g
	private static List<Apple> findHeavyApples(List<Apple> inventory, WeightType weightType, Double requireWeight) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if (apple.getWeight() > 150) {
				result.add(apple);
			}
		}
		return result;
	}

//	// 4th: find all apples lighter than 200g
//	private static List<Apple> findLightApples(List<Apple> inventory) {
//		List<Apple> result = new ArrayList<>();
//		for(Apple apple: inventory) {
//			if (apple.getWeight() < 200) {
//				result.add(apple);
//			}
//		}
//		return result;
//	}

	// 5th: find all apples that are green and heavier than 400 g
	private static List<Apple> findApplesByColorAndWeight(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if ("green".equals(apple.getColor()) && apple.getWeight() > 400) {
				result.add(apple);
			}
		}
		return result;
	}

}
