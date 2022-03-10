package view.dml;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02 {
	private static final String path = "storage" + File.separator + "data" + File.separator + "model.txt";

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("Line5 --> Item 03, Store 03", "Line6 --> Item 03, Store 03");

		FileUtils.writeLines(lines, path);
	}
}
