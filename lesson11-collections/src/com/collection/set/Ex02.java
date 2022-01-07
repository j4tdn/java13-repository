package com.collection.set;

import java.util.HashSet;
import java.util.Set;

import bean.Employee;

public class Ex02 {
	public static void main(String[] args) {
		Set<Employee> team = mockEmployees();
		System.out.println("size: " + team.size());
		System.out.println(team);
	}
	
	private static Set<Employee> mockEmployees() {
		Set<Employee> team = new HashSet<>();
		team.add(new Employee(1, "John", 100, null));
		team.add(new Employee(2, "Smith", 150, null));
		team.add(new Employee(3, "Andy", 200, null));
		
		// override hash code, equals
		team.add(new Employee(2, "Smith", 150, null));
		return team;
	}
}
