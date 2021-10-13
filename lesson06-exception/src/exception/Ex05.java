package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// place at relative project path
		File file = new File("readme.md");
		
		boolean isSuccess = write(file);
		System.out.println("isSuccess: " + isSuccess);
		
		System.out.println("Back to main method");
	}
	
	private static boolean write(File file) {
		FileWriter fw = null;
		try {
			//IOException
			fw = new FileWriter(file);
			fw.write("Lesson06 - Exception\n");
			
			// LOG 99 exceptions in readme.md file
			write(fw, "Exception 01 ...");
			write(fw, "Exception 01 ...");
			write(fw, "Exception 03 ...");
			write(fw, "Exception m ...");
			write(fw, "Exception 70 ...");
			
			// 71 >> cause exception
			// 71 >> electricity out
			write(fw, "" + 5/0); // Arithmetic Exception
			
			write(fw, "Exception k ...");
			write(fw, "Exception 98 ...");
			write(fw, "Exception 99 ...");
			// Multiple Exceptions
			// Opt1: catch child declare before parent (1.7) (ArithmeticException | IOException e)
			// Opt2: Exception
			// Readable: Opt1 >> More Readable
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			// block code always run (even has exception or not, even jump catch or not)
			// save and close file
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
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
		if(!file.exists()) {
			boolean isSuccess = false;
			try {
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		return file;
	}
}
