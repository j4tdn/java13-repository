package view.exercise;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class App {
	
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> ex01 = transactions.stream()
											 .filter(transaction -> transaction.getYear() == 2011)
											 .sorted(Comparator.comparing(Transaction::getValue))
											 .collect(Collectors.toList());
		ex01.forEach(System.out::println);
		
		System.out.println("=====================================================");
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> ex02 = transactions.stream()
											 .filter(transaction -> transaction.getValue() > 300)
											 .sorted(Comparator.comparing(transaction -> transaction.getTrader().getCity()))
											 .collect(Collectors.toList());
		ex02.forEach(System.out::println);
		
		System.out.println("=====================================================");
		
		// 3. What are all the unique cities where the traders work?
		List<String> ex03 = traders.stream()
			   .map(Trader::getCity)
			   .distinct()
			   .collect(Collectors.toList());
		ex03.forEach(System.out::println);
		
		System.out.println("=====================================================");
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> ex04 = traders.stream()
								   .filter(trader -> "Cambridge".equals(trader.getCity()))
								   .sorted(Comparator.comparing(Trader::getName, Comparator.reverseOrder()))
								   .collect(Collectors.toList());
		ex04.forEach(System.out::println);
		
		System.out.println("=====================================================");
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		List<String> ex05 = traders.stream()
								   .map(Trader::getName)
								   .sorted()
								   .collect(Collectors.toList());
		ex05.forEach(System.out::println);
		
		System.out.println("=====================================================");
		
		// 6. Are any traders based in Milan?
		
		boolean ex06 = traders.stream()
								   .anyMatch(trader -> "Milan".equals(trader.getCity()));
		System.out.println("Are any traders based in Milan ? " + ex06);
		
		System.out.println("=====================================================");
		
		// 7. Count the number of traders in Milan.
		long ex07 = traders.stream()
			   .filter(trader -> "Milan".equals(trader.getCity()))
			   .count();
		System.out.println("Count the number of traders in Milan: " + ex07);
		
		System.out.println("=====================================================");
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		List<Integer> ex08 = transactions.stream()
					.filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
					.map(transaction -> transaction.getValue())
					.collect(Collectors.toList());
		ex08.forEach(System.out::println);				   
		
		System.out.println("=====================================================");
		
		// 9.What’s the highest value of all the transactions?
		Optional<Integer> ex09 = transactions.stream()
					.map(transaction -> transaction.getValue())
					.reduce(Integer::max);
		if(ex09.isPresent()) System.out.println(ex09);
		
		System.out.println("=====================================================");
		
		// 10.Find the transaction with the smallest value.
		Optional<Integer> ex10 = transactions.stream()
				.map(transaction -> transaction.getValue())
				.reduce(Integer::min);
		if(ex10.isPresent()) System.out.println(ex10);
	}
}
