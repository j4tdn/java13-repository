package ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import utils.FileUtils;

public class App {
	private static final String path = "readme.txt";
	
	private static List<String> outputData(String path) {
		File file = new File(path);

		List<String> lines = new ArrayList<String>();
		
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				lines.add(line);
			}
			bufferedReader.close();
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return lines;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dong n: ");
		int n = sc.nextInt();
		System.out.println("Nhap so cot m:");
		int m = sc.nextInt();

		int[][] arr = new int[n][m];
		Random rd = new Random();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = rd.nextInt(10);
			}
		}

		File file = new File(path);
		if(file != null) {
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				bw.write("rows: " + n + "||columns: " + m);
				bw.newLine();
				
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < m; j++) {
						bw.write(arr[i][j] + " ");
					}
					bw.newLine();
				}
				
				bw.close();
				fw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		System.out.println("Complete writing data...");

		List<String> lines = outputData(path);
		lines.forEach(System.out::println);
	}
}
