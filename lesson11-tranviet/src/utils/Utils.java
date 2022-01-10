package utils;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ex02.Disk;

public class Utils {
	private Utils() {

	}

	public static <T> void printAll(List<T> items) {
		for (T item : items) {
			System.out.println(item);
		}
	}

	public static double getTotalPrice(List<Disk> disks) {
		double sum = 0;
		for (Disk disk : disks) {
			sum += disk.getPrice();
		}
		return sum;
	}
	
	public static <T, U> void printMap(Map<T, U> items) {
		Set<Entry<T, U>> entries = items.entrySet();
		for(Entry<T, U> entry : entries) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}
