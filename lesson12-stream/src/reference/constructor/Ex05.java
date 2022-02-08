package reference.constructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import bean.Trader;

/*
 * file trader.txt
 * id, name, city
 */
public class Ex05 {
	public static void main(String[] args) {
		List<String> lines = readData("src\\trader.txt");
		
		
		// C1: constructor reference
		//List<Trader> traders = map(lines, Trader::new);
		
		// C2: static method reference
		List<Trader> traders = map(lines, Trader::transfer);
		traders.forEach(System.out::println);
		
	}
	
	private static <R> List<R> map(List<String> lines, Function<String, R> function){
		List<R> results = new ArrayList<>();
		//line -> trader
		for(String line: lines) {
			results.add(function.apply(line));
		}

		return results;
	}
	
	private static List<String> readData(String path){
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Path.of(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lines != null ? lines : Collections.emptyList();
	}
}
