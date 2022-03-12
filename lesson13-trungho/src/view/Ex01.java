package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

import utils.FileUtils;

public class Ex01 {

	private static final String parentPath = "garbage";

	private static final String[] childPath = { "image", "music", "system", "coding" };

	private static final String[] fileExtensions = { ".png", ".jpg", ".jpeg", ".mp3", ".mp4", ".bat", ".java", ".txt" };

	public static void main(String[] args) {
		File file = new File(parentPath);

		// Delete folder "garbage" if it already existed
		if (file.exists()) {
			try {
				boolean x = deleteDirectory(file);
				if (x) {
					System.out.println("Folder " + file.getName() + " successfully deleted.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// Create 4 sub-folders under "garbage" folder
		for (int i = 0; i < childPath.length; i++) {
			boolean folderCreatedStatus = FileUtils
					.createNewFolder(parentPath.concat(File.separator).concat(childPath[i]));
			if (folderCreatedStatus) {
				System.out.println(
						"Folder " + parentPath.concat(File.separator).concat(childPath[i]) + " successfully created!");
			}
		}

		// Create 20 files under "garbage" folder with random extension
		for (int i = 0; i < 20; i++) {
			String filePath = parentPath + File.separator + System.currentTimeMillis() + i
					+ fileExtensions[new Random().nextInt(fileExtensions.length - 0) + 0];
			FileUtils.createNewFile(filePath);
			System.out.println("File " + filePath + " successfully created!");
		}

		// Action with files
		File[] listFiles = listAllFilesToArrayOfFile(file);
		actionWithFile(listFiles);
	}

	private static void actionWithFile(File[] listFiles) {
		for (int i = 0; i < listFiles.length; i++) {
			switch (listFiles[i].getName().substring(listFiles[i].getName().lastIndexOf(".") + 1)) {
			case "txt":
				listFiles[i].delete();
				System.out.println("File " + listFiles[i].getName() + " successfully deleted.");
				break;
			case "java":
				copyFiles(listFiles[i], childPath[3]);
				break;
			case "bat":
				moveFiles(listFiles[i], childPath[2]);
				break;
			case "mp3", "mp4":
				moveFiles(listFiles[i], childPath[1]);
				break;
			case "png", "jpg", "jpeg":
				moveFiles(listFiles[i], childPath[0]);
				break;
			default:
				break;
			}
		}
	}

	private static File[] listAllFilesToArrayOfFile(File dir) {
		return dir.listFiles();
	}

	private static void copyFiles(File file, String destPath) {
		try {
			File source = file;
			File dest = new File(parentPath + File.separator + destPath + File.separator + file.getName());
			Files.copy(source.toPath(), dest.toPath());
			System.out.println("File " + file.getName() + " successfully copied to folder " + destPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void moveFiles(File file, String destPath) {
		try {
			File source = file;
			File dest = new File(parentPath + File.separator + destPath + File.separator + file.getName());
			Files.move(source.toPath(), dest.toPath());
			System.out.println("File " + file.getName() + " successfully moved to folder " + destPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean deleteDirectory(File directoryToBeDeleted) {
		File[] allContents = directoryToBeDeleted.listFiles();
		if (allContents != null) {
			for (File file : allContents) {
				deleteDirectory(file);
			}
		}
		return directoryToBeDeleted.delete();
	}
}
