package Ex04;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Utils {
	private Utils() {}
	
	public static <E> List<E> readLines(String path, Function<String, E> function) throws Exception{
		return Files.readAllLines(Paths.get(path))
				.stream().map(function).filter(Objects::nonNull)
				.collect(Collectors.toList());
	}
}
