package view.dml;

import java.io.File;
import java.util.List;

import bean.Transaction;
import utils.FileUtils;

public class Ex07 {
	
	private static final String path = "storage" 
			+ File.separator + "data" 	
			+ File.separator + "transaction.txt";
	private static final String stream_path = "storage" 
			+ File.separator + "result" 	
			+ File.separator + "stream.txt";
	public static void main(String[] args) throws Exception {
//		List<Transaction> transactions = FileUtils.readLines(path, Transaction::transfer);
//		FileUtils.writeObject(new File(stream_path), transactions);
		
		@SuppressWarnings("unchecked")
		List<Transaction> result = (List<Transaction>)FileUtils.readObject(new File(stream_path));
		System.out.println(result);
		System.out.println("------> finished");
		
	}
}
