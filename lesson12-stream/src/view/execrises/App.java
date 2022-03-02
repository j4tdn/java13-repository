package view.execrises;

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
		
		//1-> transaction 2011 and sorted
		List<Transaction> rs = transactions.stream()
				  .filter(transaction -> transaction.getYear()== 2011)
				  .sorted(Comparator.comparing(transaction -> transaction.getValue()))
				  								//Transaction::getValue 
				  .collect(Collectors.toList());
		System.out.print("1:");
		rs.forEach(System.out::println);
		System.out.println();
					
		//2-> transaction value >300 sort
		List<Transaction> rs2 = transactions.stream()
				  .filter(transaction -> transaction.getValue() > 300)
				  .sorted(Comparator.comparing(transaction->transaction.getTrader().getCity()))				  								
				  .collect(Collectors.toList());
		System.out.print("2:");
		rs2.forEach(System.out::println);
		System.out.println();
		
		//3->What are all the unique cities where the traders work
		
		List<String> rs3 = traders.stream()
				.map(Trader::getCity)
				.distinct()
				.collect(Collectors.toList());
		System.out.print("3:");
		rs3.forEach(System.out::println);
		System.out.println();
		
		//4-> Find all traders from Cambridge and sort them by name desc.
		List<Trader> rs4 = traders.stream()
				.filter(c -> "Cambridge".equals(c.getCity()))
				.sorted(Comparator.comparing(Trader::getName,Comparator.reverseOrder()))
				.collect(Collectors.toList());
		System.out.println("4:");
		rs4.forEach(System.out::println);
		System.out.println();
		
		//5-> Return a string of all traders’ names sorted alphabetically   
		List<String> rs5 = traders.stream()
				.map(Trader::getName)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("5:");
		rs5.forEach(System.out::println);
		System.out.println();
		
		//6-> Are any traders based in Milan? 
		
		boolean rs6 = traders.stream()
				   .anyMatch(trader -> trader.getCity().equals("Milan"));
		if (rs6) {
			System.out.println("6: YES");
		}
		else{
			System.out.println("6: NO");
		}
		
		//7->  Count the number of traders in Milan.
		
		//8-> Print all transactions’ values from the traders living in Cambridge.
		List<Transaction> rs8 = transactions.stream()
				.filter(transaction->transaction.getTrader().getCity().equals("Cambridge"))			  								
				.collect(Collectors.toList());
		System.out.println("8:");
		rs4.forEach(System.out::println);
		System.out.println();
		
		
		//9-> What’s the highest value of all the transactions?
	}
}
