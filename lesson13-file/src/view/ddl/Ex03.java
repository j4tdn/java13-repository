package view.ddl;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import utils.FileUtils;

public class Ex03 {
	
	private static final String path = "storage"+ File.separator +"model.txt";
	private static final String another = "storage/../model.txt";
	
	public static void main(String[] args) throws IOException {
		File file = new File(path);
		File anotherFile = FileUtils.createNewFile(another);
		if(Optional.ofNullable(anotherFile).isPresent()) {
			System.out.println("path: " + anotherFile.getPath());
			System.out.println("Absolute path: " + anotherFile.getAbsolutePath());
			System.out.println("Canonical path: " + anotherFile.getCanonicalPath());
		}
		if(file.exists()) {
			System.out.println("path: " + file.getPath());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Canonical path: " + file.getCanonicalPath());
			
		}
	}
}
