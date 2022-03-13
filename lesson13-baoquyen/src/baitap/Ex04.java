package baitap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import utils.FileUtils;

public class Ex04 {
	private static final String path = "storage" + File.separator+ "readme.txt";
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enetr cols:");
		int m = input.nextInt();
		System.out.print("enetr rows:");
		int n = input.nextInt();
		int[][] matrix = new int[n][m];
		Random rd = new Random();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++ ) {
				matrix[i][j] = rd.nextInt(100);
			}
		}
		
		File file = FileUtils.createNewFile(path);
		if(file != null) {
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter(file);
				bw= new BufferedWriter(fw);
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < m; j++ ) {
						 bw.write(matrix[i][j] + " ");
					}
					bw.newLine();
				}
				bw.close();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		List<String> readData = readFile(path);
		readData.stream().forEach(System.out::println);
//		
	}
	
	public static List<String> readFile(String path){
		File file = new File(path);
		FileReader fr = null;
		BufferedReader br = null;
		
		List<String> inputData = new ArrayList<>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = "";
			while((line = br.readLine()) != null) {
				inputData.add(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return inputData;
	}
	
}
