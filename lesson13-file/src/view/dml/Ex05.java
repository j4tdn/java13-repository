package view.dml;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bean.Transaction;
import utils.FileUtils;

public class Ex05 {
	private static final String pathname = "storage" + File.separator + "data" + File.separator + "transactions.txt";
	private static final String output_path = "storage" + File.separator + "result" + File.separator + "output.txt";

	public static void main(String[] args) throws IOException {
		List<Transaction> transactions = FileUtils.readLines(pathname, Transaction::transfer);
		transactions.forEach(System.out::println);

		// 1.value > 2000
		List<Transaction> transactionByValue = transactions.stream().filter(t -> t.getValue() > 2000)
				.collect(Collectors.toList());

		// 2.date > 05.04.2022
		List<Transaction> transactionByDate = transactions.stream()
				.filter(t -> t.getDate().isAfter(LocalDate.of(2022, 4, 5))).collect(Collectors.toList());

		List<Transaction> inputData = new ArrayList<Transaction>(transactionByValue);
		inputData.addAll(transactionByDate);
		// 3.write back to file
		File file = FileUtils.createNewFile(output_path);
		if (file != null) {
			FileUtils.writeLines(output_path, inputData);
		}
		System.out.println("=========================================");
	}
}
