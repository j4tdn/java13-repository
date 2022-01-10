package ex05;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App {
	public static void main(String[] args) {
		Map<String, Double> result = getData();
		
		Map<String, Double> order500 = filter(result,entry-> entry.getValue() > 500 );
		//map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		order500.forEach((k,v)->System.out.println("Key : " + k  +" - " + " Price : " + v));
		
		
	}
	
	private static Map<String, Double> filter(Map<String, Double> list, Strategy strategy){
		Map<String, Double> result = new HashMap<>();
		for(Entry<String, Double>entry : list.entrySet()) {
			if(strategy.check(entry) ) {
				result.put(entry.getKey(), entry.getValue());
			}
		}
		return result;
	}
	
	private static Map<String, Double> getData(){
		Map<String, Double> result = new HashMap<>();
		result.put("Tiền xăng", 100d);
		result.put("Tiền nhậu", 200d);
		result.put("Tiền mua đồ tết", 600d);
		result.put("Tiền độ xe", 800d);
		
		return result;
	}
	
}
