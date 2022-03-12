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
		} catch (Exception e) {
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(oos, fos);
		}
	}

	public static <E extends FileTransfer> void writeLines(String path, List<E> elements) {
		List<String> lines = elements.stream().map(FileTransfer::toLine).collect(Collectors.toList());
		try {
			Files.write(Paths.get(path), lines, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static <E> List<E> readLines(String path, Function<String, E> function) {
		return readLines(path).stream()
				// .map(Transaction::transfer) //method reference
				// .map(Transaction::new) //constructor reference
				.map(function).filter(Objects::nonNull).collect(Collectors.toList());
	}

	public static List<String> readLines(String path) {
		List<String> lines = new ArrayList<>();
		File file = createNewFile(path);

		if (file != null) {
			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String line = "";
				while ((line = br.readLine()) != null) {
					lines.add(line);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				FileUtils.close(br, fr);
			}
		}
		return lines;

	}

	public static boolean writeLines(List<String> lines, String path) {
		File file = FileUtils.createNewFile(path);
		boolean isOk = false;
		if (file != null) {
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter(file, true);
				bw = new BufferedWriter(fw);

				for (String line : lines) {
					bw.write(line);
					bw.newLine();
					System.out.println("Writing ... " + line);
				}
				isOk = true;
			} catch (IOException e) {
				e.printStackTrace();

			} finally {
				close(bw, fw);
			}

		}
		return isOk;
	}

	public static boolean createNewFolder(String path) {
		return new File(path).mkdirs();
	}

	public static File createNewFile(String path) {
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
			System.out.println("isCreated: " + isCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isCreated ? file : null;
	}

	public static void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable autoCloseable : autoCloseables) {
			try {
				autoCloseable.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
