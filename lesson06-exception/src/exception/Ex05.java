package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		// Place at relative project path
		File file = createNewFile("readme.md");
		
		System.out.println(write(file));;
		System.out.println("Back to MAIN method");
	}
	
	private static boolean write(File file) {
		FileWriter fw = null;
		try {
			// IOException
			fw = new FileWriter(file);
			write(fw, "Hello World");
			write(fw, "Exception 01 ...");
			write(fw, "Exception 02 ...");
			write(fw, "Exception 03 ...");
			write(fw, "Exception 0m ...");
			
			// 71 >> cause exception
			// 71 >> electricity out
			write(fw, 5 / 0 + "");
			write(fw, "Exception 0n ...");
			write(fw, "Exception 99 ...");
			
			// Multiple Exception
			// Op1: catch child declare before parent
			// Op2: Exception
			// Readable: Opt1 >> More Readable
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			// block always run (even has exception or not)
			// Save and close file
			try {
				fw.close();
			} catch (IOException e) {
		
				e.printStackTrace();
			}
		}
		
		return true;
	}
	
	private static void write(FileWriter fw, String line) throws IOException {
		fw.write(line + "\n");
	}

	private static File createNewFile(String path) {

		File file = new File(path);
		if (!file.exists()) {
			boolean isSuccess = false;
			try {
				// Throw new, Throws >> mandatory

				isSuccess = file.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}

		return file;
	}
}
