package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Ex05 {
	public static void main(String[] args) {
		//place at relative project path
		File file = createNewFile("readme.md");

		boolean isWrite = write(file);
		System.out.println(isWrite);

		System.out.println("Back to MAIN mefthod");
	}

	private static boolean write(File file)  {
		FileWriter fw = null;

		try {
			fw = new FileWriter(file);
			fw.write("lesson06 - Exception\n");

			write(fw, "Excep 01....");
			write(fw, "Excep 02....");
			write(fw, "Excep 03....");
			write(fw, "Excep m....");
			write(fw, "Excep n....");

			//71 >> cause exception
			write(fw, "" + 5/0);
			write(fw, "Excep 98....");
			write(fw, "Excep 99....");
			write(fw, "Excep 100....");

		} catch (Exception e) {
			e.printStackTrace();;
			return false;
		}finally {
			
			//block always run(even has exception or not, even jump into catch or not)
			
			//save and close file
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

	private static void write(FileWriter fw, String line ) throws IOException {
		fw.write(line + "\n");
	}

	private static File createNewFile(String path) {
		File file = new File(path);
		if(!file.exists()) {
			boolean isSuccess = false;
			try {
				//throw >> new , throws >> mandatory
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		return file;
	}

}
