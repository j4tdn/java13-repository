package view.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

/*
 * 	1. Find all transactions in the year 2011 and sort them by value (small to high).
	2. Find all transactions have value greater than 300 and sort them by trader’s city
	3. What are all the unique cities where the traders work?
	4. Find all traders from Cambridge and sort them by name desc.
	5. Return a string of all traders’ names sorted alphabetically.
	6. Are any traders based in Milan?
	7. Count the number of traders in Milan.
	8. Print all transactions’ values from the traders living in Cambridge.
	9. What’s the highest value of all the transactions?
	10. Find the transaction with the smallest value.
 */
public class App {
	public static void main(String[] args) {
		List<Transaction> transactions = DataModel.getTransactions();
		List<Trader> traders = DataModel.getTraders();
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> rq1 = transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		log(rq1);

		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> rq2 = transactions.stream().filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing(t -> t.getTrader().getCity())).collect(Collectors.toList());
		log(rq2);

		// 3. What are all the unique cities where the traders work?
		List<String> rq3 = traders.stream().map(Trader::getCity).distinct().collect(Collectors.toList());
		log(rq3);

		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> rq4 = traders.stream().filter(t -> "Cambridge".equals(t.getCity()))
				.sorted(Comparator.comparing(Trader::getName, Comparator.reverseOrder())).collect(Collectors.toList());
		log(rq4);

		// 5. Return a string of all traders’ names sorted alphabetically.
		String name = traders.stream().sorted(Comparator.comparing(Trader::getName)).map(Trader::getName)
				.collect(Collectors.joining(", "));
		System.out.println("name: " + name);
		System.out.println("===================================");
		
		// 6. Are 0.any traders based in Milan?
		System.out.println(
				"Are any traders based in Milan? : " + traders.stream().anyMatch(t -> "Milan".equals(t.getCity())));

		// 7. Count the number of traders in Milan.
		long count = traders.stream().filter(t -> "Milan".equals(t.getCity())).count();
		System.out.println("Number of traders in Milan: " + count);
		System.out.println("===================================");

		// 8. Print all transactions’ values from the traders living in Cambridge.
		List<Integer> values = transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity()))
				.map(Transaction::getValue).collect(Collectors.toList());
		log(values);
		
		// 9. What’s the highest value of all the transactions? (REDUCE)
//		int highestValue = transactions.stream().reduce(transactions.get(0), (t1, t2) -> t1.getValue() > t2.getValue() ? t1 : t2).getValue();
		int highestValue = transactions.stream().map(Transaction::getValue).reduce(Integer.MIN_VALUE, Math::max);
		System.out.println("highest value of all the transactions: " + highestValue);
		
		// 10. Find the transaction with the smallest value.
		int smallestValue = transactions.stream().map(Transaction::getValue).reduce(Integer.MIN_VALUE, Math::min);
		System.out.println("smallest value of all the transactions: " + smallestValue);

		
		
// 		Transaction::getTrader <=> Function<Transaction, Trader>
//		Function<Transaction, Trader> f0 = Transaction::getTrader;
//		Function<Trader, String> f1 = Trader::getCity;
//		Function<Transaction, String> fn = f0.andThen(f1);
	}

	public static <T> void log(List<T> things) {
		for (T thing : things) {
			System.out.println(thing);
		}
		System.out.println("=============================");
	}
}
