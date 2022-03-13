package ex01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

/*
 * Trong thư mục đường dẫn tương đối của dự án. Tạo thư mục “garbage”
Trong thư mục garbage. Tiếp tục tạo 4 thư mục “image, music, system, coding”, 20 files với cú
pháp như sau:
 fileName: System.currentTimeMillis()
 extension: .png, .jpg, .jpeg, .mp3, .mp4, .bat, .java, .txt
 */
public class App {

	private static final String path = "garbage";

	private static final String extensions[] = {".png", ".jpg", ".jpeg", ".mp3", ".mp4", ".bat", ".java", ".txt"};


	public static void main(String[] args) {
		//createFiles 
		//FileUtils.createFiles(path, extensions, 20);

		//delete file txt
		File[] file_txts = FileUtils.getFiles(path, "txt");
		Arrays.stream(file_txts).forEach(file -> file.delete());

		//copy file java into  folder coding 
		File[] file_javas = FileUtils.getFiles(path, "java");
		for(File file: file_javas) {
			Path source = Paths.get(file.getAbsolutePath());
			Path des = Paths.get("garbage" + File.separator + "coding" + File.separator + file.getName());
			try {
				Files.copy(source, des, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
		}
		
		//move file bats into folder system
		File[] file_bats = FileUtils.getFiles(path, "bat");
		for(File file: file_bats) {
			Path source = Paths.get(file.getAbsolutePath());
			Path des = Paths.get("garbage" + File.separator + "system" + File.separator + file.getName());
			try {
				Files.move(source, des, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
		}
		
		//move file mp3 mp4 into folder music
		File[] file_mp3 = FileUtils.getFiles(path, "mp3");
		File[] file_mp4 = FileUtils.getFiles(path, "mp4");
		List<File> file_mp_list = new ArrayList<File>();
		for(File f3: file_mp3) {
			file_mp_list.add(f3);
		}
		for(File f4: file_mp4) {
			file_mp_list.add(f4);
		}

		for(File file: file_mp_list) {
			Path source = Paths.get(file.getAbsolutePath());
			Path des = Paths.get("garbage" + File.separator + "music" + File.separator + file.getName());
			try {
				Files.move(source, des, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//move file jpg, png, jpeg into folder image
		File[] file_jpg = FileUtils.getFiles(path, "jpg");
		File[] file_png = FileUtils.getFiles(path, "png");
		File[] file_jpeg = FileUtils.getFiles(path, "jpeg");
		List<File> file_image_list = new ArrayList<File>();
		for(File jpg: file_jpg) {
			file_image_list.add(jpg);
		}
		for(File png: file_png) {
			file_image_list.add(png);
		}
		for(File jpeg: file_jpeg) {
			file_image_list.add(jpeg);
		}

		for(File file: file_image_list) {
			Path source = Paths.get(file.getAbsolutePath());
			Path des = Paths.get("garbage" + File.separator + "image" + File.separator + file.getName());
			try {
				Files.move(source, des, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
