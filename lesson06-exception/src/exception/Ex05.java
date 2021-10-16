package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		//place at relative project path
		File file = createNewFile("readme.md");
		boolean isSuccess = write(file);
		System.out.println("isSuccess: "+isSuccess);
		System.out.println("Back to MAIN method");
		
	}
	private static boolean write(File file){
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Lesson06 - Exception \n");
			
			//LOG 99 exception in readme.md file
			write(fw,"Exception 01 ....");
			write(fw,"Exception 01 ....");
			write(fw,"Exception 03 ....");
			write(fw,"Exception m  ....");
			write(fw,"Exception 70 ....");
			
			//71>>cause exception
			//71>>electricity out
			write(fw,""+5/0);
			
			write(fw,"Exception n  ....");
			write(fw,"Exception 98 ....");
			write(fw,"Exception 99 ....");
			//Opt1: catch child declare before parent: ArithmeticException | IOException
			//Opt2: Exception
			// Readable: Opt1 >> More Readable
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			// "finally": always run (even has exception or not, 
			// even jump into catch or not, even get "return")
			// if have "return" in Catch, finally occurs then return
			try {
				fw.close();
				//save and close file
			} catch (IOException ex) {
				ex.printStackTrace();
			} 
		}
		return true;
	}
	private static void write(FileWriter fw, String line) throws IOException {
		fw.write(line+"\n");
	}
	
	private static File createNewFile(String path) {
		File file = new File(path);
		if(!file.exists()) {
			boolean isSuccess = false;
			try {
				//throws >>mandatory
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		return file;
	}
}
