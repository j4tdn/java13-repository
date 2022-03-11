package utils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Random;

public class FileUtils {
	private FileUtils() {
		
	}
	
	public static File createNewFile(String path) {
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
	
	public static File[] getFiles(String path, String extension) {
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
	
	public static boolean moveFile(String sourcePath, String targetPath) {
	    boolean fileMoved = true;
	    try {
	        Files.move(Paths.get(sourcePath), Paths.get(targetPath), StandardCopyOption.REPLACE_EXISTING);
	    } catch (Exception e) {
	        fileMoved = false;
	        e.printStackTrace();
	    }
	    return fileMoved;
	}
	
	public static boolean moveFiles(File[] files, String targetPath) {
		for (File file : files) {
			if (!moveFile(file.getAbsolutePath(), targetPath + File.separator + file.getName())) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean copyFile(String sourcePath, String targetPath) {
		boolean fileMoved = true;
	    try {
	        Files.copy(Paths.get(sourcePath), Paths.get(targetPath), StandardCopyOption.REPLACE_EXISTING);
	    } catch (Exception e) {
	        fileMoved = false;
	        e.printStackTrace();
	    }
	    return fileMoved;
	}
	
	public static boolean copyFiles(File[] files, String targetPath) {
		for (File file : files) {
			if (!copyFile(file.getAbsolutePath(), targetPath + File.separator + file.getName())) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * @param 
	 * rootPath : path of the directory which containing the file 
	 * extensions : extension of file
	 * number : number file is created
	 */
	public static void createFiles(String rootPath, String[] extensions, int number) {
		for (int i = 0; i < number; i++) {
			String path = getPath(rootPath, extensions);
			sleep(1);
			FileUtils.createNewFile(path);
		}
	}
	
	public static void showFile(File[] files) {
		Arrays.stream(files)
			  .forEach(System.out::println);
	}
	
	private static String getPath(String rootPath, String[] extensions) {
		Random rand = new Random();
		return rootPath + File.separator 
				+ System.currentTimeMillis() + extensions[rand.nextInt(extensions.length)];
	}
	
	private static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
