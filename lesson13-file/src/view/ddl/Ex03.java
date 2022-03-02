package view.ddl;

import java.io.File;
import java.util.Optional;

import utils.FileUtils;

public class Ex03 {
	
	private static final String path = "storage" + File.separator + "model.txt";
	private static final String another = "storage/../model.txt";
	
	public static void main(String[] args) throws Exception {
		// FILE INFORMATION ==> EXISTED FILE
		
		File anotherFile = FileUtils.createNewFile(another);
		if (Optional.ofNullable(anotherFile).isPresent()) {
			System.out.println("path: " + anotherFile.getPath());
			System.out.println("absolute path: " + anotherFile.getAbsolutePath());
			System.out.println("command path: " + anotherFile.getCanonicalPath());
		}
		
		File file = new File(path);
		if (file.exists()) {
			System.out.println("path: " + file.getPath());
			System.out.println("absolute path: " + file.getAbsolutePath());
			System.out.println("command path: " + file.getCanonicalPath());
		}
		
	}
}
