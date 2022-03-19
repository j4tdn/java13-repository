package view;

import java.util.HashMap;
import java.util.Map;

import bean.Age;
import bean.SleepHour;

public class Ex02 {
	public static void main(String[] args) {
		Map<Age, SleepHour> data = mockData();
		
		
	}
	
	private static Map<Age, SleepHour> mockData() {
		Map<Age, SleepHour> data = new HashMap<>();
		data.put(new Age(1, 3), new SleepHour(20, 20));
		data.put(new Age(4, 13), new SleepHour(10, 12));
		data.put(new Age(14, 17), new SleepHour(8, 10));
		data.put(new Age(18, 64), new SleepHour(7, 9));
		data.put(new Age(65, 65), new SleepHour(7, 8));
		return data;
	}
	
	private static getTimeWakeUp(Map<Age, SleepHour> data, Age) {
		
	}
}
