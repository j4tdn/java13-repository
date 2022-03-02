package view.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex01 {
	
	// RELATIVE VALUE ==> model.txt ==> lesson13
	// ABSOLUTE VALUE
	
	// storage 
	// precondition : exist system path of root folder
	
	private static final String PATH = "storage" + File.separator + "model.txt";
	
	public static void main(String[] args) {
		FileUtils.createNewFile(PATH);
	}
}
