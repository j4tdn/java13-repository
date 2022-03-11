package view.dml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import utils.FileUtils;

public class Ex01 {
	
	private static final String path = "storage" + File.separator + "data" + File.separator + "model.txt";
	
	public static void main(String[] args) {
		
		File file = FileUtils.createNewFile(path);
	
		System.out.println("Start writing data...");
		if(file != null) {
			// write data
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				//open file
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				
				//write date in file
				bw.write("line 1 -> item 01, store 01");
				bw.newLine();
				bw.write("line 2 -> item 02, store 02");
				
				//save & close
				bw.close();
				fw.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Write success...");
		}
		
	}
}
