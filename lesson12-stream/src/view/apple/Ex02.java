package view.apple;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import bean.WeightType;
import model.DateModel;
import utils.Printable;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = DateModel.getApples();

		System.out.println("1st: find all green apples in inventory");
		List<Apple> greenApples = findApplesByColor(inventory, "green");
		Printable.printALL(greenApples);

		System.out.println("\n====================================\n");

		System.out.println("2st: find all red apples in inventory");
		List<Apple> redApples = findApplesByColor(inventory, "red");
		Printable.printALL(redApples);

		System.out.println("\n====================================\n");

		System.out.println("3st: find all apples > 150g in inventory");
		List<Apple> heavyApples = findApplesByWeight(inventory, 150, WeightType.HEAVY);
		Printable.printALL(heavyApples);

		System.out.println("\n====================================\n");

		System.out.println("4st: find all apples < 200g in inventory");
		List<Apple> lightApples = findApplesByWeight(inventory, 200, WeightType.LIGHT);
		Printable.printALL(lightApples);

		System.out.println("\n====================================\n");

		System.out.println("5st: find all green apples > 400g in inventory");
		List<Apple> apples = findApplesByColorAndWeight(inventory, "green", 400);
		Printable.printALL(apples);

	}

	private static List<Apple> findApplesByColorAndWeight(List<Apple> inventory, String color, double weight) {
		List<Apple> apples = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight && color.equals(apple.getColor())) {
				apples.add(apple);
			}
		}
		return apples;
	}

	private static List<Apple> findApplesByColor(List<Apple> inventory, String color) {
		List<Apple> apples = new ArrayList<>();
		for (Apple apple : inventory) {
			if (color.equals(apple.getColor())) {
				apples.add(apple);
			}
		}
		return apples;
	}

	private static List<Apple> findApplesByWeight(List<Apple> inventory, double weight, WeightType wt) {
		List<Apple> apples = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight && WeightType.HEAVY.equals(wt)) {
				apples.add(apple);
			} else if (apple.getWeight() < weight && WeightType.LIGHT.equals(wt)) {
				apples.add(apple);
			}
		}
		return apples;
	}

}
