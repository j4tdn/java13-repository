package functional;

import bean.Apple;

public class HevyWeightApplePredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}

}
