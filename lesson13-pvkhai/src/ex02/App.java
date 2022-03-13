package ex02;

import java.io.File;

import utils.FileUtils;

public class App {
	private static final String path = "images";
	private static final String[] extensions = {".jpg",".png"};
	public static void main(String[] args) {
		//FileUtils.createFiles(path, extensions, 30);
		File[] files_png = FileUtils.getFiles(path, "png");
		File[] files_jpg = FileUtils.getFiles(path, "jpg");
		for(int i = 1; i <= files_png.length; i++) {
			for(File png: files_png) {
				File file = new File(path + File.separator + png.getName());
				File rename = new File(path + File.separator + i + ".png");
				file.renameTo(rename);
			}
		}
		for(int i = 1; i <= files_jpg.length; i++) {
			for(File jpg: files_jpg) {
				File file = new File(path + File.separator + jpg.getName());
				File rename = new File(path + File.separator + i + ".jpg");
				file.renameTo(rename);
			}
		}
		
	}
}
