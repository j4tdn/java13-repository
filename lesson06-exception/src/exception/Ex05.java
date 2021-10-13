package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// place at relative project
		File file = new File("readme.md");

		boolean isSuccess = write(file);
		System.out.println("isSuccess: " + isSuccess);

		System.out.println("Back to MAIN method");
	}

	private static boolean write(File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Lesson06 - Exception\n");
			fw.write("Exception 01 ....");
			fw.write("Exception 02 ....");
			fw.write("Exception 03 ....");
			fw.write("Exception 04 ....");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	private static void write(FileWriter fw, String line) throws IOException {

	}

	private static File createNewFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			boolean isSuccess = false;
			try {
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println(isSuccess);
		}
		return file;
	}
}
