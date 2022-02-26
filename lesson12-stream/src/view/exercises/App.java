package view.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class App {
	public static void main(String[] args) {
		List<Transaction> transactions = DataModel.getTransactions();
		List<Trader> traders = DataModel.getTraders();
		//Find all transactions in the year 2011 and sort them by value
		List<Transaction> result1 = transactions.stream()
					.filter(year -> year.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.collect(Collectors.toList());
		result1.forEach(System.out::println);
		System.out.println("============");
		//Find all transactions have value greater than 300 and sort them by trader’s city
		List<Trader> result2 = transactions.stream()
				.filter(tran -> tran.getValue() > 300)
				.map(Transaction::getTrader)
				.sorted(Comparator.comparing(Trader::getCity))
				.collect(Collectors.toList());
		result2.forEach(System.out::println);
		System.out.println("===========");
		//What are all the unique cities where the traders work?
		
	}
}
