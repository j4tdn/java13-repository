package view.dml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import utils.FileUtils;

public class Ex03 {

	private static final String path = "storage" + File.separator + "data" + File.separator + "model.txt";

	public static void main(String[] args) {
		File file = new File(path);

		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(bufferedReader, fileReader);
		}
	}
}
