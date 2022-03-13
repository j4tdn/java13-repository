package baitap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

/**
 * 
 * Tạo danh sách ngẫu nhiên 30 files hình ảnh trong thư mục images với cú pháp như sau:
 * fileName: System.currentTimeMillis()
 * extension: .jpg, .png
 * Thực hiện đổi tên tất cả các hình ảnh trong thư mục images với tên file bắt đầu từ 1 và tăng dần
 * VD: 30 files: 13 files png và 17 file jpg
 * Kết quả: 1.png => 13.png và 1.jpg => 17.jpg
 *
 */
public class Ex02 {
	
	public static final String path = "image";
	public static final String [] extension = {".png", ".jpg"};
	public static void main(String[] args) {
		FileUtils.createNewFoldel(path);
		for(int i = 1; i <= 13; i++) {
			FileUtils.createFiles(path, ".png");
		}
		for(int i = 1; i <= 17; i++) {
			FileUtils.createFiles(path, ".jpg");
		}
		
		File[] pngFiles = FileUtils.getFile(path, "png");
		rename(pngFiles);
		File[] jpgFiles = FileUtils.getFile(path, "jpg");
		rename(jpgFiles);
	}
	
	public static void rename(File[] files) {
		for(int i = 1; i <= files.length; i++) {
			try {
				String fileName = files[i-1].getName();
				String extension = "."+ fileName.substring(fileName.lastIndexOf('.') + 1);
				Files.move(Paths.get(files[i-1].getAbsolutePath()), Paths.get(files[i-1].getAbsolutePath()).resolveSibling(i + extension), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
