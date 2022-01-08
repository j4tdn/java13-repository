package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import model.AppleData;
import utils.Printable;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();

		System.out.println("1st: find all green apples in inventory");
		List<Apple> greenApples = findGreenApples(inventory);
		Printable.printALL(greenApples);

		System.out.println("\n====================================\n");

		System.out.println("2st: find all red apples in inventory");
		List<Apple> redApples = findRedApples(inventory);
		Printable.printALL(redApples);

		System.out.println("\n====================================\n");

		System.out.println("3st: find all apples > 150g in inventory");
		List<Apple> heavyApples = findHeavyApples(inventory, 150);
		Printable.printALL(heavyApples);

		System.out.println("\n====================================\n");

		System.out.println("4st: find all apples < 200g in inventory");
		List<Apple> lightApples = findLightApples(inventory, 150);
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

	private static List<Apple> findGreenApples(List<Apple> inventory) {
		List<Apple> greenApples = new ArrayList<>();
		for (Apple apple : inventory) {
			if ("green".equals(apple.getColor())) {
				greenApples.add(apple);
			}
		}
		return greenApples;
	}

	private static List<Apple> findRedApples(List<Apple> inventory) {
		List<Apple> redApples = new ArrayList<>();
		for (Apple apple : inventory) {
			if ("red".equals(apple.getColor())) {
				redApples.add(apple);
			}
		}
		return redApples;
	}

	private static List<Apple> findHeavyApples(List<Apple> inventory, double weight) {
		List<Apple> apples = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight) {
				apples.add(apple);
			}
		}
		return apples;
	}

	private static List<Apple> findLightApples(List<Apple> inventory, double weight) {
		List<Apple> apples = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() < weight) {
				apples.add(apple);
			}
		}
		return apples;
	}
}
