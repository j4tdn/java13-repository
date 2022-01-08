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
		
		System.out.println("1st: find all green apples in his inventory");
		List<Apple> greenApples = findApplesByColor(inventory, "green");
		Printable.printf(greenApples);
		
		System.out.println("==================================");
		System.out.println("2st: find all red apples in his inventory");
		List<Apple> redApples = findApplesByColor(inventory, "red");
		Printable.printf(redApples);
		
		System.out.println("==================================");
		System.out.println("3st: find all apples heavier than 150g");
		List<Apple> heavyApples = findApplesByWeight(inventory, WeightType.HEAVY, 150);
		Printable.printf(heavyApples);
		
		System.out.println("==================================");
		System.out.println("4st: find all apples lighter than 200g");
		List<Apple> lighterApples = findApplesByWeight(inventory, WeightType.LIGHTER, 200);
		Printable.printf(lighterApples);
		
		System.out.println("==================================");
		System.out.println("5st: find all apples that are green and heavier than 400g");
		List<Apple> ApplesMatchedColorAndWeight = findApplesByColorAndWeight(inventory, "green", 400);
		Printable.printf(ApplesMatchedColorAndWeight);
		
	}
	// find all apples by color in his inventory
	private static List<Apple> findApplesByColor(List<Apple> inventory, String requiredColor){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(requiredColor.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	// find all apples by weight
	private static List<Apple> findApplesByWeight(List<Apple> inventory,WeightType weightType ,double requiredWeight){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(WeightType.HEAVY.equals(weightType) && apple.getWeight() > requiredWeight) {
				result.add(apple);
			}
			if(WeightType.LIGHTER.equals(weightType) &&apple.getWeight() < requiredWeight) {
				result.add(apple);
			}
		}
		return result;
	}
	
	// find all apples that are green and heavier than 400g
	private static List<Apple> findApplesByColorAndWeight(List<Apple> inventory, String requiredColor, double requiredWeight){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(requiredColor.equals(apple.getColor()) && apple.getWeight() > requiredWeight) {
				result.add(apple);
			}
		}
		return result;
	}
}
