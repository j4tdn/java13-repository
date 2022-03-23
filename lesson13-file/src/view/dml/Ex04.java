package view.dml;

import java.io.File;
import java.util.List;

import utils.FileUtils;

public class Ex04 {
	
	private static final String path = "storage" + File.separator + "data" + File.separator + "model.txt";
	
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines(path);
		lines.forEach(System.out::println);
	}
}
