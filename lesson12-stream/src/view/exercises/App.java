package view.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class App {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();	
		List<Transaction> transactions = DataModel.getTransactions();
		
		// 1 -> Find all transactions in the year 2011 and sort them by value (small to high).
		transactions.stream()
					.filter(transaction -> transaction.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.forEach(System.out::println);
		
		System.out.println("==================================");

		// 2 -> Find all transactions have value greater than 300 and sort them by trader’s city
		transactions.stream()
					.filter(transaction -> transaction.getValue() > 300)
					.sorted(Comparator.comparing(new Function<Transaction, String>() {
						public String apply(Transaction transaction) {
							return transaction.getTrader().getCity();
						};
					}
					))
					.forEach(System.out::println);
		
		System.out.println("==================================");

		// 3 -> What are all the unique cities where the traders work?
		traders.stream()
					.map(Trader::getCity)
					.distinct()
					.forEach(System.out::println);
		
		System.out.println("==================================");
		
		// 4 -> Find all traders from Cambridge and sort them by name desc.
		traders.stream()
					.filter(trader -> "Cambridge".equals(trader.getCity()))
					.sorted(Comparator.comparing(Trader::getName, Comparator.reverseOrder()))
					.forEach(System.out::println);
		
		System.out.println("==================================");

		// 5-> Return a string of all traders’ names sorted alphabetically.
		
	}
}
