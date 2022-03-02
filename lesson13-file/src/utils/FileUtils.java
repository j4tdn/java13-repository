package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	
	private FileUtils() {
		
	}
	
	public static File createNewFile(String path) {
		
		// Crate file
		boolean isFileCreated = false;
			File file = new File(path);
			File parent = file.getParentFile();
			if(!parent.exists()){
				parent.mkdirs();
			}
				
			if(!file.exists()) {
				try {
					isFileCreated = file.createNewFile();
					System.out.println("iscCreated: " + isFileCreated);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		return isFileCreated ? file : null;	
	}
	
	public static boolean createNewFoldel(String path) {
		return new File(path).mkdirs();
	}
}
