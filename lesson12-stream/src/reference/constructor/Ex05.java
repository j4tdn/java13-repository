package reference.constructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import bean.Trader;

/**
 * file trader.txt
 * id, name, city
 * 1, Smith, NewYork
 * 2, Alain, Tonga
 * 3, Henry, Milan
 * 4, Terry, Newcastle
 * 5, Kaka, Milan
 * ..................
 * line:
 * String[] elements = split(", ");
 */
public class Ex05 {
	public static void main(String[] args) {
		List<String> lines = readData("trader.txt");
		
		// constructor reference
		//List<Trader> traders = map(lines, Trader::new);
		
		// static method reference
		List<Trader> traders = map(lines, Trader::new);
		
		lines.forEach(System.out::println);
		traders.forEach(System.out::println);
	}
	
	private static <R> List<R> map(List<String> lines, Function<String, R> function) {
		List<R> result = new ArrayList<>();
		for (String line : lines) {
			result.add(function.apply(line));
		}
		return result;
	}
	
	// string-line(id, name, city)
	private static List<String> readData(String path) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Path.of(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines != null ? lines : Collections.emptyList();
	}
}
