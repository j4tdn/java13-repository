package functional;

import bean.Apple;

public class LightWeightApplePredicate2 implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() < 150;
	}

}
