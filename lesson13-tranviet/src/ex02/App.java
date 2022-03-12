package ex02;

import java.io.File;
import java.util.List;
import java.util.Random;

import utils.Extension;
import utils.FileUtils;

public class App {
	private static final String path = "images";
	private static final Extension[] imgExtension = { Extension.png, Extension.jpg };
	private static int count = 0;

	public static void main(String[] args) {
		FileUtils.createFolder(path);

		Random rd = new Random();
		for (int i = 0; i < 30;) {
			String newPath = path + File.separator + System.currentTimeMillis() + "."
					+ imgExtension[rd.nextInt(imgExtension.length)].toString();
			File file = new File(newPath);
			if (!file.exists()) {
				FileUtils.createFile(newPath);
				i++;
			}
		}

		List<File> pngFiles = FileUtils.getAllFilesByExtension(path, imgExtension[0]);
		renameFile(pngFiles, imgExtension[0]);

		List<File> jpgFiles = FileUtils.getAllFilesByExtension(path, imgExtension[1]);
		renameFile(jpgFiles, imgExtension[1]);
	}

	private static void renameFile(List<File> files, Extension ex) {
		files.forEach(file -> {
			String newPath = path + File.separator + "" + (++count) + "." + ex.toString();
			file.renameTo(new File(newPath));
		});
		count = 0;
	}
}
