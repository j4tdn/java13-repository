package view.dml;

import java.io.File;
import java.util.List;

import bean.Apple;
import utils.FileUtils;

public class Ex06 {
	private static final String pathname = "storage" + File.separator + "data" + File.separator + "inventory.txt";
	public static void main(String[] args) throws Exception {
		List<Apple> apples = FileUtils.readLines(pathname, Apple::new);
		apples.forEach(System.out::println);
	}
}
