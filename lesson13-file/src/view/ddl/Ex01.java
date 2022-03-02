package view.ddl;

import utils.FileUtils;

public class Ex01 {
	
	// RELATIVE VALUE ==> model.txt ==> lesson13-file/model.txt
	// ABSOLUTE VALUE ==> E:/data/model.txt
	
	// storage
	// pre-condition: exist system path of root folder
	private static final String path = "storage\\model.txt";
	
	public static void main(String[] args) {
		FileUtils.createNewFile(path);
	}
}
