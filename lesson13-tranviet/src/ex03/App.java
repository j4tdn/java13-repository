package ex03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import utils.FileUtils;

public class App {
	private static final String inputPath = "input.txt";
	private static final String outputPath = "output.txt";

	public static void main(String[] args) {
		List<String> inputData = FileUtils.readFromFile(new File(inputPath));
		inputData.remove(0);

		List<Integer> numbers = getAllNumber(inputData).stream().sorted().collect(Collectors.toList());
		List<String> numberAsString = new ArrayList<String>();
		numbers.forEach(x -> numberAsString.add("" + x));

		try {
			FileUtils.createFile(outputPath);
			Files.write(Paths.get(outputPath), numberAsString, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Integer> getAllNumber(List<String> data) {
		List<Integer> numbers = new ArrayList<>();
		for (String str : data) {
			String[] numberAsStrings = str.split("[A-Za-z]+");
			Arrays.stream(numberAsStrings).filter(x -> !"".equals(x)).forEach(x -> numbers.add(Integer.parseInt(x)));
		}
		return numbers;
	}

}
