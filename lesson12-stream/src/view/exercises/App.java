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

		// 5 -> Return a string of all traders’ names sorted alphabetically.
		String trunderNames = traders.stream()
			   .map(Trader::getName)
			   .sorted()
			   .collect(Collectors.joining(", "));
		System.out.println(trunderNames);
		
		System.out.println("==================================");
		
		// 6 -> Are any traders based in Milan?
		boolean iTOM = traders.stream()
				.anyMatch(trader -> "Milan".equals(trader.getCity()));
		System.out.println("Are any traders based in Milan ? : " + iTOM);
		
		System.out.println("==================================");
		
		// 7 -> Count the number of traders in Milan.
		long numberOfTrader = traders.stream()
				.filter(trader -> "Millan".equals(trader.getCity()))
				.count();
		System.out.println("The number of traders in Milan : " + numberOfTrader);
		
		System.out.println("==================================");
		
		// 8 -> Print all transactions’ values from the traders living in Cambridge.
		transactions.stream()
					.filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
					.map(Transaction::getValue)
					.forEach(System.out::println);
		
		System.out.println("==================================");
		
		// 9 -> What’s the highest value of all the transactions?
		int max = transactions.stream()
					.map(Transaction::getValue)
					.reduce(Integer.MIN_VALUE, Math::max);
		System.out.println("The highest value of all the transactions: " + max);
		
		System.out.println("==================================");
		
		// 10 -> Find the transaction with the smallest value.
		Transaction smallest = transactions.stream().reduce(transactions.get(0), 
				(t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
		System.out.println("The transaction with the smallest value: " + smallest.getValue());
	}
}
