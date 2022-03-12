package ex01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import utils.Extension;
import utils.FileUtils;
import utils.Operation;

public class App {
	private static final String path = "garbage";
	private static final String[] folders = { "image", "music", "system", "coding" };
	private static List<String> folderPath = new ArrayList<>();

	public static void main(String[] args) {
		FileUtils.createFolder(path);

		for (String folder : folders) {
			String newPath = path + File.separator + folder;
			folderPath.add(newPath);
			FileUtils.createFolder(newPath);
		}

		Extension[] extensions = Extension.values();

		Random rd = new Random();
		for (int i = 0; i < 20;) {
			String newPath = path + File.separator + System.currentTimeMillis() + "."
					+ extensions[rd.nextInt(extensions.length)];
			File file = new File(newPath);
			if (!file.exists()) {
				FileUtils.createFile(newPath);
				i++;
				System.out.println(i + "." + newPath);
			}
		}

		// Di chuyển tất cả các file có extenson .bat vào thư mục system
		fileOperating(Operation.Move, folderPath.get(2), Extension.bat);
		
		// Di chuyển tất cả các file có extenson .png, .jpg, .jpeg vào thư mục image
		fileOperating(Operation.Move, folderPath.get(0), Extension.png, Extension.jpg, Extension.jpeg);

		// Di chuyển tất cả các file có extenson .mp3, .mp4 vào thư mục music
		fileOperating(Operation.Move, folderPath.get(1), Extension.mp3, Extension.mp4);

		// Copy tất cả các file có extenson .java vào thư mục coding
		fileOperating(Operation.Copy, folderPath.get(3), Extension.java);

		// Xoá tất cả các file có extenson .txt
		fileOperating(Operation.Delete, null, Extension.txt);
		
	}

	private static void fileOperating(Operation operation, String folderPath, Extension... extensions) {
		for (Extension extension : extensions) {
			FileUtils.fileOption(FileUtils.getAllFilesByExtension(path, extension), operation, folderPath);
		}
	}
}
