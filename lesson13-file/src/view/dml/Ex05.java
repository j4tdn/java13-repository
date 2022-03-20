package view.dml;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
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
	private static final String output_path = "storage" 
			+ File.separator  + "result" 
			+ File.separator  + "output.txt";
	public static void main(String[] args) throws Exception {
		//B1. read file
		List<Transaction> transactions = FileUtils.readLines(path, Transaction::transfer);
		transactions.forEach(System.out::println);	 
		
		//B2. Process requirements
		// Find transaction with value condition
		
		System.out.println("==================================");
		List<Transaction> transactionsByValue =  transactions.stream()
					.filter(trans -> trans.getValue() > 2000)
					.collect(Collectors.toList());
					
		// Find transaction with date condition
		
		List<Transaction> transactionsByDate = transactions.stream()
					.filter(transaction -> transaction.getDate().isAfter(LocalDate.of(2022, 4, 5)))
					.collect(Collectors.toList());
		//B3. Write to console, write back to output file
		
//		transactionsByValue.forEach(System.out::println);
//		System.out.println("==================================");
//		transactionsByDate.forEach(System.out::println);
//		System.out.println("==================================");
		List<Transaction> inputData = new ArrayList<Transaction>(transactionsByValue);
		inputData.addAll(transactionsByDate);
		File file = FileUtils.createNewFile(output_path);
		if(file != null) {
			FileUtils.writeLines(output_path, inputData);
		}
		
		
	}
}	
