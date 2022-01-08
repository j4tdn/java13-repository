package functional;

import bean.Apple;

public class RedApplePredicate implements ApplePredicate{
	@Override
	public boolean test(Apple apple) {
		return "red".equals(apple.getColor());
	}
}