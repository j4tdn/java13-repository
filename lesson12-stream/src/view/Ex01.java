package view;


import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import model.AppleModel;
import utils.Printable;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleModel.getAll();
		System.out.println("1st: find all green apples in his inventory");
		List<Apple> greenApple = new ArrayList<Apple>();
		greenApple = findGreenApple(inventory);
		Printable.print(greenApple);
		
		System.out.println("\n=======================\n");
		System.out.println("2nd: find all red apples in his inventory");
		List<Apple> redApple = new ArrayList<Apple>();
		redApple = findRedApple(inventory);
		Printable.print(redApple);
		
		System.out.println("\n=======================\n");
		System.out.println("3rd: find all heavy apples in his inventory");
		List<Apple> heavyApple = new ArrayList<Apple>();
		heavyApple = findHeavyApple(inventory);
		Printable.print(heavyApple);
		
		System.out.println("\n=======================\n");
		System.out.println("4th: find all ligth apples in his inventory");
		List<Apple> lightApple = new ArrayList<Apple>();
		lightApple = findLightApple(inventory);
		Printable.print(lightApple);
		
		System.out.println("\n=======================\n");
		System.out.println("5th: find all conditional apples in his inventory");
		List<Apple> Apple = new ArrayList<Apple>();
		Apple = findApple(inventory);
		Printable.print(Apple);
	}
	
	
	private static List<Apple> findGreenApple(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if ("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	
	private static List<Apple> findRedApple(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if ("red".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	
	private static List<Apple> findHeavyApple(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if (apple.getWeight() > 400) {
				result.add(apple);
			}
		}
		return result;
	}
	
	private static List<Apple> findLightApple(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if (apple.getWeight() < 200) {
				result.add(apple);
			}
		}
		return result;
	}
	
	private static List<Apple> findApple(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if ("green".equals(apple.getColor()) && apple.getWeight() > 400) {
				result.add(apple);
			}
		}
		return result;
	}
}
