package view.dml;

import java.io.File;
import java.io.IOException;
import java.util.List;

import bean.Transaction;
import utils.FileUtils;

public class Ex05 {
	private static final String pathname = "storage" + File.separator + "data" + File.separator + "transactions.txt";

	public static void main(String[] args) throws IOException {
		List<Transaction> transactions = FileUtils.readLines(pathname, Transaction::transfer);
		transactions.forEach(System.out::println);
	}
}
