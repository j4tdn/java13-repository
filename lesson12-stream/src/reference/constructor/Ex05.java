package reference.constructor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Ex05 {
	public static void main(String[] args) {
		
	}
	
	private static List<String> readData(String path){
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Path.of(path));
		} catch(IOException e) {
			e.printStackTrace();
		}
		return lines != null ? lines: Collections.emptyList();
		
	}
}
