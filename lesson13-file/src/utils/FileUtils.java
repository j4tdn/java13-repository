package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {

	private FileUtils() {
	}

	public static boolean createNewFolder(String path) {
		return new File(path).mkdirs();
	}

	public static File createNewFile(String path) {
		boolean isFileCreated = false;

		// CREATE FILE(s)
		File file = new File(path);

		File parent = file.getParentFile();

		if (!parent.exists()) {
			parent.mkdirs();
		}

		if (!file.exists()) {
			try {
				isFileCreated = file.createNewFile();
				System.out.println("isCreated: " + isFileCreated);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return isFileCreated ? file : null;
	}
}
