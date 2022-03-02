package view.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class App {
	public static void main(String[] args) {
		// input
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high). 
		// transaction -> transaction.getValue()
		// Transaction::getValue
		List<Transaction> c1 = transactions.stream()
					.filter(transaction -> transaction.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.collect(Collectors.toList());
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		// transaction -> transaction.getTrader().getCity()
		// Transaction::getTrader::getCity
		// Function<Transaction, Trader>::getCity
		
		// Chaining Operator
		Function<Transaction, Trader> f0 = Transaction::getTrader;
		Function<Trader, String> f1 = Trader::getCity;
		Function<Transaction, String> fn = f0.andThen(f1);
		
		// transaction -> transaction.getTrader()
		// == Transaction::getTrader = Function<Transaction, Trader>
		List<Transaction> c2 = transactions.stream() // Stream<Transaction>
				.filter(transaction -> transaction.getValue() > 300)
				.sorted(Comparator.comparing(transaction -> transaction.getTrader().getCity()))
				.collect(Collectors.toList());
		
		c2.forEach(System.out::println);
		
		// 3. What are all the unique cities where the traders work?
		traders.stream()
			   .map(Trader::getCity)
			   .collect(Collectors.toSet())
			   .forEach(System.out::println);
		
		// Trader: id, name, city
		// Transaction: trader, year, value
		// 4. Find all traders from Cambridge and sort them by name desc.
		traders.stream()
			   .filter(trader -> "Cambridge".equals(trader.getCity()))
			   .sorted(Comparator.comparing(Trader::getName, Comparator.reverseOrder()))
			   .forEach(System.out::println);
		
		// 5. Return a string of all traders’ names sorted alphabetically
		String tranderNames = traders.stream()
		       .map(Trader::getName) // Stream<String>
		       .sorted()
		       .collect(Collectors.joining(", "));
		System.out.println("trader's names: " + tranderNames);
		
		// 6. Are any traders based in Milan
		boolean isMilanBased = traders.stream()
			   .anyMatch(trader -> "Milan".equals(trader.getCity()));
		System.out.println("isMilanBased: " + isMilanBased);
		
		// 7. Count the number of traders in Milan
		long count = traders.stream()
			   .filter(trader -> "Milan".equals(trader.getCity()))	// Predicate<T>
			   .count();
		System.out.println("traders in Milan: " + count);
		
		// 8. Print all transactions’ values from the traders living in Cambridge
		transactions.stream() // Stream<Transaction>
				    .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
				    .forEach(transaction -> System.out.println(transaction.getValue()));
		
		// 9. What’s the highest value of all the transactions
		int highestTransactionValue = transactions.stream()
		            .map(Transaction::getValue)
		            .reduce(Integer.MIN_VALUE, Math::max);
		System.out.println("highestTransactionValue: " + highestTransactionValue);
		
		// 10. Find the transaction with the smallest value.
		int smallestTransactionValue = transactions.stream()
	            .map(Transaction::getValue)
	            .reduce(Integer.MIN_VALUE, Math::min);
		System.out.println("smallestTransactionValue: " + smallestTransactionValue);
		
	}
}
