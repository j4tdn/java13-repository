package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Apple;
import bean.WeightType;
import model.AppleData;
import utils.AppleUtils;

public class Ex02 {
	
	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();
		System.out.println("Find all green apples in his inventory: ");
		AppleUtils.print(findApplesByColor(inventory, "green"));
		
		System.out.println("Find all red apples in his inventory: ");
		AppleUtils.print(findApplesByColor(inventory, "red"));
		
		System.out.println("Find all apples heavier than 150g: ");
		AppleUtils.print(findHeavyByWeight(inventory, 150, WeightType.HEAVY));
		
		System.out.println("Find all apples lighter than 200g: ");
		AppleUtils.print(findHeavyByWeight(inventory, 200, WeightType.LIGHT));
		
		System.out.println("Find all apples that are green and heavier than 400g: ");
		AppleUtils.print(findApplesByColorAndWeight(inventory, "green", 400));
	}
	
	// 1st: find all green apples in his inventory
	// 2st: find all red apples in his inventory
	private static List<Apple> findApplesByColor(List<Apple> list, String color) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : list) {
			if(color.equalsIgnoreCase(apple.getColor())) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	
	// 3rd: find all apples heavier than 150g
	// 4th: Find all apples lighter than 200g
	private static List<Apple> findHeavyByWeight(List<Apple> list, double weight, WeightType weightType) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : list) {
			if(WeightType.HEAVY.equals(weightType) && apple.getWeight() > weight) {
				result.add(apple);
			} else if(WeightType.LIGHT.equals(weightType) && apple.getWeight() < weight) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	
	
	// 5th: find all apples that are green and heavier than 400g
	private static List<Apple> findApplesByColorAndWeight(List<Apple> list, String color, double weight) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : list) {
			if(color.equalsIgnoreCase(apple.getColor()) && apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		
		return result;
	}
}
