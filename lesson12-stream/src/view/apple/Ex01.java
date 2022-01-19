package view.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Apple;
import model.DataModel;
import utils.AppleUtils;

public class Ex01 {
	
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		System.out.println("Find all green apples in his inventory: ");
		AppleUtils.print(findGreenApple(inventory));
		
		System.out.println("Find all red apples in his inventory: ");
		AppleUtils.print(findRedApple(inventory));
		
		System.out.println("Find all apples heavier than 150g: ");
		AppleUtils.print(findHeavyApples(inventory));
		
		System.out.println("Find all apples lighter than 150g: ");
		AppleUtils.print(findLightApples(inventory));
		
		System.out.println("Find all apples that are green and heavier than 400g: ");
		AppleUtils.print(findApplesByColorAndWeight(inventory));
	}
	
	// 1st: find all green apples in his inventory
	private static List<Apple> findGreenApple(List<Apple> list) {
		List<Apple> greenApples = new ArrayList<>();
		for(Apple apple : list) {
			if("green".equalsIgnoreCase(apple.getColor())) {
				greenApples.add(apple);
			}
		}
		
		return greenApples;
	}
	
	// 2st: find all red apples in his inventory
	private static List<Apple> findRedApple(List<Apple> list) {
		List<Apple> redApples = new ArrayList<>();
		for(Apple apple : list) {
			if("red".equalsIgnoreCase(apple.getColor())) {
				redApples.add(apple);
			}
		}
		
		return redApples;
	}
	
	// 3rd: find all apples heavier than 150g
	private static List<Apple> findHeavyApples(List<Apple> list) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : list) {
			if(apple.getWeight() > 150) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	// 4th: Find all apples lighter than 200g
	private static List<Apple> findLightApples(List<Apple> list) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : list) {
			if(apple.getWeight() < 200) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	// 5th: find all apples that are green and heavier than 400g
	private static List<Apple> findApplesByColorAndWeight(List<Apple> list) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : list) {
			if("green".equalsIgnoreCase(apple.getColor()) && apple.getWeight() > 400) {
				result.add(apple);
			}
		}
		
		return result;
	}
}
