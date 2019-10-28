package com.java8.bean;

public class Employee {

	private int id;
	private String name;
	private String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
