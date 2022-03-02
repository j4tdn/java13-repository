package view.ddl;

import java.io.File;

import utils.FileUtils;

/**
 * DDL :: Data Definition Language => CREATE, DELETE, FILTER DML :: Data
 * Manipulation Language => WRITE, READ, UPDATE
 *
 */
public class Ex01 {
	// absolute path
	// private static final String path = "D:\\JAVA13\\2.JAVA\\java13-repository\\lesson13-file\\src\\model.txt";
	// relative path
	private static final String path = "storage" + File.separator + "model.txt";

	public static void main(String[] args) {
		FileUtils.createNewFile(path);
	}
}
