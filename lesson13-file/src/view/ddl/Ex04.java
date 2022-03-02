package view.ddl;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Ex04 {
	private static final String PATH = "storage" + File.separator + "downloads";
	
	public static void main(String[] args) {
		File dir = new File(PATH);
		if (dir.exists()) {
			// delete non-txt files from this folder
			// filter --> non-txt
			// delete
			File[] files = dir.listFiles(new FileFilter() {
				@Override
				public boolean accept(File file) {
					String fileName = file.getName();
					String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
					return !"txt".equals(extension);
				}
			});
			
			Arrays.stream(files)
				  .forEach(file -> file.delete());
		}
		System.out.println("=========== Finished ===========");
	}
}
