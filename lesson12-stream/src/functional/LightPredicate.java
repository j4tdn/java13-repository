package functional;

import bean.Apple;

public class LightPredicate implements ApplePredicate{
	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() < 150;
	}
	
}
