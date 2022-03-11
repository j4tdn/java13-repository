package view.dml;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import bean.Transaction;
import utils.FileUtils;

public class Ex05 {

	private static final String pathname = "storage" + File.separator + "data" + File.separator + "transaction.txt";

	public static void main(String[] args) throws Exception{
		//B1. Read File
		Path path = Paths.get(pathname);
		List<String> lines = Files.readAllLines(path);
		//lines.forEach(System.out::println);

		//B2. Process requirements
//		List<Transaction> transactions = lines.stream()
//				.map(Transaction::new)
//				//			.map(Transaction::transfer)
//				//			.map(line -> {
//				//				String[] elements = line.split("[,\\s]+");
//				//				if(elements.length != 4) {
//				//					return null;
//				//				}
//				//				return new Transaction( Integer.parseInt(elements[0]), 
//				//										elements[1],
//				//										Double.parseDouble(elements[2]),
//				//										LocalDate.parse(elements[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")));
//				//			})
//				.filter(Objects::nonNull)
//				.collect(Collectors.toList());
//		
		List<Transaction> linesOp2 = FileUtils.readLines(pathname, Transaction::new);
		linesOp2.forEach(System.out::println);
	}
}
