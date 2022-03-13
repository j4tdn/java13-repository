package baitap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import utils.FileUtils;

public class Ex03 {
	private static final String path = "storage" + File.separator + "input.txt";
	private static final String path2 = "storage" + File.separator + "output.txt";
	public static void main(String[] args) {
		List<String> inputData = FileUtils.readFile(path);
		
		List<Integer> listNumber = new ArrayList<Integer>();
		for(String line:inputData) {
			String[] numbers = line.split("[A-Za-z]+");
			Arrays.stream(numbers).filter(x -> !"".equals(x)).forEach(x -> listNumber.add(Integer.parseInt(x)));
		}
		
		List<Integer> ListSortNumber = listNumber.stream().sorted().collect(Collectors.toList());
		
		File file = FileUtils.createNewFile(path2);
		if(file != null) {
			System.out.println("File is exist");
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter(file);
				bw= new BufferedWriter(fw);
				for(Integer number:ListSortNumber) {
					bw.write(number.toString());
					bw.newLine();
				}
				bw.close();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
