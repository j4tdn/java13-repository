package view.ddl;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Ex04 {
	
	private static final String path = "storage" + File.separator + "dowload";
	
	public static void main(String[] args) {
		File dir = new File(path);
		if(dir.exists()) {
			//delete all non-txt files from this folder
			//filter --> non-txt
			//delete
			File[] files = dir.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File file) {
					String filename = file.getName();
					String extendsion = filename.substring(filename.lastIndexOf(".")+1);
					return !extendsion.equals("txt");
				}
			});
			
			Arrays.stream(files)
				.forEach(file -> file.delete());
			System.out.println("========================");
		}
	}
}
