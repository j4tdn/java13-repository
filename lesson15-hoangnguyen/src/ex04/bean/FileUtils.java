package ex04.bean;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileUtils {
	
	private FileUtils() {}
	
	public static File createNewFile(String path) {

		// CREATE FILE(s)
		File file = new File(path);

		if (file.exists()) {
			return file;
		}

		File parent = file.getParentFile();

		if (!parent.exists()) {
			parent.mkdirs();
		}

		boolean isFileCreated = false;

		try {
			isFileCreated = file.createNewFile();
			System.out.println("isCreated: " + isFileCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return isFileCreated ? file : null;

	}
	
	public static <E> List<E> readLines(String path, Function<String, E> function) throws IOException {
		return Files.readAllLines(Paths.get(path)).stream()
												  .map(function)
												  .filter(Objects::nonNull)
												  .collect(Collectors.toList());
	}

}
