package com.demo.hibernateannotations;


public class Employee {
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	public Employee() {
	}

	public Employee(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() {
		return "Employee: " + this.id + ", " + this.name + ", " + this.age; 
	}
	
}
