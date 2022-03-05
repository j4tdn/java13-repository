package view.dml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import utils.FileUtils;

public class Ex01 {
	
	private static final String path = "storage" 
									+ File.separator
									+ "data"
									+ File.separator
									+ "model.txt";
	
	public static void main(String[] args) {
		
		File file = FileUtils.createNewFile(path);
		
		System.out.println("Strat writing data ...");
		
		if(file != null) {
			// Write data
			
			System.out.println("File is existed ... ");
			
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				// Open file
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				
				// Write date
				bw.write("Line 1 --> Item 01, Store 01\n");
				// bw.newLine();
				bw.write("Line 2 --> Item 02, Store 02\n");
				
				// Save & close
				bw.close();
				fw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Complete writing data...");
	}
}
