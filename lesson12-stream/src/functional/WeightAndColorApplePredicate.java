package functional;

import bean.Apple;

public class WeightAndColorApplePredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return "red".equalsIgnoreCase(apple.getColor()) && apple.getWeight() > 400;
	}

}
