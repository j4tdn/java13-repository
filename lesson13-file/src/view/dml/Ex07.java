package view.dml;

import java.io.File;
import java.util.List;

import bean.Transaction;
import utils.FileUtils;

public class Ex07 {
	private static final String path = "storage" + File.separator + "data" + File.separator + "transactions.txt";
	private static final String streamPath = "storage" + File.separator + "result" + File.separator + "stream.txt";

	public static void main(String[] args) {
//		List<Transaction> transactions = FileUtils.readLines(path, Transaction::transfer);

//		FileUtils.writeObject(new File(path), transactions);
		
		@SuppressWarnings("unchecked")
		List<Transaction> transactions = (List<Transaction>) FileUtils.readObject(new File(streamPath));
		System.out.println(transactions);

		
		System.out.println("====>> finished!!!");
	}
}
