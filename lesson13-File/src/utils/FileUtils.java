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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileUtils {

	private FileUtils() {
	}

	public static Object readObject(File file) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object o =null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			o = ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(ois, fis);
		}
		return o;
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
		}finally {
			FileUtils.close(oos, fos);
		}
	}
	
	public static <E extends FileTransfer> void writeLinesToFile(List<E> elements, String path){
		List<String> lines = elements.stream()
								.map(FileTransfer::toLine)
								.collect(Collectors.toList());
		
		try {
			Files.write(Paths.get(path), lines, StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static <E> List<E> readLines(String path, Function<String, E> function) throws Exception{
		return Files.readAllLines(Paths.get(path))
				.stream().map(function).filter(Objects::nonNull)
				.collect(Collectors.toList());
	}
	
	public static List<String> readLines(String path) {
		File file = createNewFile(path);
		List<String> lines = new ArrayList<String>();
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
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				FileUtils.close(br, fr);
			}
		}
		return lines;
	}



	public static boolean writeLines(List<String> lines, String path) {
		File file = FileUtils.createNewFile(path);

		if (file != null) {

			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter(file, true);
				bw = new BufferedWriter(fw);
				for (String line : lines) {
					bw.write(line);
					bw.newLine();
					System.out.println(" --> Writing" + line);
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

	public static boolean createNewFolder(String path) {
		// Create folder
		File file = new File(path);
		return file.mkdirs();
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
		try {
			isFileCreated = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return isFileCreated ? file : null;
	}

	public static void close(AutoCloseable... closeables) {
		for (AutoCloseable closeable : closeables) {
			if (closeable != null) {
				try {
					closeable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
