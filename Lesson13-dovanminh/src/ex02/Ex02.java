package ex02;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("a");
		String path = "C:\\Users\\Admin\\Desktop\\images\\";
		String[] extension = { ".jpg", ".png" };
		File[] files = new File[30];

		try {
			for (int i = 0; i < files.length; i++) {
				files[i] = new File(path + System.currentTimeMillis() + i + extension[(int) (Math.random() * 2)]);
				if (files[i].createNewFile()) {
					System.out.println("File is created!");
				} else {
					System.out.println("File already exists.");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		int countJpg = 1;
		int countPng = 1;

		for (int i = 0; i < files.length; i++) {
			if (files[i].getName().split("\\.")[1].equals("jpg")) {
				File newFile = new File(files[i].getParentFile() + "\\" + countJpg + ".jpg");
				files[i].renameTo(newFile);
				countJpg++;
			} else {
				File newFile = new File(files[i].getParentFile() + "\\" + countPng + ".png");
				files[i].renameTo(newFile);
				countPng++;
			}
		}
	}
}
