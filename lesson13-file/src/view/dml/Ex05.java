package view.dml;

import java.io.File;
import java.util.List;

import bean.Transaction;
import utils.FileUtils;

public class Ex05 {
	
	private static final String pathName = "storage"
									+ File.separator
									+ "data"
									+ File.separator
									+ "transactions.txt";
	
	public static void main(String[] args) throws Exception{
		// B1. Read file
		List<Transaction> transactions = FileUtils.readLines(pathName, Transaction::new);
		transactions.forEach(System.out::println);
		
		// B2. Process requirements
		// 1. Find transactions with value condition
		// 2. Find transactions with date condition
		
		
		// B3. Write out console, write back to output file
		
		
		// 
	}
}
