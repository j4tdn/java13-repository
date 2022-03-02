package view.ddl;

import utils.FileUtils;

/*
 * mkdir() :: create one folder
 * mkdirs() :: create one folder chain
 */
public class Ex02 {
	private static final String path = "storage";

	public static void main(String[] args) {
		FileUtils.createNewFolder(path);
	}
}
