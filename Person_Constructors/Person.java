package com.nissan.bean;

public class Person {
	private String name;
	private int age;
	private float salary;
	
	public Person() {}
	
	public Person(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Age: "+age);
		System.out.println("Employee Salary: "+salary);
	}
}
