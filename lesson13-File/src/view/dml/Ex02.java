package view.dml;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02 {
	
	private static final String path = "storage" + File.separator + "data" + File.separator + "model.txt";
	
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("line 6 -> item 03, store 03",
											"line 7 -> item 04, store 04",
											"line 8 -> item 05, store 05");
		
		FileUtils.writeLines(lines, path);
	}
}
