package view.dml;

import java.io.File;

import bean.Apple;
import utils.FileUtils;

public class Ex06 {
	
	private static final String pathName = "storage"
			+ File.separator
			+ "data"
			+ File.separator
			+ "inventory.txt";
	
	public static void main(String[] args) {
		try {
			FileUtils.readLines(pathName, Apple::new).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
