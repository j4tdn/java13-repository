package view.dml;

import java.io.File;
import java.util.List;

import bean.Transaction;
import utils.FileUtils;

public class Ex07 {

	private static final String pathName = "storage" + File.separator + "data" + File.separator + "transactions.txt";

	private static final String stream_path = "storage" + File.separator + "result" + File.separator + "stream.txt";

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {

		List<Transaction> transactions = FileUtils.readLines(pathName, Transaction::new);
		FileUtils.writeObject(new File(stream_path), transactions);

		List<Transaction> result = (List)FileUtils.readObject(new File(stream_path));
		System.out.println(result);
		
		
		System.out.println("====> finished");
	}
}
