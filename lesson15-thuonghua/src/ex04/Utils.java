package ex04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Utils {
	private Utils() {
		
	}
	
	private static final String PATH = "D:\\student.txt";
	public static List<String> readFile() {
		try {
			List<String> list = Files.readAllLines(Paths.get(PATH));
			return list;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
