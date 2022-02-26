package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import model.AppleData;
import utils.Printable;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();
		
		System.out.println("1st: find all green apples in his inventory");
		List<Apple> greenApples = findGreenApples(inventory);
		Printable.print(greenApples);
		
		System.out.println("===================================");
		
		System.out.println("2st: find all red apples in his inventory");
		List<Apple> redApples = findRedApples(inventory);
		Printable.print(redApples);
		
        System.out.println("===================================");
		
		System.out.println("3st: find all apples heavier than 150g");
		List<Apple> heavyApples = findHeavyApples(inventory);
		Printable.print(heavyApples);
		
        System.out.println("===================================");
		
		System.out.println("4st: find all apples lighter than 200g");
		List<Apple> lightApples = findLightApples(inventory);
		Printable.print(lightApples);
		
        System.out.println("===================================");
		
		System.out.println("5st: find all apples that are green and heavier than 400g");
		List<Apple> result = findApplesByColorAndWeight(inventory);
		Printable.print(result);
	}
	
	// 1st: find all green apples in his inventory
	private static List<Apple> findGreenApples(List<Apple> inventory){
		List<Apple> greenApples = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if("green".equals(apple.getColor())) {
				greenApples.add(apple);
			}
		}
		return greenApples;
	}
	// 2nd: find all red apples in his inventory
	private static List<Apple> findRedApples(List<Apple> inventory){
		List<Apple> redApples = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if("red".equals(apple.getColor())) {
				redApples.add(apple);
			}
		}
		return redApples;
	}
	// 3rd: find all apples heavier than 150g
	private static List<Apple> findHeavyApples(List<Apple> inventory){
		List<Apple> applesWeight = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if(apple.getWeight() > 150) {
				applesWeight.add(apple);
			}
		}
		return applesWeight;
	}
	
	// 4th: find all apples lighter than 200g
	private static List<Apple> findLightApples(List<Apple> inventory){
		List<Apple> applesWeight = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if(apple.getWeight() < 200) {
				applesWeight.add(apple);
			}
		}
		return applesWeight;
	}
	
	// 5th: find all apples that are green and heavier than 400g
	private static List<Apple> findApplesByColorAndWeight(List<Apple> inventory){
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if(apple.getWeight() > 400 && "green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
}
