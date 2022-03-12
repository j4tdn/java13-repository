package view.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex01 {
	
	// RELATIVE VALUE ==> model.txt ==> lesson13-file/model.txt
	// ABSOLUTE VALUE ==> D:\\home\\model.txt
	
	// storage
	// precondition: exist system path of root folder
	private static final String path = "storage" + File.separator + "model.txt";
	
	public static void main(String[] args) {
		FileUtils.createNewFile(path);
	}
}