package ex05;

import java.util.Collection;
import static ex05.Utils.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> useMoney = new TreeMap<>();

		useMoney.put("Dien", 2000000);
		useMoney.put("Nuoc", 600000);
		useMoney.put("An", 300000);
		useMoney.put("Hoc phi", 9000000);
		useMoney.put("Shoppe", 60000);
		useMoney.put("Mua Tivi", 10000000);
		useMoney.put("Dam cuoi", 500000);
		useMoney.put("Sinh nhat", 8000000);
		
		print(listCost(useMoney));
		System.out.println("==============");
		print(sort(useMoney, Entry.comparingByKey()));
		System.out.println("==============");
		print(sort(useMoney, Entry.comparingByValue()));
		
	}

	

}

