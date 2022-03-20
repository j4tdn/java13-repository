package view.apple;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import model.DataModel;
import utils.Printable;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		System.out.println("1st: find all green apples in his inventory");
		List<Apple> greenApples = findGreenApples(inventory);
		Printable.printf(greenApples);
		
		System.out.println("==================================");
		System.out.println("2st: find all red apples in his inventory");
		List<Apple> redApples = findRedApples(inventory);
		Printable.printf(redApples);
		
		System.out.println("==================================");
		System.out.println("3st: find all apples heavier than 150g");
		List<Apple> heavyApples = findHeavyApples(inventory);
		Printable.printf(heavyApples);
		
		System.out.println("==================================");
		System.out.println("4st: find all apples lighter than 200g");
		List<Apple> lighterApples = findLightApples(inventory);
		Printable.printf(lighterApples);
		
		System.out.println("==================================");
		System.out.println("5st: find all apples that are green and heavier than 400g");
		List<Apple> ApplesMatchedColorAndWeight = findApplesByColorAndWeight(inventory);
		Printable.printf(ApplesMatchedColorAndWeight);
		
	}
	// 1st: find all green apples in his inventory
	private static List<Apple> findGreenApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	// 2st: find all red apples in his inventory
	private static List<Apple> findRedApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if("red".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	// 3st: find all apples heavier than 150g
	private static List<Apple> findHeavyApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(apple.getWeight()>150) {
				result.add(apple);
			}
		}
		return result;
	}
	// 4st: find all apples lighter than 200g
	private static List<Apple> findLightApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(apple.getWeight()<200) {
				result.add(apple);
			}
		}
		return result;
	}
	// 5st: find all apples that are green and heavier than 400g
	private static List<Apple> findApplesByColorAndWeight(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if("green".equals(apple.getColor()) && apple.getWeight() > 400) {
				result.add(apple);
			}
		}
		return result;
	}
}
