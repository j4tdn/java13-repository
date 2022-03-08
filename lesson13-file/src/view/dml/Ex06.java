package view.dml;

import java.io.File;
import java.util.List;

import bean.Apple;
import utils.FileUtils;

public class Ex06 {
	private static final String path = "storage" + File.separator + "data" + File.separator + "inventory.txt";

	public static void main(String[] args) {
		List<Apple> apples = FileUtils.readLines(path, Apple::new);
		apples.forEach(System.out::println);
	}
}
