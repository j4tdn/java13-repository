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
		String result = "";
		try {
			fr= new FileReader(file);
			br = new BufferedReader(fr);
			String line = "";
			while((line = br.readLine()) != null) {
				result += line + "\n";
			}
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		finally {
			FileUtils.close(br, fr);
		}
		System.out.println(result);
	}
}
