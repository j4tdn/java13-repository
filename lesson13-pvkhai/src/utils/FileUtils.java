package utils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class FileUtils {
	private FileUtils() {
		
	}
	
	public static File creatNewFile(String path) {
		File file = new File(path);
		if (file.exists()) {
			return file;
		}
		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}
		boolean isFileCreated = false;
		if (!file.exists()) {
			try {
				isFileCreated = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return isFileCreated ? file : null;
	}
	
	public static void createFiles(String path, String[] extensions, int number) {
		Random rd = new Random();
		for(int i = 1; i <= number; i++) {
			String pathname = path + File.separator + System.currentTimeMillis() + extensions[rd.nextInt(extensions.length)];
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FileUtils.creatNewFile(pathname);
		}
	}
	
	public static File[] getFiles(String path, String extension) {
		File dir = new File(path);
		if(dir.exists()) {
			File[] files = dir.listFiles(new FileFilter() {
				@Override
				public boolean accept(File file) {
					String pathname = file.getName();
					String e = pathname.substring(pathname.lastIndexOf(".") + 1);
					if(extension.equals(e)) {
						return true;
					}
					return false;
				}
			});
			return files;
		}
		return null;
	}
	
	
}
