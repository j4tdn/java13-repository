package ex02;

import java.io.File;

import utils.FileUtils;

/**
 * @author Pho Dac Biet
 * Bài 2: Tạo danh sách ngẫu nhiên 30 files hình ảnh trong thư mục images với cú pháp như sau:
		  + fileName: System.currentTimeMillis()
          + extension: .jpg, .png
   Thực hiện đổi tên tất cả các hình ảnh trong thư mục images với tên file bắt đầu từ 1 và tăng dần
		  + VD: 30 files: 13 files png và 17 file jpg
		  + Kết quả: 1.png => 13.png và 1.jpg => 17.jpg
 */

public class App {
	
	private static final String path = "garbage" + File.separator + "images";
	private static final String[] extensions = { ".png", ".jpg" };
	
	public static void main(String[] args) {
		// Create 30 file 
		FileUtils.createFiles(path, extensions, 30);
		
		// Rename files have extension "png"
		File[] pngFiles = FileUtils.getFiles(path, "png");
		FileUtils.showFile(pngFiles);
		renameFiles(pngFiles, ".png");
		
		System.out.println("==============================");
		
		// Rename files have extension "jpg"
		File[] jpgFiles = FileUtils.getFiles(path, "jpg");
		FileUtils.showFile(jpgFiles);
		renameFiles(jpgFiles, ".jpg");
		
		System.out.println("==================After rename====================");
		FileUtils.showFile(FileUtils.getFiles(path, "png"));
		System.out.println("==============================");
		FileUtils.showFile(FileUtils.getFiles(path, "jpg"));
		
	}
	
	private static boolean rename(File file, String newName) {
		File file2 = new File(newName);
		if (file2.exists()) {
			return false;
		}
		return file.renameTo(file2);
	}
	
	private static void renameFiles(File[] files, String extension) {
		for (int i = 0; i < files.length; i++) {
			rename(files[i], files[i].getParent() + File.separator + (i+1) + extension);
		}
	}
}
