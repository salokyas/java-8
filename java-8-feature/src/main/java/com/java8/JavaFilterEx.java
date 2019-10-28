package com.java8;

import java.util.ArrayList;
import java.util.List;

import com.java8.bean.Employee;

public class JavaFilterEx {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Sandip", "Java"));
		employees.add(new Employee(2, "Kali", ".net"));
		employees.add(new Employee(3, "Jitendra", "c++"));
		
		Employee employee = employees.stream()
									.filter(JavaFilterEx::filterCondition)
									.findAny()
									.orElse(null);
		
		System.out.println(employee);
		String s="abc";
		//String k= s.
		
	}

	private static boolean filterCondition(Employee i) {
		return "kali".equalsIgnoreCase(i.getName()) && i.getDept().equalsIgnoreCase(".net");
	}
}
