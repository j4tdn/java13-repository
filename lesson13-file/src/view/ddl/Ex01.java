package view.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex01 {
	
	// Relative value ==> model.txt ==> lesson13-file
	// absolute value ==> E:/data/model.txt
	private static final String path = "storage"+ File.separator +"model.txt";
	
	public static void main(String[] args) {
		FileUtils.createNewFile(path);
	}
}
