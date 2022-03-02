package view.ddl;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Ex04 {
	private static final String path = "storage" + File.separator + "downloads";
	
	public static void main(String[] args) {
		File dir = new File(path);
		if (dir.exists()) {
			// delete non-txt files from this folder
			// filter --> non-txt
			// delete
			File[] files = dir.listFiles(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					File file = new File(dir, name);
					String filename = file.getName();
					String extension = filename.substring(filename.lastIndexOf(".") + 1);
					return !"txt".equals(extension);
				}
			});
			
			Arrays.stream(files)
			      .forEach(file -> file.delete());
		}
		System.out.println("========== Finished ==========");
	}
}
