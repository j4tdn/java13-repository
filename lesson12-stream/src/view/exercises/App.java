package view.exercises;

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
		
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> op1 = transactions.stream()
									.filter(t -> t.getYear() == 2011)
									.sorted(Comparator.comparing(Transaction::getValue))
									.collect(Collectors.toList());
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
		op1.forEach(System.out::println);
		
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> op2 = transactions.stream()
				.filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing(transaction -> transaction.getTrader().getCity()))
				.collect(Collectors.toList());
		System.out.println("======================");
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
		op2.forEach(System.out::println);
		
		//3. What are all the unique cities where the traders work?
		List<String> op3 = traders.stream()
			.map(Trader::getCity)
			.distinct()
			.collect(Collectors.toList());
		System.out.println("======================");
		System.out.println("3. What are all the unique cities where the traders work?");
		op3.forEach(System.out::println);
		
		//4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> op4 = traders.stream()
			.filter(c -> "Cambridge".equals(c.getCity()))
			.sorted(Comparator.comparing(Trader::getName,Comparator.reverseOrder()))
			.collect(Collectors.toList());
		System.out.println("=====================");
		System.out.println("4. Find all traders from Cambridge and sort them by name desc.");
		op4.forEach(System.out::println);
		
		//5. Return a string of all traders’ names sorted alphabetically.
		String op5 = traders.stream()
						.sorted(Comparator.comparing(Trader::getName))
						.map(Trader::getName)
						.collect(Collectors.joining(", "));
		System.out.println("=====================");
		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
		System.out.println(op5);
		
		//6. Are any traders based in Milan?
		boolean op6 = traders.stream()
						.anyMatch(trader -> "Milan".equals(trader.getCity()));
		System.out.println("=====================");
		System.out.println("6. Are any traders based in Milan?");
		System.out.println(op6);
		
		//7. Count the number of traders in Milan.
		long op7 = traders.stream()
			.filter(trader -> "Milan".equals(trader.getCity()))
			.count();
		System.out.println("=====================");
		System.out.println("7. Count the number of traders in Milan.");
		System.out.println(op7);
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		List<Integer> op8 = transactions.stream()	
			.filter(transaction ->"Cambridge".equals(transaction.getTrader().getCity()))
			.map(Transaction::getValue)
			.collect(Collectors.toList());
		System.out.println("=====================");
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");
		System.out.println(op8);
		
		//9. What’s the highest value of all the transactions?
		Optional<Integer> op9 = transactions.stream()
				.map(Transaction::getValue)		
				.reduce((v1, v2) -> v1 > v2 ? v1 : v2);
			
		System.out.println("=====================");
		System.out.println("9. What’s the highest value of all the transactions?");
		System.out.println(op9);
			
		
		//10. Find the transaction with the smallest value.
		
	}
}
