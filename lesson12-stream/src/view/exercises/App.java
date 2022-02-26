package view.exercises;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class App {
	public static void main(String[] args) {
		List<Transaction> listTran = DataModel.getTransactions();
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> TranY2011 = listTran.stream()
							.filter(trans -> trans.getYear() == 2011)
							.sorted(Comparator.comparing(Transaction::getYear))
							.collect(Collectors.toList());
		TranY2011.forEach(System.out::println);
		
		// 2 Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> T2 = listTran.stream()
				.filter(trans -> trans.getValue() > 2011)
				.collect(Collectors.toList());
		T2.forEach(System.out::println);
		
		// What are all the unique cities where the traders work?
//		List<Trader> resultList = listTran.stream()
//				.filter(distinctByKey(Trader::getCity))
//				.collect(Collectors.toList());		
//			resultList.forEach(System.out::println);
	}
	
	private static <C, P>Predicate<C> distinctByKey(Function<C, P> function){
		Set<P> set = new HashSet<>();
		return trader -> set.add(function.apply(trader));
	}
	
}
