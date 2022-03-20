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

	private static final String path = "storage" + File.separator + "data" + File.separator + "transaction.txt";

	public static void main(String[] args) throws Exception {
		// B1. Read file
		FileUtils.readLines(path, Transaction::transfer).forEach(System.out::println);;
		// B2. Process requirement
		// 1. Find transactions with value condition

		// 2. Find transactions with date condition
		// B3. Write out console, write back to output file
	}
}
