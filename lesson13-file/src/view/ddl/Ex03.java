package view.ddl;

import java.io.File;
import java.util.Optional;

import utils.FileUtils;

public class Ex03 {

	private static final String path = "storage\\model.txt";
	private static final String anotherPath = "storage/../model.txt";

	public static void main(String[] args) throws Exception {

		// FILE INFORMATIONV ==> EXISTED FILE

		File anotherFile = FileUtils.createNewFile(anotherPath);

		if (Optional.ofNullable(anotherFile).isPresent()) {
			System.out.println("Path: " + anotherFile.getPath());
			System.out.println("Absolute path: " + anotherFile.getAbsolutePath());
			System.out.println("Canonical path: " + anotherFile.getCanonicalPath());

		}

		System.out.println("===================================================================");

		File file = new File(path);
		if (file.exists()) {

			System.out.println("Path: " + file.getPath());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Canonical path: " + file.getCanonicalPath());

		}

	}
}
