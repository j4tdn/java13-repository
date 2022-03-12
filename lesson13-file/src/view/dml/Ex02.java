package view.dml;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02 {
	private static final String path = "storage" + File.separator + "data";
	public static void main(String[] args) {
		List<String> lines = Arrays.asList(
				"--> Line 3 : Item 01, Store 02",
				"--> Line 4 : Item 02, Store 02"
				);
		FileUtils.writeLines(lines,path);
	}
}
