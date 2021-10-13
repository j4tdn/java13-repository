package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		//code Tao file
		//Đường dãn tương đối của dự án - place at relative project path
		File file = createNewFile("readme.md");
		
		boolean isSucces = write(file);
		System.out.println("isSucces : " + isSucces);
		
		System.out.println("Back to MAIN method");
	}
	private static boolean write(File file)  {
		//write in file >> FileWriter
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Lesson 06 - Exception\n");
			
			//LOG 99 exception in readme.md file
			write(fw, "Exception 01 ....\n");
			write(fw, "Exception 02 ....\n");
			write(fw, "Exception 03 ....\n");
			write(fw, "Exception m ....\n");
			write(fw, "Exception n ....\n");
			write(fw, "Exception 98 ....\n");
			write(fw, "Exception 99 ....\n");
			
			
			
			
			fw.close();//save and close file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
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
				//throw new, throws >> mandatory
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		return file;
	}
}
