package functional;

import bean.Apple;

public class WeightPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 400;
	}
	
}
