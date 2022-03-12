package view.dml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import utils.FileUtils;

public class Ex03 {

	private static final String path = "storage" + File.separator + "data" + File.separator + "model.txt";
	
	public static void main(String[] args) {
		File file = new File(path);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line ="";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(br, fr);
		}
	}
}