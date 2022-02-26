package view.exercies;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;


import static java.util.Comparator.*;

public class App {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
	
	// 1. Find all transactions in the year 2011 and sort them by value (small to
	// high).
		System.out.println("============Ex01============");
		transactions.stream().filter(p -> p.getYear() == 2011).sorted(comparing(Transaction::getValue))
				.forEach(System.out::println);
		
		// 2. Find all transactions have value greater than 300 and sort them by
				// trader’s city
				System.out.println("============Ex02============");
				transactions.stream().filter(p -> (p.getValue() >= 300))
						.sorted((a, b) -> a.getTrader().getCity().compareTo(b.getTrader().getCity()))
						.forEach(System.out::println);
	}


}