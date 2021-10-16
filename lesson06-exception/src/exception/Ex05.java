package exception;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		//place at relative project path
		File file = new File("readme.md");
		Boolean isSuccess = write(file);
		System.out.println("isSuccess: " + isSuccess);
		System.out.println("Back to MAIN method");

	}

	private static boolean write(File file) {
		FileWriter fw = null;

		try {
			fw = new FileWriter(file);
			write(fw,"lesson06 - Exception");
			write(fw,"Exception 01 ...");
			write(fw,"Exception 02 ...");
			write(fw,"Exception 03 ...");
			write(fw,"Exception 04 ...");
			write(fw, "" + 5/0);
			write(fw,"Exception 99 ...");
			write(fw,"Exception 100 ...");
			// Opt1: catch child declare before parent ArithmeticException | IOException 
			// Opt2: Exception
			// readable >> Opt1

		} catch (IOException  | ArithmeticException e) {
			e.printStackTrace();
			return false;
		} finally {
			// block always run (even exception or not, even jump into catch or not)
			// save abd close file
				try {
					fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
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
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		 return file;
	}
}
