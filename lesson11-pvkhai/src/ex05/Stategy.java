package ex05;

import java.util.Map.Entry;

@FunctionalInterface
public interface Stategy {
	boolean check(Entry<String, Double> entry);
}
