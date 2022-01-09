package model;

import java.util.Arrays;
import java.util.List;

import bean.Apple;

public class AppleModel {
	private AppleModel() {
		
	}
	public static List<Apple> getAll() {
        // new ArrayList<>() >>> add(...) >> return dynamic-size ArrayList
        // Arrays.asList >> return fixed-size ArrayList
        return Arrays.asList(
                new Apple(1, "green", 200, "Vietnam"),
                new Apple(16, "green", 300, "Vietnam"),
                new Apple(22, "red", 300, "Lao"),
                new Apple(4, "yellow", 400, "Thailand"),
                new Apple(17, "red", 600, "Vietnam"),
                new Apple(6, "green", 100, "Thailand")
        );
    }
}
