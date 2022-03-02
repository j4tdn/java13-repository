package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	
	private FileUtils() {
		
	}
	public static boolean createNewFolder (String path) {
		// CREATE FOLDER || DIRECTORY
		return new File(path).mkdirs();	
	}
	public static File createNewFile (String path) {
		// CREATE FILE(s)
		boolean isFileCreated = false;
		File file = new File(path);
				
		File parent = file.getParentFile();
				
		if (!parent.exists()) {
			parent.mkdirs();
		}
				
		if(!file.exists()) {
			try {
				isFileCreated = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return isFileCreated ? file : null;
	}
	
}
