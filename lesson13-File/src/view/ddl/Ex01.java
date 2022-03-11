package view.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex01 {
	
	private static final String path = "storage" + File.separator+ "model.txt";
	
	public static void main(String[] args) {
		// create files
		FileUtils.createNewFile(path);
	}
}
