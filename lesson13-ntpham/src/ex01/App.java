package ex01;

import java.io.File;
import java.util.Arrays;

import utils.FileUtils;

/**
 * @author Pho Dac Biet
 *	Bài 1: Trong thư mục đường dẫn tương đối của dự án. Tạo thư mục “garbage” 
 *	trong thư mục garbage. Tiếp tục tạo 4 thư mục “image, music, system, 
 *	coding”, 20 files với cú pháp như sau:
	+ fileName: System.currentTimeMillis()
 	+ extension: .png, .jpg, .jpeg, .mp3, .mp4, .bat, .java, .txt	
 */
public class App {
	
	private static final String path = "garbage";
	private static final String[] extensions = { ".png", ".jpg", ".jpeg", ".mp3", 
			".mp4", ".bat", ".java", ".txt"};
	
	
	public static void main(String[] args) {
		// Create 20 file 
		FileUtils.createFiles(path, extensions, 20);
		
		// Move files have extension is png , jpg, jpeg into Directory : image
		// + B1 : Get files have extension is png , jpg, jpeg 
		File[] imageFiles = FileUtils.getFiles(path, "png, jpg, jpeg");
		// + B2 : Move file 
		System.out.println("Move file is success ? : " + FileUtils.moveFiles(imageFiles, "garbage" + File.separator + "image"));
		
		// Copy files have have extension is java
		// + B1 : Get files have extension is java
		File[] javaFiles = FileUtils.getFiles(path, "java");
		// + B2 : Coppy files
		System.out.println("Copy file is success : " + FileUtils.copyFiles(javaFiles, "garbage" + File.separator + "coding"));
	
		// Delete files have extension is txt
		// + B1 : Get files have extension is java
		File[] txtFiles = FileUtils.getFiles(path, "txt");
		// + B2 : Delete files 
		Arrays.stream(txtFiles)
			  .forEach(txtFile -> txtFile.delete());
		
	}
}
