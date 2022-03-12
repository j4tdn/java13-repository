package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

public class FileUtils {
	private FileUtils() {

	}

	public static boolean createFolder(String path) {
		return new File(path).mkdirs();
	}

	public static File createFile(String path) {
		boolean isCreated = false;
		File file = new File(path);
		if (file.exists()) {
			return file;
		}

		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}

		try {
			isCreated = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return isCreated ? file : null;
	}

	public static void fileOption(List<File> files, Operation operation, String to) {
		if (to != null) {
			if (Operation.Move.equals(operation)) {
				files.stream().forEach(file ->
				// file.renameTo(new File(to + File.separator + file.getName())));
				{
					try {
						Files.move(Paths.get(file.getPath()), Paths.get(to + File.separator + file.getName()));
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
			}

			if (Operation.Copy.equals(operation)) {
				files.stream().forEach(file ->
				// file.renameTo(new File(to + File.separator + file.getName())));
				{
					try {
						Files.copy(Paths.get(file.getPath()), Paths.get(to + File.separator + file.getName()),  StandardCopyOption.REPLACE_EXISTING);
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
			}
		}
		if (Operation.Delete.equals(operation)) {
			files.stream().forEach(file -> file.delete());
		}
	}

	public static String getFileExtension(File file) {
		return file.getName().substring(file.getName().lastIndexOf(".") + 1);
	}

	public static List<File> getAllFiles(String path) {
		return Arrays.asList(new File(path).listFiles());
	}

	public static List<File> getAllFilesByExtension(String path, Extension extension) {
		return Arrays.asList(new File(path).listFiles(file -> extension.toString().equals(getFileExtension(file))));
	}
}
