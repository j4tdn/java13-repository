package utils;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
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

		if (parent != null && !parent.exists()) {
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
				files.stream().forEach(file -> {
					try {
						Files.move(Paths.get(file.getPath()), Paths.get(to + File.separator + file.getName()));
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
			}

			if (Operation.Copy.equals(operation)) {
				files.stream().forEach(file -> {
					try {
						Files.copy(Paths.get(file.getPath()), Paths.get(to + File.separator + file.getName()),
								StandardCopyOption.REPLACE_EXISTING);
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

	public static void writeToFile(File file, List<String> strings) {
		try {
			Files.write(Paths.get(file.getPath()), strings);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<String> readFromFile(File file) {
		List<String> lines = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String str = "";
			while ((str = br.readLine()) != null) {
				lines.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(br, fr);
		}
		return lines;
	}

	private static void close(Closeable... closeables) {
		for (Closeable closeable : closeables) {
			try {
				closeable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
