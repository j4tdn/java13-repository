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
		System.out.println("Start writing data....");
		if(file != null) {
			System.out.println("File is exist");
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter(file);
				bw= new BufferedWriter(fw);
				bw.write("-->Line 1: Item 1, Store 01");
				bw.newLine();
				bw.write("-->Line 2: Item 2, Store 02");
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("compelete writing");
	}
}