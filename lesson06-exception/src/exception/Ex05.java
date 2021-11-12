package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args){
		File file = createNewFile("readme.md");
		boolean isWritten = write(file);

		System.out.println(isWritten);

		System.out.println("Back to MAIN method");
	}

	private static boolean write(File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Lesson06 - Exception\n");
			
			// log 99 exceptions into readme.md
			write(fw, "Exception 01 ...");
			write(fw, "Exception 02 ...");
			write(fw, "Exception 03 ...");
			write(fw, "Exception 0m ...");
			write(fw, "Exception 0n ...");
			write(fw, "Exception 70 ...");
			// 71 >> somewhat error
			write(fw, "" + 5/0); //Arithmetic Exception
			
			
			write(fw, "Exception 98 ...");
			write(fw, "Exception 99 ...");
			
			//save and close filee
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
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
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
}
