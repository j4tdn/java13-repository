package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.FileTransfer;

public class FileUtils {

	private FileUtils() {
	}
	
	public static Object readObject(File file) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object object = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			object = ois.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close(ois, fis);
		}
		
		return object;
	}
	
	public static void writeObject(File file, Object object) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(object);
			FileUtils.close(oos, fos);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static <E extends FileTransfer> void writeLines(String path, List<E> elements) throws IOException{
		List<String> lines = elements.stream().map(FileTransfer::toLine).collect(Collectors.toList());
		Files.write(Paths.get(path), lines, StandardOpenOption.APPEND);
	}
	
	public static <E> List<E> readLines(String path, Function<String, E> function) throws Exception{
		return Files.readAllLines(Paths.get(path)).stream()
				 .map(function) // map(Transaction::transfer)
				 .filter(Objects::nonNull)
				 .collect(Collectors.toList());
	}

	public static boolean createNewFolder(String path) {
		return new File(path).mkdirs();
	}

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

	public static boolean writeLines(List<String> lines, String path) {

		File file = FileUtils.createNewFile(path);

		if (file != null) {

			// Write data
			FileWriter fw = null;
			BufferedWriter bw = null;

			try {
				// Open file
				fw = new FileWriter(file, true);
				bw = new BufferedWriter(fw);

				// Write date
				for (String line : lines) {
					bw.write(line);
					bw.newLine();
					System.out.println("--> Writing " + line);
				}

			} catch (IOException e) {
				e.printStackTrace();
				return false;

			} finally {
				close(bw, fw);
			}

		}

		return true;

	}

	public static List<String> readLines(String path) {
		File file = createNewFile(path);
		List<String> result = new ArrayList<>();

		if (file != null) {
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;

			try {
				fileReader = new FileReader(file);
				bufferedReader = new BufferedReader(fileReader);

				String line = "";
				while ((line = bufferedReader.readLine()) != null) {
					result.add(line);
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				FileUtils.close(bufferedReader, fileReader);
			}
		}

		return result;

	}

	public static void close(AutoCloseable... closeAbles) {
		for (AutoCloseable closeAble : closeAbles) {
			if (closeAble != null) {
				try {
					closeAble.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
