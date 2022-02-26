package view.execrises;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
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
		System.out.println("1: "+rs);
					
		//2-> transaction value >300 sort
		List<Transaction> rs2 = transactions.stream()
				  .filter(transaction -> transaction.getValue() > 300)
				  .sorted(Comparator.comparing(transaction->transaction.getTrader().getCity()))
				  .collect(Collectors.toList());
		System.out.println("2: "+rs2);
		
		
											
	}
}
