package com.collections.set;

import java.util.HashSet;
import java.util.Set;

import bean.Employee;

public class Ex02 {
	public static void main(String[] args) {
		Set<Employee> teams = mockData();
		System.out.println("size: " + teams.size());
		System.out.println(teams);
	}

	private static Set<Employee> mockData() {
		Set<Employee> teams = new HashSet<>();
		teams.add(new Employee(1, "John", 100, null));
		teams.add(new Employee(1, "Smith", 150, null));
		teams.add(new Employee(1, "Andy", 200, null));
		//hash code, equals
		teams.add(new Employee(1, "John", 100, null));
		return teams;
	}
}
