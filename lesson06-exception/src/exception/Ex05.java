package exception;

/**
 * Compile - Exception >> Checked Exception >> Exception, IOException 's children
 * >> try/catch (mandatory) (Ex05: IOException)
 * 
 * Runtime - Exception >> Unchecked Exception >> Runtime's Children
 * >> try/catch (optional) (Ex03: ArithmeticException)
 * 
 * 
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// place at relative project path
		File file = new File("readme.md");
		
	boolean isSuccess = write(file);
	System.out.println("isSuccess: " + isSuccess);
		
	System.out.println("Back to MAIM method");	
		
	}
	
	private static boolean write(File file) {
		FileWriter fw = null;
		try {
			// IOException
			fw = new FileWriter(file);	
			fw.write("Lesson06 - Exception\n");
			
			// LOG 99 exceptions in readme.md file
			write(fw, "Exception 01 ...");
			write(fw, "Exception 02 ...");
			write(fw, "Exception 03 ...");
			write(fw, "Exception m ...");
			write(fw, "Exception 70 ...");
			
			// 71 >> cause exception
			// 71 >> electricity out
			write(fw, "" + 5/0); // ArithmeticException
			
			write(fw, "Exception k ...");
			write(fw, "Exception 98 ...");
			write(fw, "Exception 99 ...");
			
			// Multiple Exceptions
			// Opt1: catch child declare before parent (v1.7)>> ArithmeticException | IOException e
			// Opt2: Exception
			// Readable: Otp1 >> More Readable
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
			return false; // run finally before "return"
		} finally {
			// block always run (even has exception or not, even jump into catch or not)
			// to close and save file
				try {
					fw.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				} 
		}	
		return true;
	}

	// Write this method >> needn't write \n many times
	private static void write(FileWriter fw, String line) throws IOException {
		fw.write(line + "\n");
	}
	
	private static File createNewFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			boolean isSuccess = false;
			try {
				// throw new, throws >> mandatory
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		return file;
		
	}
	
	
	
	
}
