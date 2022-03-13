package baitap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import utils.FileUtils;

/**
 * Trong thư mục đường dẫn tương đối của dự án. Tạo thư mục “garbage”
 * Trong thư mục garbage. Tiếp tục tạo 4 thư mục “image, music, system, coding”, 20 files với cú pháp như sau:
 * fileName: System.currentTimeMillis()
 * extension: .png, .jpg, .jpeg, .mp3, .mp4, .bat, .java, .txt
 * Viết chương trình thực hiện thác tác với file 
 */
public class Ex01 {
	public static final String path = "garbage";
	public static final String [] extension = {".png", ".jpg", ".jpeg", ".mp3", ".mp4", ".bat", ".java", ".txt"};
	private static final String[] childPath = { "image", "music", "system", "coding" };
	
	public static void main(String[] args) {
		
		//Tạo 20 files 
		Random rd = new Random();
		for(int i = 1; i <= 20; i++) {
			String extens = extension[rd.nextInt(extension.length)];
//			System.out.println(extens);
			FileUtils.createFiles(path, extens);
		}
		
		// Tạo 4 foldel
		for(int i = 0; i < childPath.length ; i++) {
			String fileFoldel = childPath[i];
			FileUtils.createNewFoldel("garbage" + File.separator + fileFoldel );
		}
		
		// move file bat to system
//		File[] txtFile = FileUtils.getFile(path, "bat");
		File[] imageFiles = FileUtils.getFile(path, "png, jpg, jpeg");
		FileUtils.moveFiles(imageFiles, "garbage" + File.separator + "image" + File.separator);
		File[] musicFiles = FileUtils.getFile(path, "mp3, mp4");
		FileUtils.moveFiles(musicFiles, "garbage" + File.separator + "music" + File.separator);
		File[] systemFiles = FileUtils.getFile(path, "bat");
		FileUtils.moveFiles(systemFiles, "garbage" + File.separator + "system" + File.separator);
		File[] codingFiles = FileUtils.getFile(path, "java");
		FileUtils.moveFiles(codingFiles, "garbage" + File.separator + "coding" + File.separator);
		File[] txtFiles = FileUtils.getFile(path, "txt");
		Arrays.stream(txtFiles).forEach(file -> file.delete());
		
	}
}
