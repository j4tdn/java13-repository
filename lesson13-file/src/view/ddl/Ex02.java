package view.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex02 {
	
	private static final String path = "storage";
	
	public static void main(String[] args) {
		// CREATE FOLDER || DIRECTORY
		FileUtils.createNewFile(path);
	}
}
