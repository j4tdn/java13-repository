package functional;

import bean.Apple;

public class WeightAndColorPredicate implements ApplePredicate {
	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150 && "green".equals(apple.getColor());
	}
	
}
