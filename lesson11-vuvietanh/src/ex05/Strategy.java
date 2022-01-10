package ex05;

import java.util.Map.Entry;

@FunctionalInterface
public interface Strategy {
	boolean check (Entry<String, Double> entry);
}
