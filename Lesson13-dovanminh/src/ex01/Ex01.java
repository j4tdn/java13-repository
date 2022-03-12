package ex01;

import java.io.File;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		String[] folders = {"image", "music", "system", "coding"};
		File[] files = new File[20];
		String path = "C:\\Users\\Admin\\Desktop\\data\\";
		String[] extensions = {".png", ".jpg", ".jpeg",".mp3",".mp4", ".bat", ".java", ".txt"};
		try {
			for (int i = 0; i < files.length; i++) {
				files[i] = new File(path + System.currentTimeMillis() + i + extensions[(int) (Math.random() * 8)]);
				if (files[i].createNewFile()) {
					System.out.println("File is created!");
				} else {
					System.out.println("File already exists.");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < files.length; i++) {
			String extension = files[i].getName().split("\\.")[1];
			if (extension.equals("jpg") || extension.equals("png") || extension.equals("jpeg")) {
				File newFile = new File(path+"image\\"+files[i].getName());
				files[i].renameTo(newFile);
				System.out.println(files[i] + " - " + newFile);
			} else if (extension.equals("mp3") || extension.equals("mp4")){
				File newFile = new File(path+"music\\"+files[i].getName());
				files[i].renameTo(newFile);
			} else if (extension.equals("bat")){
				File newFile = new File(path+"system\\"+files[i].getName());
				files[i].renameTo(newFile);
			} else if (extension.equals("java")) {
//				todo
			} else {
				files[i].delete();
			}
		}
	}
}
