package utils;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ex02.Disk;
import ex04.Vocab;

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
	
	public static <T, U> void printMap(Map<T, U> vocabs) {
		Set<Entry<T, U>> setVocabs = vocabs.entrySet();
		for(Entry<T, U> setVocab : setVocabs) {
			System.out.println(setVocab.getKey() + " => " + setVocab.getValue());
		}
	}
}
