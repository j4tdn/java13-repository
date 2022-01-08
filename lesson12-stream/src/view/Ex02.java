package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import bean.WeightType;
import model.AppleData;
import utils.Printable;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();
		
		System.out.println("1st : find all green apples in his inventory");
		List<Apple> greenApples = findApplesByColor(inventory, "green");
		Printable.print(greenApples);
		
		System.out.println("============================");
		System.out.println("2nd : find all red apples in his inventory");
		List<Apple> redApples = findApplesByColor(inventory, "red");
		Printable.print(redApples);
		
		System.out.println("============================");
		System.out.println("3rd: find all apples heavier than 150 g");
		List<Apple> heavyApples = findApplesByWeight(inventory, WeightType.HEAVY, 150);
		Printable.print(heavyApples);
		
		System.out.println("============================");
		System.out.println("4th: find all apples lighter than 200g");
		List<Apple> lightApples = findApplesByWeight(inventory, WeightType.LIGHT, 200);
		Printable.print(lightApples);
		
		System.out.println("============================");
		System.out.println("5th: find all apples that are green and heavier than 400 g");
		List<Apple> applesMatchedColorAndWeight = findApplesByColorAndWeight(inventory, "green", 400);
		Printable.print(applesMatchedColorAndWeight);
	}
	
	// 1st : find all green apples in his inventory
	// 2nd: find all red apples in his inventory
	private static List<Apple> findApplesByColor(List<Apple> inventory, String requiredColor) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if (requiredColor.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	
	// 3rd: find all apples heavier than 150 g
	// 4th: find all apples lighter than 200g
	private static List<Apple> findApplesByWeight(List<Apple> inventory, WeightType weightType, double requiredWeight) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if (WeightType.HEAVY.equals(weightType) && apple.getWeight() > requiredWeight) {
				result.add(apple);
			} else if (WeightType.LIGHT.equals(weightType) && apple.getWeight() < requiredWeight) {
				result.add(apple);
			}
		}
		return result;
	}
	
	
	// 5th: find all apples that are green and heavier than 400 g
	private static List<Apple> findApplesByColorAndWeight(List<Apple> inventory, String requiredColor, double requiredWeight) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if (requiredColor.equals(apple.getColor()) && apple.getWeight() > requiredWeight) {
				result.add(apple);
			}
		}
		return result;
	}
}