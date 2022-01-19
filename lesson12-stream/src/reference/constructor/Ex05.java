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
 * 
 * @author tranc
 *
 */
public class Ex05 {
	public static void main(String[] args) {
		List<String> lines = readData("trader.txt");
		//lines.forEach(System.out::println);

		//constructor reference
		//List<Trader> traders = map(lines, Trader::new);
		//traders.forEach(System.out::println);
		
		//static method reference
		List<Trader> traders = map(lines, Trader::transfer);
		traders.forEach(System.out::println);
	}

	private static <R> List<R> map(List<String> lines, Function<String, R> function) {
		List<R> rs = new ArrayList<>();
		for (String line : lines) {
			rs.add(function.apply(line));
		}
		return rs;
	}

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
