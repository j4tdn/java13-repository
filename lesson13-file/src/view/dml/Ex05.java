package view.dml;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import bean.Transaction;
import utils.FileUtils;

public class Ex05 {

	private static final String path = "storage" 
					+ File.separator 
					+ "data" 
					+ File.separator 
					+ "transaction.txt";
	public static void main(String[] args) throws Exception {
		//B1. read file
		List<Transaction> transactions = FileUtils.readLines(path, Transaction::transfer);
		transactions.forEach(System.out::println);	 
		
		//B2. Process requirements
		// Find transaction with value condition
		// Find transaction with date condition
		System.out.println("==================================");
		transactions.stream()
					.filter(trans -> trans.getValue() > 1500)
					.collect(Collectors.toList())
					.forEach(System.out::println);
		
		//B3. Write to console, write back to output file
	}
	
}