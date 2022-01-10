package ex05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class App {
	public static void main(String[] args) {
		Map<String, Double> data = mockData();
		
		Map<String, Double> getData = Utils.get(data, entry -> entry.getValue() > 500);
		print(data);
		
		System.out.println("=================");
		System.out.println("Các khoản chi lớn hơn 500: ");
		print(getData);
		
		System.out.println("=================");
		System.out.println("Sắp xếp các khoản chi theo thứ tự giảm dần bởi số tiền(value): ");
		print(Utils.sort(data));
	}
	
	private static Map<String, Double> mockData(){
		Map<String, Double> data = new HashMap<>();
		
		data.put("Tiền Ăn", 350.0);
		data.put("Tiền Nhà", 1000.50);
		data.put("Tiền Điện", 550.0);
		data.put("Tiền Học Phí", 250.0);
		data.put("Tiền Xăng Xe", 150.0);
		data.put("Tiền Điện Thoại", 1550.0);
		
		return data;
	}
	
	private static void print(Map<String, Double> data) {
		Set<Entry<String, Double>> entries = data.entrySet();
		for(Entry<String, Double> entry: entries) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	
}
