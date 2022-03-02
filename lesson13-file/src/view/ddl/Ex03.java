package view.ddl;

import java.io.File;
import java.util.Optional;

import utils.FileUtils;

public class Ex03 {
	
	private static final String PATH = "storage" + File.separator + "model.txt";
	private static final String ANOTHER = "storage/../model.txt";
	
	public static void main(String[] args) throws Exception{
		// FILE INFORMATION ==> EXISTED FILE
		
		File anotherFile = FileUtils.createNewFile(ANOTHER);
		if (Optional.ofNullable(anotherFile).isPresent()) {
			System.out.println("path: " + anotherFile.getPath());
			System.out.println("absolute path: " + anotherFile.getAbsolutePath());
			System.out.println("canonical path: " + anotherFile.getCanonicalPath());
		}
		
		System.out.println("=========================================");
		
		File file = new File(PATH);
		
		if (file.exists()) {
			System.out.println("path: " + file.getPath());
			System.out.println("absolute path: " + file.getAbsolutePath());
			System.out.println("canonical path: " + file.getCanonicalPath());
		}
	}
}
