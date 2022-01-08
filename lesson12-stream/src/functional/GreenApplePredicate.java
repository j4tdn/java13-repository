package functional;

import bean.Apple;

public class GreenApplePredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		return "green".equalsIgnoreCase(apple.getColor());
	}

}
