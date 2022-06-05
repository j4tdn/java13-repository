package main;

import java.time.LocalDate;

import controller.CategoryController;

public class App {
	private static CategoryController categoryController = new CategoryController();

	public static void main(String[] args) {
		// 1
		categoryController.getOrderByTime(LocalDate.of(2019, 11, 23)).forEach(System.out::println);
		System.out.println("=========================");
		// 2
		categoryController.getInventory().forEach(System.out::println);
		System.out.println("=========================");
		// 3
		categoryController.getTopItemByYear("2020").forEach(System.out::println);
		System.out.println("=========================");
		// 4
		categoryController.getItemDtos().forEach(System.out::println);
	}
}
