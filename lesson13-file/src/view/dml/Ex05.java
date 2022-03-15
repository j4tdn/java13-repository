package view.dml;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bean.Transaction;
import utils.FileUtils;

public class Ex05 {
	
	private static final String pathName = "storage"
									+ File.separator
									+ "data"
									+ File.separator
									+ "transactions.txt";
	
	private static final String output_path = "storage"
			+ File.separator
			+ "result"
			+ File.separator
			+ "result.txt";
	
	public static void main(String[] args) throws Exception{
		// B1. Read file
		List<Transaction> transactions = FileUtils.readLines(pathName, Transaction::new);
		transactions.forEach(System.out::println);
		
		// B2. Process requirements
		// 1. Find transactions with value condition (value > 2000)
		
		List<Transaction> transactionsByValue = transactions.stream()
			  	    .filter(transaction -> transaction.getValue() > 2000)
			  	    .collect(Collectors.toList());
			  	    
		System.out.println("==========================================================");
		
		// 2. Find transactions with date condition (date > 05.04.2022)
		List<Transaction> transactionsByDate = transactions.stream()
		  	    .filter(transaction -> transaction.getDate().isAfter(LocalDate.of(2022, 4, 5)))
		  	    .collect(Collectors.toList());
		
		List<Transaction> inputData = new ArrayList<>(transactionsByValue); 
		inputData.addAll(transactionsByDate);
		// B3. Write out console, write back to output file
		System.out.println("=========================================================");
		File file = FileUtils.createNewFile(output_path);
		if(file != null) {
			FileUtils.writeLines(output_path, inputData);
		}
		
		System.out.println("==========================================================");
	
			
		
		// 
	}
}
