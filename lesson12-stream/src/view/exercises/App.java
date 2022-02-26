package view.exercises;

import java.util.Comparator;
import java.util.List;
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
		List<Trader> op2 = transactions.stream()
				.filter(t -> t.getValue() > 300)
				.map(Transaction::getTrader)
				.sorted(Comparator.comparing(Trader::getCity))
				.collect(Collectors.toList());
		System.out.println("======================");
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
		op2.forEach(System.out::println);
		
		//3. What are all the unique cities where the traders work?
		List<String> op3 = transactions.stream()
			.map(Transaction::getTrader)
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
	}
}
