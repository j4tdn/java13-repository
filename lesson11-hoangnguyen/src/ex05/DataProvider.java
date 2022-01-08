package ex05;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {
	private DataProvider() {}
	
	public static Map<String, Double> getData() {
		Map<String, Double> list = new HashMap<>();
		list.put("cafe", 350000d);
		list.put("dinner", 2000000d);
		list.put("drinking", 1500000d);
		list.put("smoking", 400000d);
		
		return list;
	}
}
