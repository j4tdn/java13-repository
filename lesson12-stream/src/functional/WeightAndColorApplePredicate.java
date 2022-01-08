package functional;

import bean.Apple;

public class WeightAndColorApplePredicate implements ApplePredicate{
	@Override
	public boolean test(Apple apple) {
		return "green".equals(apple.getColor()) && apple.getWeight() > 400;
	}
}
