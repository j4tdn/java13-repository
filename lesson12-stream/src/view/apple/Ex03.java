package view.apple;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.ApplePredicate;
import model.DateModel;
import utils.Printable;

public class Ex03 {
	public static void main(String[] args) {
		List<Apple> inventory = DateModel.getApples();

		System.out.println("1st: find all green apples in inventory");
		List<Apple> greenApples = filter(inventory, apple -> "green".equals(apple.getColor()));
		Printable.printALL(greenApples);

		System.out.println("\n====================================\n");

		System.out.println("2st: find all red apples in inventory");
		List<Apple> redApples = filter(inventory, apple -> "red".equals(apple.getColor()));
		Printable.printALL(redApples);

		System.out.println("\n====================================\n");

		System.out.println("3st: find all apples > 150g in inventory");
		List<Apple> heavyApples = filter(inventory, apple -> apple.getWeight() > 150);
		Printable.printALL(heavyApples);

		System.out.println("\n====================================\n");

		System.out.println("4st: find all apples < 200g in inventory");
		List<Apple> lightApples = filter(inventory, apple -> apple.getWeight() < 200);
		Printable.printALL(lightApples);

		System.out.println("\n====================================\n");

		System.out.println("5st: find all green apples > 400g in inventory");
		List<Apple> apples = filter(inventory, apple -> apple.getWeight() > 400 && "red".equals(apple.getColor()));
		Printable.printALL(apples);

	}

	/*
	 * @predicate is a function called by Interface
	 */
	private static List<Apple> filter(List<Apple> inventory, ApplePredicate predicate) {
		List<Apple> apples = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				apples.add(apple);
			}
		}
		return apples;
	}

}
