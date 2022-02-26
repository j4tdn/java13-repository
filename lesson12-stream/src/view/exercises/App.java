package view.exercises;

import bean.Trader;
import bean.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.DataModel;

public class App {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		
		List<Transaction> e01 = transactions.stream()
					.filter(transaction -> transaction.getYear() == 11)
					.sorted(Comparator.comparing(Transaction::getValue))
					.collect(Collectors.toList());
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		/*List <Transaction> e02 = transactions.stream()
					.filter(transaction -> transaction.getValue() > 300)
					.sorted(Comparator.comparing())*/
		//3. What are all the unique cities where the traders work?	
		List<Trader> e03 
	}
}
