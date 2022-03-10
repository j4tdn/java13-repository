package view.dml;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import bin.Transaction;
import utils.FileUtils;

public class Ex05 {
	private static final String pathname = "storage" + File.separator + "data" + File.separator + "transaction.txt";
	
	public static void main(String[] args) throws Exception {
		// B1.Read file
		Path path = Paths.get(pathname);
		List<Transaction> transactions = FileUtils.readLines(pathname, Transaction::transfer);
		
		// B2. Process requirements
		// 1. Find transactions with value condition
	}
}	
