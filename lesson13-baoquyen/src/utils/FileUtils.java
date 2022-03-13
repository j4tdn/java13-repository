package utils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUtils {
	private FileUtils() {
	}
	
	public static boolean createNewFoldel(String path) {
		return new File(path).mkdirs();
	}
	
	public static File createNewFile(String path) {
		File file = new File(path);
		if(file.exists()) {
			return file;
		}
		File parent = file.getParentFile();
		if(!parent.exists()) {
			parent.mkdirs();
		}
		
		boolean isCreated = false;
		try {
			isCreated = file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return isCreated ? file : null;
	}
	
	public static void createFiles(String rootPath, String extension) {
		String path = rootPath + File.separator+ System.currentTimeMillis() + extension;
		try {
			Thread.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		FileUtils.createNewFile(path);
	}
	
	public static File[] getFile(String path, String extension) {
		File dir = new File(path);
		String[] extensions = extension.split("[,\\s]+"); 
		if (dir.exists()) {
			File[] files = dir.listFiles(new FileFilter() {
				@Override
				public boolean accept(File file) {
					String fileName = file.getName();
					String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
					for (String ex : extensions) {
						if (ex.equals(extension)) {
							return true;
						}
					}
					return false;
				}
			});
			return files;
		}
		return null;
	}
	
	public static void moveFiles(File[] files, String targetPath) {
		for (File file : files) {
			try {
				Files.move(Paths.get(file.getAbsolutePath()),Paths.get(targetPath + File.separator + file.getName()) , StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void copyFiles(File[] files, String targetPath) {
		for (File file : files) {
			try {
				Files.copy(Paths.get(file.getAbsolutePath()),Paths.get(targetPath + File.separator + file.getName()), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
